/**
 * generated by Xtext 2.10.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.GroupMember;
import com.wamas.ide.launching.lcDsl.GroupPostLaunchAction;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.LaunchModeType;
import com.wamas.ide.launching.lcDsl.LcDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.GroupMemberImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.GroupMemberImpl#isAdopt <em>Adopt</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.GroupMemberImpl#getMember <em>Member</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.GroupMemberImpl#getPostAction <em>Post Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupMemberImpl extends MinimalEObjectImpl.Container implements GroupMember
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final LaunchModeType TYPE_EDEFAULT = LaunchModeType.RUN;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected LaunchModeType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isAdopt() <em>Adopt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAdopt()
   * @generated
   * @ordered
   */
  protected static final boolean ADOPT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAdopt() <em>Adopt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAdopt()
   * @generated
   * @ordered
   */
  protected boolean adopt = ADOPT_EDEFAULT;

  /**
   * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected LaunchConfig member;

  /**
   * The cached value of the '{@link #getPostAction() <em>Post Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostAction()
   * @generated
   * @ordered
   */
  protected GroupPostLaunchAction postAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupMemberImpl()
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
    return LcDslPackage.Literals.GROUP_MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaunchModeType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(LaunchModeType newType)
  {
    LaunchModeType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.GROUP_MEMBER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAdopt()
  {
    return adopt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdopt(boolean newAdopt)
  {
    boolean oldAdopt = adopt;
    adopt = newAdopt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.GROUP_MEMBER__ADOPT, oldAdopt, adopt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaunchConfig getMember()
  {
    if (member != null && member.eIsProxy())
    {
      InternalEObject oldMember = (InternalEObject)member;
      member = (LaunchConfig)eResolveProxy(oldMember);
      if (member != oldMember)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LcDslPackage.GROUP_MEMBER__MEMBER, oldMember, member));
      }
    }
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaunchConfig basicGetMember()
  {
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember(LaunchConfig newMember)
  {
    LaunchConfig oldMember = member;
    member = newMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.GROUP_MEMBER__MEMBER, oldMember, member));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupPostLaunchAction getPostAction()
  {
    return postAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostAction(GroupPostLaunchAction newPostAction, NotificationChain msgs)
  {
    GroupPostLaunchAction oldPostAction = postAction;
    postAction = newPostAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LcDslPackage.GROUP_MEMBER__POST_ACTION, oldPostAction, newPostAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostAction(GroupPostLaunchAction newPostAction)
  {
    if (newPostAction != postAction)
    {
      NotificationChain msgs = null;
      if (postAction != null)
        msgs = ((InternalEObject)postAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.GROUP_MEMBER__POST_ACTION, null, msgs);
      if (newPostAction != null)
        msgs = ((InternalEObject)newPostAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.GROUP_MEMBER__POST_ACTION, null, msgs);
      msgs = basicSetPostAction(newPostAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.GROUP_MEMBER__POST_ACTION, newPostAction, newPostAction));
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
      case LcDslPackage.GROUP_MEMBER__POST_ACTION:
        return basicSetPostAction(null, msgs);
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
      case LcDslPackage.GROUP_MEMBER__TYPE:
        return getType();
      case LcDslPackage.GROUP_MEMBER__ADOPT:
        return isAdopt();
      case LcDslPackage.GROUP_MEMBER__MEMBER:
        if (resolve) return getMember();
        return basicGetMember();
      case LcDslPackage.GROUP_MEMBER__POST_ACTION:
        return getPostAction();
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
      case LcDslPackage.GROUP_MEMBER__TYPE:
        setType((LaunchModeType)newValue);
        return;
      case LcDslPackage.GROUP_MEMBER__ADOPT:
        setAdopt((Boolean)newValue);
        return;
      case LcDslPackage.GROUP_MEMBER__MEMBER:
        setMember((LaunchConfig)newValue);
        return;
      case LcDslPackage.GROUP_MEMBER__POST_ACTION:
        setPostAction((GroupPostLaunchAction)newValue);
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
      case LcDslPackage.GROUP_MEMBER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LcDslPackage.GROUP_MEMBER__ADOPT:
        setAdopt(ADOPT_EDEFAULT);
        return;
      case LcDslPackage.GROUP_MEMBER__MEMBER:
        setMember((LaunchConfig)null);
        return;
      case LcDslPackage.GROUP_MEMBER__POST_ACTION:
        setPostAction((GroupPostLaunchAction)null);
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
      case LcDslPackage.GROUP_MEMBER__TYPE:
        return type != TYPE_EDEFAULT;
      case LcDslPackage.GROUP_MEMBER__ADOPT:
        return adopt != ADOPT_EDEFAULT;
      case LcDslPackage.GROUP_MEMBER__MEMBER:
        return member != null;
      case LcDslPackage.GROUP_MEMBER__POST_ACTION:
        return postAction != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", adopt: ");
    result.append(adopt);
    result.append(')');
    return result.toString();
  }

} //GroupMemberImpl