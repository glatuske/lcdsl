/**
 * generated by Xtext 2.22.0
 */
package com.wamas.ide.launching.lcDsl.util;

import com.wamas.ide.launching.lcDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage
 * @generated
 */
public class LcDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LcDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LcDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LcDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LcDslSwitch<Adapter> modelSwitch =
    new LcDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseLCModel(LCModel object)
      {
        return createLCModelAdapter();
      }
      @Override
      public Adapter caseLaunchConfig(LaunchConfig object)
      {
        return createLaunchConfigAdapter();
      }
      @Override
      public Adapter caseWorkspace(Workspace object)
      {
        return createWorkspaceAdapter();
      }
      @Override
      public Adapter caseWorkingDir(WorkingDir object)
      {
        return createWorkingDirAdapter();
      }
      @Override
      public Adapter caseMainProject(MainProject object)
      {
        return createMainProjectAdapter();
      }
      @Override
      public Adapter caseMainType(MainType object)
      {
        return createMainTypeAdapter();
      }
      @Override
      public Adapter caseAddPlugin(AddPlugin object)
      {
        return createAddPluginAdapter();
      }
      @Override
      public Adapter caseAddFeature(AddFeature object)
      {
        return createAddFeatureAdapter();
      }
      @Override
      public Adapter caseContentProviderProduct(ContentProviderProduct object)
      {
        return createContentProviderProductAdapter();
      }
      @Override
      public Adapter caseIgnorePlugin(IgnorePlugin object)
      {
        return createIgnorePluginAdapter();
      }
      @Override
      public Adapter caseVmArgument(VmArgument object)
      {
        return createVmArgumentAdapter();
      }
      @Override
      public Adapter caseProgramArgument(ProgramArgument object)
      {
        return createProgramArgumentAdapter();
      }
      @Override
      public Adapter caseEnvironmentVariable(EnvironmentVariable object)
      {
        return createEnvironmentVariableAdapter();
      }
      @Override
      public Adapter caseApplicationExtPoint(ApplicationExtPoint object)
      {
        return createApplicationExtPointAdapter();
      }
      @Override
      public Adapter caseProductExtPoint(ProductExtPoint object)
      {
        return createProductExtPointAdapter();
      }
      @Override
      public Adapter caseFavorites(Favorites object)
      {
        return createFavoritesAdapter();
      }
      @Override
      public Adapter caseRedirect(Redirect object)
      {
        return createRedirectAdapter();
      }
      @Override
      public Adapter caseExecutionEnvironment(ExecutionEnvironment object)
      {
        return createExecutionEnvironmentAdapter();
      }
      @Override
      public Adapter caseConfigIniTemplate(ConfigIniTemplate object)
      {
        return createConfigIniTemplateAdapter();
      }
      @Override
      public Adapter caseTraceEnablement(TraceEnablement object)
      {
        return createTraceEnablementAdapter();
      }
      @Override
      public Adapter caseJavaMainSearch(JavaMainSearch object)
      {
        return createJavaMainSearchAdapter();
      }
      @Override
      public Adapter caseRapServletConfig(RapServletConfig object)
      {
        return createRapServletConfigAdapter();
      }
      @Override
      public Adapter casePath(Path object)
      {
        return createPathAdapter();
      }
      @Override
      public Adapter caseExistingPath(ExistingPath object)
      {
        return createExistingPathAdapter();
      }
      @Override
      public Adapter caseAnyPath(AnyPath object)
      {
        return createAnyPathAdapter();
      }
      @Override
      public Adapter casePluginWithVersionAndStartLevel(PluginWithVersionAndStartLevel object)
      {
        return createPluginWithVersionAndStartLevelAdapter();
      }
      @Override
      public Adapter casePluginWithVersion(PluginWithVersion object)
      {
        return createPluginWithVersionAdapter();
      }
      @Override
      public Adapter caseFeatureWithVersion(FeatureWithVersion object)
      {
        return createFeatureWithVersionAdapter();
      }
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseJavaMainType(JavaMainType object)
      {
        return createJavaMainTypeAdapter();
      }
      @Override
      public Adapter caseClearOption(ClearOption object)
      {
        return createClearOptionAdapter();
      }
      @Override
      public Adapter caseMemoryOption(MemoryOption object)
      {
        return createMemoryOptionAdapter();
      }
      @Override
      public Adapter caseGroupMember(GroupMember object)
      {
        return createGroupMemberAdapter();
      }
      @Override
      public Adapter caseGroupPostLaunchAction(GroupPostLaunchAction object)
      {
        return createGroupPostLaunchActionAdapter();
      }
      @Override
      public Adapter caseGroupPostLaunchDelay(GroupPostLaunchDelay object)
      {
        return createGroupPostLaunchDelayAdapter();
      }
      @Override
      public Adapter caseGroupPostLaunchRegex(GroupPostLaunchRegex object)
      {
        return createGroupPostLaunchRegexAdapter();
      }
      @Override
      public Adapter caseGroupPostLaunchWait(GroupPostLaunchWait object)
      {
        return createGroupPostLaunchWaitAdapter();
      }
      @Override
      public Adapter caseStringWithVariables(StringWithVariables object)
      {
        return createStringWithVariablesAdapter();
      }
      @Override
      public Adapter caseTestConfig(TestConfig object)
      {
        return createTestConfigAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.LCModel <em>LC Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.LCModel
   * @generated
   */
  public Adapter createLCModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.LaunchConfig <em>Launch Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.LaunchConfig
   * @generated
   */
  public Adapter createLaunchConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.Workspace <em>Workspace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.Workspace
   * @generated
   */
  public Adapter createWorkspaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.WorkingDir <em>Working Dir</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.WorkingDir
   * @generated
   */
  public Adapter createWorkingDirAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.MainProject <em>Main Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.MainProject
   * @generated
   */
  public Adapter createMainProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.MainType <em>Main Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.MainType
   * @generated
   */
  public Adapter createMainTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.AddPlugin <em>Add Plugin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.AddPlugin
   * @generated
   */
  public Adapter createAddPluginAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.AddFeature <em>Add Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.AddFeature
   * @generated
   */
  public Adapter createAddFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.ContentProviderProduct <em>Content Provider Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.ContentProviderProduct
   * @generated
   */
  public Adapter createContentProviderProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.IgnorePlugin <em>Ignore Plugin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.IgnorePlugin
   * @generated
   */
  public Adapter createIgnorePluginAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.VmArgument <em>Vm Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.VmArgument
   * @generated
   */
  public Adapter createVmArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.ProgramArgument <em>Program Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.ProgramArgument
   * @generated
   */
  public Adapter createProgramArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.EnvironmentVariable <em>Environment Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.EnvironmentVariable
   * @generated
   */
  public Adapter createEnvironmentVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.ApplicationExtPoint <em>Application Ext Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.ApplicationExtPoint
   * @generated
   */
  public Adapter createApplicationExtPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.ProductExtPoint <em>Product Ext Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.ProductExtPoint
   * @generated
   */
  public Adapter createProductExtPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.Favorites <em>Favorites</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.Favorites
   * @generated
   */
  public Adapter createFavoritesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.Redirect <em>Redirect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.Redirect
   * @generated
   */
  public Adapter createRedirectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.ExecutionEnvironment <em>Execution Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.ExecutionEnvironment
   * @generated
   */
  public Adapter createExecutionEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.ConfigIniTemplate <em>Config Ini Template</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.ConfigIniTemplate
   * @generated
   */
  public Adapter createConfigIniTemplateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.TraceEnablement <em>Trace Enablement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.TraceEnablement
   * @generated
   */
  public Adapter createTraceEnablementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.JavaMainSearch <em>Java Main Search</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.JavaMainSearch
   * @generated
   */
  public Adapter createJavaMainSearchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.RapServletConfig <em>Rap Servlet Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.RapServletConfig
   * @generated
   */
  public Adapter createRapServletConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.Path
   * @generated
   */
  public Adapter createPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.ExistingPath <em>Existing Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.ExistingPath
   * @generated
   */
  public Adapter createExistingPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.AnyPath <em>Any Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.AnyPath
   * @generated
   */
  public Adapter createAnyPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.PluginWithVersionAndStartLevel <em>Plugin With Version And Start Level</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.PluginWithVersionAndStartLevel
   * @generated
   */
  public Adapter createPluginWithVersionAndStartLevelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.PluginWithVersion <em>Plugin With Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.PluginWithVersion
   * @generated
   */
  public Adapter createPluginWithVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.FeatureWithVersion <em>Feature With Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.FeatureWithVersion
   * @generated
   */
  public Adapter createFeatureWithVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.JavaMainType <em>Java Main Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.JavaMainType
   * @generated
   */
  public Adapter createJavaMainTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.ClearOption <em>Clear Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.ClearOption
   * @generated
   */
  public Adapter createClearOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.MemoryOption <em>Memory Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.MemoryOption
   * @generated
   */
  public Adapter createMemoryOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.GroupMember <em>Group Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.GroupMember
   * @generated
   */
  public Adapter createGroupMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.GroupPostLaunchAction <em>Group Post Launch Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.GroupPostLaunchAction
   * @generated
   */
  public Adapter createGroupPostLaunchActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.GroupPostLaunchDelay <em>Group Post Launch Delay</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.GroupPostLaunchDelay
   * @generated
   */
  public Adapter createGroupPostLaunchDelayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.GroupPostLaunchRegex <em>Group Post Launch Regex</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.GroupPostLaunchRegex
   * @generated
   */
  public Adapter createGroupPostLaunchRegexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.GroupPostLaunchWait <em>Group Post Launch Wait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.GroupPostLaunchWait
   * @generated
   */
  public Adapter createGroupPostLaunchWaitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.StringWithVariables <em>String With Variables</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.StringWithVariables
   * @generated
   */
  public Adapter createStringWithVariablesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wamas.ide.launching.lcDsl.TestConfig <em>Test Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wamas.ide.launching.lcDsl.TestConfig
   * @generated
   */
  public Adapter createTestConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LcDslAdapterFactory
