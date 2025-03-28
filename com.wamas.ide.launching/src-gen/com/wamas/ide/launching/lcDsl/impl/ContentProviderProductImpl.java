/**
 * generated by Xtext 2.28.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.ContentProviderProduct;
import com.wamas.ide.launching.lcDsl.ExistingPath;
import com.wamas.ide.launching.lcDsl.LcDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Provider Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.ContentProviderProductImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentProviderProductImpl extends MinimalEObjectImpl.Container implements ContentProviderProduct
{
  /**
   * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduct()
   * @generated
   * @ordered
   */
  protected ExistingPath product;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentProviderProductImpl()
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
    return LcDslPackage.Literals.CONTENT_PROVIDER_PRODUCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistingPath getProduct()
  {
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProduct(ExistingPath newProduct, NotificationChain msgs)
  {
    ExistingPath oldProduct = product;
    product = newProduct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LcDslPackage.CONTENT_PROVIDER_PRODUCT__PRODUCT, oldProduct, newProduct);
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
  public void setProduct(ExistingPath newProduct)
  {
    if (newProduct != product)
    {
      NotificationChain msgs = null;
      if (product != null)
        msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.CONTENT_PROVIDER_PRODUCT__PRODUCT, null, msgs);
      if (newProduct != null)
        msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LcDslPackage.CONTENT_PROVIDER_PRODUCT__PRODUCT, null, msgs);
      msgs = basicSetProduct(newProduct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.CONTENT_PROVIDER_PRODUCT__PRODUCT, newProduct, newProduct));
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
      case LcDslPackage.CONTENT_PROVIDER_PRODUCT__PRODUCT:
        return basicSetProduct(null, msgs);
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
      case LcDslPackage.CONTENT_PROVIDER_PRODUCT__PRODUCT:
        return getProduct();
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
      case LcDslPackage.CONTENT_PROVIDER_PRODUCT__PRODUCT:
        setProduct((ExistingPath)newValue);
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
      case LcDslPackage.CONTENT_PROVIDER_PRODUCT__PRODUCT:
        setProduct((ExistingPath)null);
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
      case LcDslPackage.CONTENT_PROVIDER_PRODUCT__PRODUCT:
        return product != null;
    }
    return super.eIsSet(featureID);
  }

} //ContentProviderProductImpl
