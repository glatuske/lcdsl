/**
 * generated by Xtext 2.25.0
 */
package com.wamas.ide.launching.lcDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isManual <em>Manual</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isForeground <em>Foreground</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isNoConsole <em>No Console</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isNoValidate <em>No Validate</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isSwInstallSupport <em>Sw Install Support</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isReplaceEnv <em>Replace Env</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isStopInMain <em>Stop In Main</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isKeepRunning <em>Keep Running</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isRunInUiThread <em>Run In Ui Thread</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isQualify <em>Qualify</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getQualifierId <em>Qualifier Id</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getType <em>Type</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getName <em>Name</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getSuperConfig <em>Super Config</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getClears <em>Clears</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getWorkspace <em>Workspace</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getWorkingDir <em>Working Dir</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getMemory <em>Memory</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getMainProject <em>Main Project</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getMainType <em>Main Type</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getApplication <em>Application</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getProduct <em>Product</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getFavorites <em>Favorites</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getRedirect <em>Redirect</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getExecEnv <em>Exec Env</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getConfigIniTemplate <em>Config Ini Template</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getJavaMainSearch <em>Java Main Search</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getServletConfig <em>Servlet Config</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getContentProviderProduct <em>Content Provider Product</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getTest <em>Test</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getIgnore <em>Ignore</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getGroupMembers <em>Group Members</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getVmArgs <em>Vm Args</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getProgArgs <em>Prog Args</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getEnvVars <em>Env Vars</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig()
 * @model
 * @generated
 */
public interface LaunchConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Explicit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit</em>' attribute.
   * @see #setExplicit(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Explicit()
   * @model
   * @generated
   */
  boolean isExplicit();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isExplicit <em>Explicit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit</em>' attribute.
   * @see #isExplicit()
   * @generated
   */
  void setExplicit(boolean value);

  /**
   * Returns the value of the '<em><b>Manual</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manual</em>' attribute.
   * @see #setManual(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Manual()
   * @model
   * @generated
   */
  boolean isManual();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isManual <em>Manual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manual</em>' attribute.
   * @see #isManual()
   * @generated
   */
  void setManual(boolean value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Foreground</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreground</em>' attribute.
   * @see #setForeground(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Foreground()
   * @model
   * @generated
   */
  boolean isForeground();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isForeground <em>Foreground</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreground</em>' attribute.
   * @see #isForeground()
   * @generated
   */
  void setForeground(boolean value);

  /**
   * Returns the value of the '<em><b>No Console</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Console</em>' attribute.
   * @see #setNoConsole(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_NoConsole()
   * @model
   * @generated
   */
  boolean isNoConsole();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isNoConsole <em>No Console</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Console</em>' attribute.
   * @see #isNoConsole()
   * @generated
   */
  void setNoConsole(boolean value);

  /**
   * Returns the value of the '<em><b>No Validate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Validate</em>' attribute.
   * @see #setNoValidate(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_NoValidate()
   * @model
   * @generated
   */
  boolean isNoValidate();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isNoValidate <em>No Validate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Validate</em>' attribute.
   * @see #isNoValidate()
   * @generated
   */
  void setNoValidate(boolean value);

  /**
   * Returns the value of the '<em><b>Sw Install Support</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sw Install Support</em>' attribute.
   * @see #setSwInstallSupport(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_SwInstallSupport()
   * @model
   * @generated
   */
  boolean isSwInstallSupport();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isSwInstallSupport <em>Sw Install Support</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sw Install Support</em>' attribute.
   * @see #isSwInstallSupport()
   * @generated
   */
  void setSwInstallSupport(boolean value);

  /**
   * Returns the value of the '<em><b>Replace Env</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replace Env</em>' attribute.
   * @see #setReplaceEnv(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_ReplaceEnv()
   * @model
   * @generated
   */
  boolean isReplaceEnv();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isReplaceEnv <em>Replace Env</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replace Env</em>' attribute.
   * @see #isReplaceEnv()
   * @generated
   */
  void setReplaceEnv(boolean value);

  /**
   * Returns the value of the '<em><b>Stop In Main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop In Main</em>' attribute.
   * @see #setStopInMain(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_StopInMain()
   * @model
   * @generated
   */
  boolean isStopInMain();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isStopInMain <em>Stop In Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop In Main</em>' attribute.
   * @see #isStopInMain()
   * @generated
   */
  void setStopInMain(boolean value);

  /**
   * Returns the value of the '<em><b>Keep Running</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keep Running</em>' attribute.
   * @see #setKeepRunning(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_KeepRunning()
   * @model
   * @generated
   */
  boolean isKeepRunning();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isKeepRunning <em>Keep Running</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keep Running</em>' attribute.
   * @see #isKeepRunning()
   * @generated
   */
  void setKeepRunning(boolean value);

  /**
   * Returns the value of the '<em><b>Run In Ui Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run In Ui Thread</em>' attribute.
   * @see #setRunInUiThread(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_RunInUiThread()
   * @model
   * @generated
   */
  boolean isRunInUiThread();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isRunInUiThread <em>Run In Ui Thread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run In Ui Thread</em>' attribute.
   * @see #isRunInUiThread()
   * @generated
   */
  void setRunInUiThread(boolean value);

  /**
   * Returns the value of the '<em><b>Qualify</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualify</em>' attribute.
   * @see #setQualify(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Qualify()
   * @model
   * @generated
   */
  boolean isQualify();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#isQualify <em>Qualify</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualify</em>' attribute.
   * @see #isQualify()
   * @generated
   */
  void setQualify(boolean value);

  /**
   * Returns the value of the '<em><b>Qualifier Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier Id</em>' attribute.
   * @see #setQualifierId(String)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_QualifierId()
   * @model
   * @generated
   */
  String getQualifierId();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getQualifierId <em>Qualifier Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier Id</em>' attribute.
   * @see #getQualifierId()
   * @generated
   */
  void setQualifierId(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.wamas.ide.launching.lcDsl.LaunchConfigType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.wamas.ide.launching.lcDsl.LaunchConfigType
   * @see #setType(LaunchConfigType)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Type()
   * @model
   * @generated
   */
  LaunchConfigType getType();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.wamas.ide.launching.lcDsl.LaunchConfigType
   * @see #getType()
   * @generated
   */
  void setType(LaunchConfigType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Config</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Config</em>' reference.
   * @see #setSuperConfig(LaunchConfig)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_SuperConfig()
   * @model
   * @generated
   */
  LaunchConfig getSuperConfig();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getSuperConfig <em>Super Config</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Config</em>' reference.
   * @see #getSuperConfig()
   * @generated
   */
  void setSuperConfig(LaunchConfig value);

  /**
   * Returns the value of the '<em><b>Clears</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clears</em>' containment reference.
   * @see #setClears(ClearOption)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Clears()
   * @model containment="true"
   * @generated
   */
  ClearOption getClears();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getClears <em>Clears</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clears</em>' containment reference.
   * @see #getClears()
   * @generated
   */
  void setClears(ClearOption value);

  /**
   * Returns the value of the '<em><b>Workspace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace</em>' containment reference.
   * @see #setWorkspace(Workspace)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Workspace()
   * @model containment="true"
   * @generated
   */
  Workspace getWorkspace();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getWorkspace <em>Workspace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workspace</em>' containment reference.
   * @see #getWorkspace()
   * @generated
   */
  void setWorkspace(Workspace value);

  /**
   * Returns the value of the '<em><b>Working Dir</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Working Dir</em>' containment reference.
   * @see #setWorkingDir(WorkingDir)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_WorkingDir()
   * @model containment="true"
   * @generated
   */
  WorkingDir getWorkingDir();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getWorkingDir <em>Working Dir</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Working Dir</em>' containment reference.
   * @see #getWorkingDir()
   * @generated
   */
  void setWorkingDir(WorkingDir value);

  /**
   * Returns the value of the '<em><b>Memory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memory</em>' containment reference.
   * @see #setMemory(MemoryOption)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Memory()
   * @model containment="true"
   * @generated
   */
  MemoryOption getMemory();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getMemory <em>Memory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memory</em>' containment reference.
   * @see #getMemory()
   * @generated
   */
  void setMemory(MemoryOption value);

  /**
   * Returns the value of the '<em><b>Main Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Project</em>' containment reference.
   * @see #setMainProject(MainProject)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_MainProject()
   * @model containment="true"
   * @generated
   */
  MainProject getMainProject();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getMainProject <em>Main Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Project</em>' containment reference.
   * @see #getMainProject()
   * @generated
   */
  void setMainProject(MainProject value);

  /**
   * Returns the value of the '<em><b>Main Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Type</em>' containment reference.
   * @see #setMainType(MainType)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_MainType()
   * @model containment="true"
   * @generated
   */
  MainType getMainType();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getMainType <em>Main Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Type</em>' containment reference.
   * @see #getMainType()
   * @generated
   */
  void setMainType(MainType value);

  /**
   * Returns the value of the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' containment reference.
   * @see #setApplication(ApplicationExtPoint)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Application()
   * @model containment="true"
   * @generated
   */
  ApplicationExtPoint getApplication();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getApplication <em>Application</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' containment reference.
   * @see #getApplication()
   * @generated
   */
  void setApplication(ApplicationExtPoint value);

  /**
   * Returns the value of the '<em><b>Product</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product</em>' containment reference.
   * @see #setProduct(ProductExtPoint)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Product()
   * @model containment="true"
   * @generated
   */
  ProductExtPoint getProduct();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getProduct <em>Product</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product</em>' containment reference.
   * @see #getProduct()
   * @generated
   */
  void setProduct(ProductExtPoint value);

  /**
   * Returns the value of the '<em><b>Favorites</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Favorites</em>' containment reference.
   * @see #setFavorites(Favorites)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Favorites()
   * @model containment="true"
   * @generated
   */
  Favorites getFavorites();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getFavorites <em>Favorites</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Favorites</em>' containment reference.
   * @see #getFavorites()
   * @generated
   */
  void setFavorites(Favorites value);

  /**
   * Returns the value of the '<em><b>Redirect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Redirect</em>' containment reference.
   * @see #setRedirect(Redirect)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Redirect()
   * @model containment="true"
   * @generated
   */
  Redirect getRedirect();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getRedirect <em>Redirect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Redirect</em>' containment reference.
   * @see #getRedirect()
   * @generated
   */
  void setRedirect(Redirect value);

  /**
   * Returns the value of the '<em><b>Exec Env</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exec Env</em>' containment reference.
   * @see #setExecEnv(ExecutionEnvironment)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_ExecEnv()
   * @model containment="true"
   * @generated
   */
  ExecutionEnvironment getExecEnv();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getExecEnv <em>Exec Env</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exec Env</em>' containment reference.
   * @see #getExecEnv()
   * @generated
   */
  void setExecEnv(ExecutionEnvironment value);

  /**
   * Returns the value of the '<em><b>Config Ini Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config Ini Template</em>' containment reference.
   * @see #setConfigIniTemplate(ConfigIniTemplate)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_ConfigIniTemplate()
   * @model containment="true"
   * @generated
   */
  ConfigIniTemplate getConfigIniTemplate();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getConfigIniTemplate <em>Config Ini Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config Ini Template</em>' containment reference.
   * @see #getConfigIniTemplate()
   * @generated
   */
  void setConfigIniTemplate(ConfigIniTemplate value);

  /**
   * Returns the value of the '<em><b>Java Main Search</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Main Search</em>' containment reference.
   * @see #setJavaMainSearch(JavaMainSearch)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_JavaMainSearch()
   * @model containment="true"
   * @generated
   */
  JavaMainSearch getJavaMainSearch();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getJavaMainSearch <em>Java Main Search</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Main Search</em>' containment reference.
   * @see #getJavaMainSearch()
   * @generated
   */
  void setJavaMainSearch(JavaMainSearch value);

  /**
   * Returns the value of the '<em><b>Servlet Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servlet Config</em>' containment reference.
   * @see #setServletConfig(RapServletConfig)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_ServletConfig()
   * @model containment="true"
   * @generated
   */
  RapServletConfig getServletConfig();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getServletConfig <em>Servlet Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Servlet Config</em>' containment reference.
   * @see #getServletConfig()
   * @generated
   */
  void setServletConfig(RapServletConfig value);

  /**
   * Returns the value of the '<em><b>Content Provider Product</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content Provider Product</em>' containment reference.
   * @see #setContentProviderProduct(ContentProviderProduct)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_ContentProviderProduct()
   * @model containment="true"
   * @generated
   */
  ContentProviderProduct getContentProviderProduct();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getContentProviderProduct <em>Content Provider Product</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content Provider Product</em>' containment reference.
   * @see #getContentProviderProduct()
   * @generated
   */
  void setContentProviderProduct(ContentProviderProduct value);

  /**
   * Returns the value of the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' containment reference.
   * @see #setTest(TestConfig)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Test()
   * @model containment="true"
   * @generated
   */
  TestConfig getTest();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.LaunchConfig#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(TestConfig value);

  /**
   * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.AddPlugin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plugins</em>' containment reference list.
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Plugins()
   * @model containment="true"
   * @generated
   */
  EList<AddPlugin> getPlugins();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.AddFeature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Features()
   * @model containment="true"
   * @generated
   */
  EList<AddFeature> getFeatures();

  /**
   * Returns the value of the '<em><b>Ignore</b></em>' containment reference list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.IgnorePlugin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore</em>' containment reference list.
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Ignore()
   * @model containment="true"
   * @generated
   */
  EList<IgnorePlugin> getIgnore();

  /**
   * Returns the value of the '<em><b>Group Members</b></em>' containment reference list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.GroupMember}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Members</em>' containment reference list.
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_GroupMembers()
   * @model containment="true"
   * @generated
   */
  EList<GroupMember> getGroupMembers();

  /**
   * Returns the value of the '<em><b>Vm Args</b></em>' containment reference list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.VmArgument}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vm Args</em>' containment reference list.
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_VmArgs()
   * @model containment="true"
   * @generated
   */
  EList<VmArgument> getVmArgs();

  /**
   * Returns the value of the '<em><b>Prog Args</b></em>' containment reference list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.ProgramArgument}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prog Args</em>' containment reference list.
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_ProgArgs()
   * @model containment="true"
   * @generated
   */
  EList<ProgramArgument> getProgArgs();

  /**
   * Returns the value of the '<em><b>Env Vars</b></em>' containment reference list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.EnvironmentVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Env Vars</em>' containment reference list.
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_EnvVars()
   * @model containment="true"
   * @generated
   */
  EList<EnvironmentVariable> getEnvVars();

  /**
   * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
   * The list contents are of type {@link com.wamas.ide.launching.lcDsl.TraceEnablement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traces</em>' containment reference list.
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getLaunchConfig_Traces()
   * @model containment="true"
   * @generated
   */
  EList<TraceEnablement> getTraces();

} // LaunchConfig
