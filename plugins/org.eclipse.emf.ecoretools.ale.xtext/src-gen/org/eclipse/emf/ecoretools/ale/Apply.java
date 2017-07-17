/**
 * ******************************************************************************
 * Copyright (c) 2017 Inria and Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  *
 * Contributors:
 *     Inria - initial API and implementation
 *  *
 * generated by Xtext 2.10.0
 *  ******************************************************************************
 */
package org.eclipse.emf.ecoretools.ale;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.ecoretools.ale.Apply#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.ecoretools.ale.Apply#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecoretools.ale.Apply#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecoretools.ale.Apply#getVarType <em>Var Type</em>}</li>
 *   <li>{@link org.eclipse.emf.ecoretools.ale.Apply#getLambda <em>Lambda</em>}</li>
 *   <li>{@link org.eclipse.emf.ecoretools.ale.Apply#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.ecoretools.ale.AlePackage#getApply()
 * @model
 * @generated
 */
public interface Apply extends Expression
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Expression)
   * @see org.eclipse.emf.ecoretools.ale.AlePackage#getApply_Target()
   * @model containment="true"
   * @generated
   */
  Expression getTarget();

  /**
   * Sets the value of the '{@link org.eclipse.emf.ecoretools.ale.Apply#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Expression value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.ecoretools.ale.AlePackage#getApply_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.ecoretools.ale.Apply#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see org.eclipse.emf.ecoretools.ale.AlePackage#getApply_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.ecoretools.ale.Apply#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

  /**
   * Returns the value of the '<em><b>Var Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Type</em>' containment reference.
   * @see #setVarType(typeLiteral)
   * @see org.eclipse.emf.ecoretools.ale.AlePackage#getApply_VarType()
   * @model containment="true"
   * @generated
   */
  typeLiteral getVarType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.ecoretools.ale.Apply#getVarType <em>Var Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Type</em>' containment reference.
   * @see #getVarType()
   * @generated
   */
  void setVarType(typeLiteral value);

  /**
   * Returns the value of the '<em><b>Lambda</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lambda</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lambda</em>' containment reference.
   * @see #setLambda(Expression)
   * @see org.eclipse.emf.ecoretools.ale.AlePackage#getApply_Lambda()
   * @model containment="true"
   * @generated
   */
  Expression getLambda();

  /**
   * Sets the value of the '{@link org.eclipse.emf.ecoretools.ale.Apply#getLambda <em>Lambda</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lambda</em>' containment reference.
   * @see #getLambda()
   * @generated
   */
  void setLambda(Expression value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecoretools.ale.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.eclipse.emf.ecoretools.ale.AlePackage#getApply_Params()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParams();

} // Apply