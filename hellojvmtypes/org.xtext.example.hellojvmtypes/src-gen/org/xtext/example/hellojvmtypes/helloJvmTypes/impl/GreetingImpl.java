/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.hellojvmtypes.helloJvmTypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.common.types.JvmType;

import org.xtext.example.hellojvmtypes.helloJvmTypes.Greeting;
import org.xtext.example.hellojvmtypes.helloJvmTypes.HelloJvmTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.hellojvmtypes.helloJvmTypes.impl.GreetingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.hellojvmtypes.helloJvmTypes.impl.GreetingImpl#getJavaTypes <em>Java Types</em>}</li>
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
   * The cached value of the '{@link #getJavaTypes() <em>Java Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaTypes()
   * @generated
   * @ordered
   */
  protected EList<JvmType> javaTypes;

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
    return HelloJvmTypesPackage.Literals.GREETING;
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
      eNotify(new ENotificationImpl(this, Notification.SET, HelloJvmTypesPackage.GREETING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmType> getJavaTypes()
  {
    if (javaTypes == null)
    {
      javaTypes = new EObjectResolvingEList<JvmType>(JvmType.class, this, HelloJvmTypesPackage.GREETING__JAVA_TYPES);
    }
    return javaTypes;
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
      case HelloJvmTypesPackage.GREETING__NAME:
        return getName();
      case HelloJvmTypesPackage.GREETING__JAVA_TYPES:
        return getJavaTypes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HelloJvmTypesPackage.GREETING__NAME:
        setName((String)newValue);
        return;
      case HelloJvmTypesPackage.GREETING__JAVA_TYPES:
        getJavaTypes().clear();
        getJavaTypes().addAll((Collection<? extends JvmType>)newValue);
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
      case HelloJvmTypesPackage.GREETING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HelloJvmTypesPackage.GREETING__JAVA_TYPES:
        getJavaTypes().clear();
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
      case HelloJvmTypesPackage.GREETING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HelloJvmTypesPackage.GREETING__JAVA_TYPES:
        return javaTypes != null && !javaTypes.isEmpty();
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
