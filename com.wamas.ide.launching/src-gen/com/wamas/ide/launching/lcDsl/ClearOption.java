/**
 * generated by Xtext 2.22.0
 */
package com.wamas.ide.launching.lcDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clear Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.ClearOption#isWorkspace <em>Workspace</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.ClearOption#isLog <em>Log</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.ClearOption#isNoAskClear <em>No Ask Clear</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.ClearOption#isConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getClearOption()
 * @model
 * @generated
 */
public interface ClearOption extends EObject
{
  /**
   * Returns the value of the '<em><b>Workspace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace</em>' attribute.
   * @see #setWorkspace(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getClearOption_Workspace()
   * @model
   * @generated
   */
  boolean isWorkspace();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.ClearOption#isWorkspace <em>Workspace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workspace</em>' attribute.
   * @see #isWorkspace()
   * @generated
   */
  void setWorkspace(boolean value);

  /**
   * Returns the value of the '<em><b>Log</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Log</em>' attribute.
   * @see #setLog(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getClearOption_Log()
   * @model
   * @generated
   */
  boolean isLog();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.ClearOption#isLog <em>Log</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Log</em>' attribute.
   * @see #isLog()
   * @generated
   */
  void setLog(boolean value);

  /**
   * Returns the value of the '<em><b>No Ask Clear</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Ask Clear</em>' attribute.
   * @see #setNoAskClear(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getClearOption_NoAskClear()
   * @model
   * @generated
   */
  boolean isNoAskClear();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.ClearOption#isNoAskClear <em>No Ask Clear</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Ask Clear</em>' attribute.
   * @see #isNoAskClear()
   * @generated
   */
  void setNoAskClear(boolean value);

  /**
   * Returns the value of the '<em><b>Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config</em>' attribute.
   * @see #setConfig(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getClearOption_Config()
   * @model
   * @generated
   */
  boolean isConfig();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.ClearOption#isConfig <em>Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config</em>' attribute.
   * @see #isConfig()
   * @generated
   */
  void setConfig(boolean value);

} // ClearOption
