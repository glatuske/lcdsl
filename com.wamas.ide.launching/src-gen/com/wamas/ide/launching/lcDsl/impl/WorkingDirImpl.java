/**
 * generated by Xtext 2.22.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.ExistingPath;
import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.lcDsl.WorkingDir;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Working Dir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.WorkingDirImpl#getWorkingDir <em>Working Dir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkingDirImpl extends MinimalEObjectImpl.Container implements WorkingDir
{
  /**
   * The cached value of the '{@link #getWorkingDir() <em>Working Dir</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkingDir()
   * @generated
   * @ordered
   */
  protected ExistingPath workingDir;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkingDirImpl()
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
    return LcDslPackage.Literals.WORKING_DIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistingPath getWorkingDir()
  {
    return workingDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkingDir(ExistingPath newWorkingDir, NotificationChain msgs)
  {
    ExistingPath oldWorkingDir = workingDir;
    workingDir = newWorkingDir;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LcDslPackage.WORKING_DIR__WORKING_DIR, oldWorkingDir, newWorkingDir);
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
  public void setWorkingDir(ExistingPath newWorkingDir)
  {
    if (newWorkingDir != workingDir)
    {
      NotificationChain msgs = null;
      if (workingDir != null)
        msgs = ((InternalEObject)workingDir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.WORKING_DIR__WORKING_DIR, null, msgs);
      if (newWorkingDir != null)
        msgs = ((InternalEObject)newWorkingDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.WORKING_DIR__WORKING_DIR, null, msgs);
      msgs = basicSetWorkingDir(newWorkingDir, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.WORKING_DIR__WORKING_DIR, newWorkingDir, newWorkingDir));
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
      case LcDslPackage.WORKING_DIR__WORKING_DIR:
        return basicSetWorkingDir(null, msgs);
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
      case LcDslPackage.WORKING_DIR__WORKING_DIR:
        return getWorkingDir();
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
      case LcDslPackage.WORKING_DIR__WORKING_DIR:
        setWorkingDir((ExistingPath)newValue);
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
      case LcDslPackage.WORKING_DIR__WORKING_DIR:
        setWorkingDir((ExistingPath)null);
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
      case LcDslPackage.WORKING_DIR__WORKING_DIR:
        return workingDir != null;
    }
    return super.eIsSet(featureID);
  }

} //WorkingDirImpl
