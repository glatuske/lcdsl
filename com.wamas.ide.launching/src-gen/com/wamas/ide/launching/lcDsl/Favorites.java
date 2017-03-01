/**
 * generated by Xtext 2.10.0
 */
package com.wamas.ide.launching.lcDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Favorites</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.Favorites#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getFavorites()
 * @model
 * @generated
 */
public interface Favorites extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' attribute list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.LaunchModeType}.
   * The literals are from the enumeration {@link com.wamas.ide.launching.lcDsl.LaunchModeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' attribute list.
   * @see com.wamas.ide.launching.lcDsl.LaunchModeType
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getFavorites_Types()
   * @model unique="false"
   * @generated
   */
  EList<LaunchModeType> getTypes();

} // Favorites