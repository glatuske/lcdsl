/**
 * generated by Xtext 2.28.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.IgnorePlugin;
import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.lcDsl.PluginWithVersion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ignore Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.IgnorePluginImpl#getPlugin <em>Plugin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IgnorePluginImpl extends MinimalEObjectImpl.Container implements IgnorePlugin
{
  /**
   * The cached value of the '{@link #getPlugin() <em>Plugin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlugin()
   * @generated
   * @ordered
   */
  protected PluginWithVersion plugin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IgnorePluginImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LcDslPackage.Literals.IGNORE_PLUGIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PluginWithVersion getPlugin()
  {
    return plugin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlugin(PluginWithVersion newPlugin, NotificationChain msgs)
  {
    PluginWithVersion oldPlugin = plugin;
    plugin = newPlugin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LcDslPackage.IGNORE_PLUGIN__PLUGIN, oldPlugin, newPlugin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPlugin(PluginWithVersion newPlugin)
  {
    if (newPlugin != plugin)
    {
      NotificationChain msgs = null;
      if (plugin != null)
        msgs = ((InternalEObject)plugin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.IGNORE_PLUGIN__PLUGIN, null, msgs);
      if (newPlugin != null)
        msgs = ((InternalEObject)newPlugin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.IGNORE_PLUGIN__PLUGIN, null, msgs);
      msgs = basicSetPlugin(newPlugin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.IGNORE_PLUGIN__PLUGIN, newPlugin, newPlugin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LcDslPackage.IGNORE_PLUGIN__PLUGIN:
        return basicSetPlugin(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LcDslPackage.IGNORE_PLUGIN__PLUGIN:
        return getPlugin();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LcDslPackage.IGNORE_PLUGIN__PLUGIN:
        setPlugin((PluginWithVersion)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LcDslPackage.IGNORE_PLUGIN__PLUGIN:
        setPlugin((PluginWithVersion)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LcDslPackage.IGNORE_PLUGIN__PLUGIN:
        return plugin != null;
    }
    return super.eIsSet(featureID);
  }

} //IgnorePluginImpl
