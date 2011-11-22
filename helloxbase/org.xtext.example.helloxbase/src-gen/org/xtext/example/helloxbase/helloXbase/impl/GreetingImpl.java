/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.helloxbase.helloXbase.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

import org.xtext.example.helloxbase.helloXbase.Greeting;
import org.xtext.example.helloxbase.helloXbase.HelloXbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.helloxbase.helloXbase.impl.GreetingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.helloxbase.helloXbase.impl.GreetingImpl#getJavaType <em>Java Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GreetingImpl extends MinimalEObjectImpl.Container implements Greeting
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getJavaType() <em>Java Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaType()
   * @generated
   * @ordered
   */
  protected JvmType javaType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreetingImpl()
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
    return HelloXbasePackage.Literals.GREETING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HelloXbasePackage.GREETING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getJavaType()
  {
    if (javaType != null && javaType.eIsProxy())
    {
      InternalEObject oldJavaType = (InternalEObject)javaType;
      javaType = (JvmType)eResolveProxy(oldJavaType);
      if (javaType != oldJavaType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HelloXbasePackage.GREETING__JAVA_TYPE, oldJavaType, javaType));
      }
    }
    return javaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetJavaType()
  {
    return javaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaType(JvmType newJavaType)
  {
    JvmType oldJavaType = javaType;
    javaType = newJavaType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HelloXbasePackage.GREETING__JAVA_TYPE, oldJavaType, javaType));
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
      case HelloXbasePackage.GREETING__NAME:
        return getName();
      case HelloXbasePackage.GREETING__JAVA_TYPE:
        if (resolve) return getJavaType();
        return basicGetJavaType();
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
      case HelloXbasePackage.GREETING__NAME:
        setName((String)newValue);
        return;
      case HelloXbasePackage.GREETING__JAVA_TYPE:
        setJavaType((JvmType)newValue);
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
      case HelloXbasePackage.GREETING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HelloXbasePackage.GREETING__JAVA_TYPE:
        setJavaType((JvmType)null);
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
      case HelloXbasePackage.GREETING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HelloXbasePackage.GREETING__JAVA_TYPE:
        return javaType != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //GreetingImpl
