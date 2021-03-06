/*******************************************************************************
 * Copyright (c) 2017 Inria and Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecoretools.ale.core.validation;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.acceleo.query.ast.Expression;
import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.acceleo.query.runtime.IValidationMessage;
import org.eclipse.acceleo.query.validation.type.IType;
import org.eclipse.emf.ecoretools.ale.core.diagnostics.Message;
import org.eclipse.emf.ecoretools.ale.core.env.IAleEnvironment;
import org.eclipse.emf.ecoretools.ale.core.parser.ParsedFile;
import org.eclipse.emf.ecoretools.ale.implementation.Block;
import org.eclipse.emf.ecoretools.ale.implementation.ModelUnit;

import com.google.common.collect.Lists;

public class ALEValidator {
	
	private List<Message> msgs;
	private final IQueryEnvironment qryEnv;
	private final IAleEnvironment environment;
	
	public ALEValidator(IAleEnvironment environment) {
		this.environment = environment;
		this.qryEnv = environment.getContext();
	}
	
	public void validate(List<ParsedFile<ModelUnit>> roots) {
		List<IValidator> validators = Lists.newArrayList(new NameValidator(), new TypeValidator(), new OpenClassValidator());
		BaseValidator base = new BaseValidator(environment, validators);
		msgs = base.validate(roots);
	}
	
	public List<Message> getMessages() {
		return msgs;
	}
	
	public Map<String, Set<IType>> getValidationContext(Expression exp, List<ParsedFile<ModelUnit>> roots) {
		List<IValidator> validators = Lists.newArrayList(new NameValidator(), new TypeValidator(), new OpenClassValidator());
		BaseValidator base = new BaseValidator(environment, validators);
		msgs = base.validate(roots);
		return base.getValidationContext(exp);
	}
	
	public Map<String, Set<IType>> getValidationContext(Block block, List<ParsedFile<ModelUnit>> roots) {
		List<IValidator> validators = Lists.newArrayList(new NameValidator(), new TypeValidator(), new OpenClassValidator());
		BaseValidator base = new BaseValidator(environment, validators);
		msgs = base.validate(roots);
		return base.getValidationContext(block);
	}
}
