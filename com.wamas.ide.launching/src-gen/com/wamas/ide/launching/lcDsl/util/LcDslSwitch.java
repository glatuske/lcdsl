/**
 * generated by Xtext 2.10.0
 */
package com.wamas.ide.launching.lcDsl.util;

import com.wamas.ide.launching.lcDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage
 * @generated
 */
public class LcDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LcDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LcDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LcDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LcDslPackage.LC_MODEL:
      {
        LCModel lcModel = (LCModel)theEObject;
        T result = caseLCModel(lcModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.LAUNCH_CONFIG:
      {
        LaunchConfig launchConfig = (LaunchConfig)theEObject;
        T result = caseLaunchConfig(launchConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.ADD_PLUGIN:
      {
        AddPlugin addPlugin = (AddPlugin)theEObject;
        T result = caseAddPlugin(addPlugin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.IGNORE_PLUGIN:
      {
        IgnorePlugin ignorePlugin = (IgnorePlugin)theEObject;
        T result = caseIgnorePlugin(ignorePlugin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.VM_ARGUMENT:
      {
        VmArgument vmArgument = (VmArgument)theEObject;
        T result = caseVmArgument(vmArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.PROGRAM_ARGUMENT:
      {
        ProgramArgument programArgument = (ProgramArgument)theEObject;
        T result = caseProgramArgument(programArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.ENVIRONMENT_VARIABLE:
      {
        EnvironmentVariable environmentVariable = (EnvironmentVariable)theEObject;
        T result = caseEnvironmentVariable(environmentVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.APPLICATION_EXT_POINT:
      {
        ApplicationExtPoint applicationExtPoint = (ApplicationExtPoint)theEObject;
        T result = caseApplicationExtPoint(applicationExtPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.PRODUCT_EXT_POINT:
      {
        ProductExtPoint productExtPoint = (ProductExtPoint)theEObject;
        T result = caseProductExtPoint(productExtPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.FAVORITES:
      {
        Favorites favorites = (Favorites)theEObject;
        T result = caseFavorites(favorites);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.REDIRECT:
      {
        Redirect redirect = (Redirect)theEObject;
        T result = caseRedirect(redirect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.EXECUTION_ENVIRONMENT:
      {
        ExecutionEnvironment executionEnvironment = (ExecutionEnvironment)theEObject;
        T result = caseExecutionEnvironment(executionEnvironment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.CONFIG_INI_TEMPLATE:
      {
        ConfigIniTemplate configIniTemplate = (ConfigIniTemplate)theEObject;
        T result = caseConfigIniTemplate(configIniTemplate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.TRACE_ENABLEMENT:
      {
        TraceEnablement traceEnablement = (TraceEnablement)theEObject;
        T result = caseTraceEnablement(traceEnablement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.JAVA_MAIN_SEARCH:
      {
        JavaMainSearch javaMainSearch = (JavaMainSearch)theEObject;
        T result = caseJavaMainSearch(javaMainSearch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.RAP_SERVLET_CONFIG:
      {
        RapServletConfig rapServletConfig = (RapServletConfig)theEObject;
        T result = caseRapServletConfig(rapServletConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.PATH:
      {
        Path path = (Path)theEObject;
        T result = casePath(path);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.EXISTING_PATH:
      {
        ExistingPath existingPath = (ExistingPath)theEObject;
        T result = caseExistingPath(existingPath);
        if (result == null) result = casePath(existingPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.ANY_PATH:
      {
        AnyPath anyPath = (AnyPath)theEObject;
        T result = caseAnyPath(anyPath);
        if (result == null) result = casePath(anyPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.PLUGIN_WITH_VERSION_AND_START_LEVEL:
      {
        PluginWithVersionAndStartLevel pluginWithVersionAndStartLevel = (PluginWithVersionAndStartLevel)theEObject;
        T result = casePluginWithVersionAndStartLevel(pluginWithVersionAndStartLevel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.PLUGIN_WITH_VERSION:
      {
        PluginWithVersion pluginWithVersion = (PluginWithVersion)theEObject;
        T result = casePluginWithVersion(pluginWithVersion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.PROJECT:
      {
        Project project = (Project)theEObject;
        T result = caseProject(project);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.JAVA_MAIN_TYPE:
      {
        JavaMainType javaMainType = (JavaMainType)theEObject;
        T result = caseJavaMainType(javaMainType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.CLEAR_OPTION:
      {
        ClearOption clearOption = (ClearOption)theEObject;
        T result = caseClearOption(clearOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.MEMORY_OPTION:
      {
        MemoryOption memoryOption = (MemoryOption)theEObject;
        T result = caseMemoryOption(memoryOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.GROUP_MEMBER:
      {
        GroupMember groupMember = (GroupMember)theEObject;
        T result = caseGroupMember(groupMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.GROUP_POST_LAUNCH_ACTION:
      {
        GroupPostLaunchAction groupPostLaunchAction = (GroupPostLaunchAction)theEObject;
        T result = caseGroupPostLaunchAction(groupPostLaunchAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.GROUP_POST_LAUNCH_DELAY:
      {
        GroupPostLaunchDelay groupPostLaunchDelay = (GroupPostLaunchDelay)theEObject;
        T result = caseGroupPostLaunchDelay(groupPostLaunchDelay);
        if (result == null) result = caseGroupPostLaunchAction(groupPostLaunchDelay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.GROUP_POST_LAUNCH_REGEX:
      {
        GroupPostLaunchRegex groupPostLaunchRegex = (GroupPostLaunchRegex)theEObject;
        T result = caseGroupPostLaunchRegex(groupPostLaunchRegex);
        if (result == null) result = caseGroupPostLaunchAction(groupPostLaunchRegex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.GROUP_POST_LAUNCH_WAIT:
      {
        GroupPostLaunchWait groupPostLaunchWait = (GroupPostLaunchWait)theEObject;
        T result = caseGroupPostLaunchWait(groupPostLaunchWait);
        if (result == null) result = caseGroupPostLaunchAction(groupPostLaunchWait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LcDslPackage.STRING_WITH_VARIABLES:
      {
        StringWithVariables stringWithVariables = (StringWithVariables)theEObject;
        T result = caseStringWithVariables(stringWithVariables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LC Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LC Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLCModel(LCModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Launch Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Launch Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLaunchConfig(LaunchConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Plugin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Plugin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddPlugin(AddPlugin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ignore Plugin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ignore Plugin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIgnorePlugin(IgnorePlugin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vm Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vm Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVmArgument(VmArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgramArgument(ProgramArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentVariable(EnvironmentVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Ext Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Ext Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationExtPoint(ApplicationExtPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product Ext Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product Ext Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProductExtPoint(ProductExtPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Favorites</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Favorites</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFavorites(Favorites object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Redirect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Redirect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRedirect(Redirect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecutionEnvironment(ExecutionEnvironment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config Ini Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config Ini Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigIniTemplate(ConfigIniTemplate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trace Enablement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trace Enablement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraceEnablement(TraceEnablement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Main Search</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Main Search</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJavaMainSearch(JavaMainSearch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rap Servlet Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rap Servlet Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRapServletConfig(RapServletConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePath(Path object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Existing Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Existing Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistingPath(ExistingPath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyPath(AnyPath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin With Version And Start Level</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin With Version And Start Level</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginWithVersionAndStartLevel(PluginWithVersionAndStartLevel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin With Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin With Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginWithVersion(PluginWithVersion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Main Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Main Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJavaMainType(JavaMainType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clear Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClearOption(ClearOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Memory Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Memory Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemoryOption(MemoryOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupMember(GroupMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Post Launch Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Post Launch Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupPostLaunchAction(GroupPostLaunchAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Post Launch Delay</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Post Launch Delay</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupPostLaunchDelay(GroupPostLaunchDelay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Post Launch Regex</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Post Launch Regex</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupPostLaunchRegex(GroupPostLaunchRegex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Post Launch Wait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Post Launch Wait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupPostLaunchWait(GroupPostLaunchWait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String With Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String With Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringWithVariables(StringWithVariables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LcDslSwitch
