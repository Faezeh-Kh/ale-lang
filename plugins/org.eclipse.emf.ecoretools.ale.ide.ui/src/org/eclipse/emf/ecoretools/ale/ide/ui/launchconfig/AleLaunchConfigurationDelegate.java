/*******************************************************************************
 * Copyright (c) 2017-2019 Inria and Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecoretools.ale.ide.ui.launchconfig;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.eclipse.emf.ecoretools.ale.ide.ui.launchconfig.AleLaunchConfiguration.BEHAVIORS_PATH;
import static org.eclipse.emf.ecoretools.ale.ide.ui.launchconfig.AleLaunchConfiguration.MAIN_METHOD;
import static org.eclipse.emf.ecoretools.ale.ide.ui.launchconfig.AleLaunchConfiguration.MAIN_MODEL_ELEMENT;
import static org.eclipse.emf.ecoretools.ale.ide.ui.launchconfig.AleLaunchConfiguration.METAMODELS_PATH;
import static org.eclipse.emf.ecoretools.ale.ide.ui.launchconfig.AleLaunchConfiguration.MODEL_FILE;
import static org.eclipse.emf.ecoretools.ale.ide.ui.launchconfig.UiUtils.getDisplay;
import static org.eclipse.emf.ecoretools.ale.ide.ui.launchconfig.UiUtils.getShell;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecoretools.ale.core.env.IAleEnvironment;
import org.eclipse.emf.ecoretools.ale.core.env.IBehaviors;
import org.eclipse.emf.ecoretools.ale.ide.env.WithAbsoluteBehaviorPathsAleEnvironment;
import org.eclipse.emf.ecoretools.ale.ide.ui.Activator;
import org.eclipse.emf.ecoretools.ale.implementation.BehavioredClass;
import org.eclipse.emf.ecoretools.ale.implementation.ExtendedClass;
import org.eclipse.emf.ecoretools.ale.implementation.Method;
import org.eclipse.emf.ecoretools.ale.implementation.RuntimeClass;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * Responsible of launching ALE scripts. 
 */
public class AleLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		// AleEvaluationJob is responsible for closing the interpreter,
		// that's why try-with-resource is not used here
		@SuppressWarnings("squid:S2095")
		IAleEnvironment environment = null;
		try {
			String modelLocation = configuration.getAttribute(MODEL_FILE, "");
			String mainMethod = configuration.getAttribute(MAIN_METHOD, "");
			String mainModelElement = configuration.getAttribute(MAIN_MODEL_ELEMENT, "");
			List<String> behaviorsPath = asList(configuration.getAttribute(BEHAVIORS_PATH, "").split(","));
			List<String> metamodelsPath = asList(configuration.getAttribute(METAMODELS_PATH, "").split(","));
	
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IResource modelFile = workspace.getRoot().findMember(modelLocation);
			
			environment = new WithAbsoluteBehaviorPathsAleEnvironment(IAleEnvironment.fromPaths(metamodelsPath, behaviorsPath));

			// Determine the @main method & the element on which it should be called 
			//
			IBehaviors semantics = environment.getBehaviors();
			
			List<Method> potentialMains = getPotentialMains(semantics, mainMethod);
			List<EObject> potentialCallers = getPotentialCallers(environment, modelFile, mainModelElement);
			List<EvaluationArguments> potentialArgs = getPotentialEvaluationArguments(potentialCallers, potentialMains);
			
			if (! canRunAleInterpreter(potentialCallers, modelFile, potentialMains, behaviorsPath, potentialArgs)) {
				environment.close();
				return;
			}
			Optional<EvaluationArguments> args = getDefinitiveEvaluationArguments(potentialArgs);
			if (! args.isPresent()) {
				// The user didn't choose any couple -> implicit cancellation
				environment.close();
				return;
			}
			EvaluationArguments arguments = args.get();
			
			// Make sure all this work is saved for the next time
			//
			persistConfiguration(configuration, arguments);
			
			// Actually launch the interpreter (in background)
			//
			Job evaluation = new AleEvaluationJob(environment, arguments.mainElement, arguments.main, modelFile);
			evaluation.schedule();
		} 
		catch (Exception e) {
			Activator.error("An error occurred while launching ALE", e);
			getDisplay().asyncExec(() -> 
				MessageDialog.openError(
						getShell(), 
						"An error occurred while launching ALE", 
						e.getMessage() + "\n\nPlease check the Error Log view for more details."
				)
			);
			if (environment != null) {
				environment.close();
			}
		}
	}
	
	/** Arguments required to launch an ALE evaluation. */
	private static class EvaluationArguments {
		/**
		 * The <code>&#64;main</code> method to execute.
		 */
		Method main;
		/**
		 * The element on which the main method should be called.
		 */
		BehavioredClass caller;
		/**
		 * 
		 */
		EObject mainElement;
		
		public EvaluationArguments(BehavioredClass caller, Method call, EObject mainElement) {
			this.caller = caller;
			this.main = call;
			this.mainElement = mainElement;
		}
	}
	
	/**
	 * Persists the main element model and the main method to make sure they won't
	 * be asked again.
	 * 
	 * @param configuration
	 * 			The configuration in which the attributes should be saved
	 * @param args
	 * 			The arguments to save
	 * 
	 * @throws CoreException if something goes wrong
	 */
	private void persistConfiguration(ILaunchConfiguration configuration, EvaluationArguments args) throws CoreException {
		ILaunchConfigurationWorkingCopy workingCopy = configuration.getWorkingCopy();
		workingCopy.setAttribute(MAIN_METHOD, MethodRepresentation.of(args.main, null).toString());
		workingCopy.setAttribute(MAIN_MODEL_ELEMENT, "" + args.mainElement.eResource().getURIFragment(args.mainElement));
		workingCopy.doSave();
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///    EVALUATION ARGUMENTS-RELATED UTILITY FUNCTIONS /////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Determines all the elements contained by the given resource on which a <code>&#64;main</code> method 
	 * may be called.
	 * <p>
	 * If the resource contains an element with the URI {@code mainModelElementURI}, then only this element
	 * is returned. Otherwise, all the elements of the resource (and their children, recursively) are returned.
	 * 
	 * @param environment
	 * 			The environment that will be used to execute the program
	 * @param modelFile
	 * 			The resource containing the elements to inspect
	 * @param mainModelElementURI
	 * 			The URI of the element selected by the user, or an empty string if no choice has been made
	 * 
	 * @return the elements of the resource on which a <code>&#64;main</code> method may be called
	 * 
	 * @throws RuntimeException if an error occurs while reading the resource
	 */
	private List<EObject> getPotentialCallers(IAleEnvironment environment, IResource modelFile, String mainModelElementURI) {
		Resource resource = environment.loadResource(URI.createURI(modelFile.getLocationURI().toString()));

		if (!mainModelElementURI.isEmpty()) {
			EObject mainModelElement = resource.getEObject(mainModelElementURI);
			
			if (mainModelElement != null) {
				return asList(mainModelElement);
			}
			// A wrong input has been delivered; display a warning then fallback to default behavior
			Activator.warn(
					"Unable to find main model element with URI: " + mainModelElementURI + " in resource " + modelFile +
					"\nWill attempt to infer an available model element", 
					null
			);
		}
		Stream<EObject> allElements = StreamSupport.stream(
				Spliterators.spliteratorUnknownSize(resource.getAllContents(), 0),
				false
		);
		return allElements.collect(toList());
	}
	
	/**
	 * Determines all the methods of the given semantics that could be an entry point of the interpreter.
	 * <p>
	 * On the semantics contains a method {@link MethodRepresentation which representation} matches 
	 * {@code mainMethodId} then only this method is returned. Otherwise, all the methods annotated with
	 * <code>&#64;main</code> are returned.
	 * @param semantics
	 * 			The semantics of the DSL selected by the user
	 * @param mainMethodId
	 * 			The representation of the method selected by the user
	 * 
	 * @return the methods of the given semantics that could be an entry point of the interpreter
	 */
	private List<Method> getPotentialMains(IBehaviors semantics, String mainMethodId) {
		List<Method> mains = semantics.getMainMethods();
		if (! mainMethodId.isEmpty()) {
			for (Method main : mains) {
				MethodRepresentation repr = MethodRepresentation.of(main, null);
				if (repr.toString().equals(mainMethodId)) {
					return asList(main);
				}
			}
			// Should not happen; display a warning then fallback to default behavior
			Activator.warn(
				"Unable to find @main method: " + mainMethodId + ". Will attempt to infer an available @main method.", 
				null
			);
		}
		return mains;
	}
	
	/**
	 * Determines all the couples {@code (caller, main)} such as {@code main} is a method of {@code caller}.
	 * 
	 * @param callers
	 *			The elements on which a main methods may be called
	 * @param mains
	 * 			The methods that could be used as entry points of the interpreter
	 * @return
	 */
	private List<EvaluationArguments> getPotentialEvaluationArguments(List<EObject> callers, List<Method> mains) {
		List<EvaluationArguments> all = new ArrayList<>();
		
		for (EObject element : callers) {
			for (Method main : mains) {
				if (main.eContainer() instanceof ExtendedClass) {
					ExtendedClass extendedClass = (ExtendedClass) main.eContainer();
					if (EcoreUtil.equals(element.eClass(), extendedClass.getBaseClass())) {
						all.add(new EvaluationArguments(extendedClass, main, element));
					}					
				}
				else if (main.eContainer() instanceof RuntimeClass) {
					RuntimeClass runtimeClass = (RuntimeClass) main.eContainer();
					if (EcoreUtil.equals(element.eClass(), runtimeClass.eClass())) {
						all.add(new EvaluationArguments(runtimeClass, main, element));
					}
				}
			}
		}
		return all;
	}

	/**
	 * Returns the first item of {@code args} if it has only one, otherwise shows a dialog asking the user
	 * to choose one item.
	 * 
	 * @param args
	 * 			Available couple {@code (caller, main)}; expects args.size() >= 1
	 * 
	 * @return the selected item, or nothing if the user cancelled
	 */
	private Optional<EvaluationArguments> getDefinitiveEvaluationArguments(List<EvaluationArguments> args) {
		if (args.size() == 1) {
			return Optional.of(args.get(0));
		}
		else {
			return askUserToChooseAmong(args);
		}
	}
	
	/** Used to "return" a value computed within a lambda". */
	private static class DumbHolder {
		EvaluationArguments args;
	}
	
	private Optional<EvaluationArguments> askUserToChooseAmong(List<EvaluationArguments> args) {
		DumbHolder holder = new DumbHolder();
		
		getDisplay().syncExec(() -> {
			ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), new EvaluationArgumentsLabelProvider());
			dialog.setElements(args.toArray());
			dialog.setTitle("Unable to determine the @main method to execute");
			dialog.setMessage("Select the @main method and the element on which it should be called:");
			
			if (dialog.open() == Window.OK) {
				holder.args = (EvaluationArguments) dialog.getFirstResult();
			}
		});
		return Optional.ofNullable(holder.args);
	}
	
	/** Provides labels for {@link Method} instances. */
	private static class EvaluationArgumentsLabelProvider extends BaseLabelProvider implements ILabelProvider {

		@Override
		public Image getImage(Object element) {
			return null;
		}

		@Override
		public String getText(Object element) {
			EvaluationArguments args = (EvaluationArguments) element;
			return MethodRepresentation.of(args.main, args.caller, args.mainElement).toString();
		}
		
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///    VALIDATION-RELATED UTILITY FUNCTIONS ///////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	private boolean canRunAleInterpreter(List<EObject> callers, IResource modelFile, List<Method> mains, List<String> behaviors, List<EvaluationArguments> args) {
		if (mains.isEmpty()) {
			getDisplay().asyncExec(() -> 
				MessageDialog.openError(
						getShell(),
					"Cannot run ALE",
					"Unable to find any executable element in " + modelFile + ".\n\n"
				  + "Make sure that:\n"
				  + "    - the ALE source files open at least one of the EClass used in the model,\n"
				  + "    - the method to execute is annotated with @main."
				)
			);
			return false;
		}
		if (behaviors.isEmpty()) {
			getDisplay().asyncExec(() -> 
				MessageDialog.openError(
					getShell(),
					"Cannot run ALE",
					"Unable to find any @main method from " + behaviors + "."
				)
			);
			return false;
		}
		if (args.isEmpty()) {
			getDisplay().asyncExec(() -> 
				MessageDialog.openError(
					getShell(),
					"Cannot run ALE",
					"No @main method found for model's elements.\n\n"
				  + "Make sure that:\n"
				  + "    - the ALE source files open at least one of the EClass used in the model,\n"
				  + "    - the method to execute is annotated with @main."
				)
			);
			return false;
		}
		return true;
	}
	
}
