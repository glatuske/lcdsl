/**
 * generated by Xtext 2.10.0
 */
package com.wamas.ide.launching.lcDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vm Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.VmArgument#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getVmArgument()
 * @model
 * @generated
 */
public interface VmArgument extends EObject
{
  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.StringWithVariables}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getVmArgument_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<StringWithVariables> getArguments();

} // VmArgument