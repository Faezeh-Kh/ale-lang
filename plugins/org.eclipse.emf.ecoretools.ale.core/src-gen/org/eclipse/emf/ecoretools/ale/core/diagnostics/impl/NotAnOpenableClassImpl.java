/**
 */
package org.eclipse.emf.ecoretools.ale.core.diagnostics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecoretools.ale.core.diagnostics.DiagnosticsPackage;
import org.eclipse.emf.ecoretools.ale.core.diagnostics.NotAnOpenableClass;

import org.eclipse.emf.ecoretools.ale.implementation.ExtendedClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not An Openable Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.ecoretools.ale.core.diagnostics.impl.NotAnOpenableClassImpl#getOpenClass <em>Open Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotAnOpenableClassImpl extends MessageImpl implements NotAnOpenableClass {
	/**
	 * The cached value of the '{@link #getOpenClass() <em>Open Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenClass()
	 * @generated
	 * @ordered
	 */
	protected ExtendedClass openClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotAnOpenableClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagnosticsPackage.Literals.NOT_AN_OPENABLE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtendedClass getOpenClass() {
		if (openClass != null && openClass.eIsProxy()) {
			InternalEObject oldOpenClass = (InternalEObject)openClass;
			openClass = (ExtendedClass)eResolveProxy(oldOpenClass);
			if (openClass != oldOpenClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagnosticsPackage.NOT_AN_OPENABLE_CLASS__OPEN_CLASS, oldOpenClass, openClass));
			}
		}
		return openClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedClass basicGetOpenClass() {
		return openClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenClass(ExtendedClass newOpenClass) {
		ExtendedClass oldOpenClass = openClass;
		openClass = newOpenClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticsPackage.NOT_AN_OPENABLE_CLASS__OPEN_CLASS, oldOpenClass, openClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagnosticsPackage.NOT_AN_OPENABLE_CLASS__OPEN_CLASS:
				if (resolve) return getOpenClass();
				return basicGetOpenClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagnosticsPackage.NOT_AN_OPENABLE_CLASS__OPEN_CLASS:
				setOpenClass((ExtendedClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagnosticsPackage.NOT_AN_OPENABLE_CLASS__OPEN_CLASS:
				setOpenClass((ExtendedClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagnosticsPackage.NOT_AN_OPENABLE_CLASS__OPEN_CLASS:
				return openClass != null;
		}
		return super.eIsSet(featureID);
	}

} //NotAnOpenableClassImpl
