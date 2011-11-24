/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.helloxvars.helloXvars.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

import org.xtext.example.helloxvars.helloXvars.Greeting;
import org.xtext.example.helloxvars.helloXvars.HelloXvarsPackage;
import org.xtext.example.helloxvars.helloXvars.Import;
import org.xtext.example.helloxvars.helloXvars.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.helloxvars.helloXvars.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.example.helloxvars.helloXvars.impl.ModelImpl#getVarDeclarations <em>Var Declarations</em>}</li>
 *   <li>{@link org.xtext.example.helloxvars.helloXvars.impl.ModelImpl#getGreetings <em>Greetings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getVarDeclarations() <em>Var Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarDeclarations()
   * @generated
   * @ordered
   */
  protected EList<XExpression> varDeclarations;

  /**
   * The cached value of the '{@link #getGreetings() <em>Greetings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreetings()
   * @generated
   * @ordered
   */
  protected EList<Greeting> greetings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return HelloXvarsPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, HelloXvarsPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getVarDeclarations()
  {
    if (varDeclarations == null)
    {
      varDeclarations = new EObjectContainmentEList<XExpression>(XExpression.class, this, HelloXvarsPackage.MODEL__VAR_DECLARATIONS);
    }
    return varDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Greeting> getGreetings()
  {
    if (greetings == null)
    {
      greetings = new EObjectContainmentEList<Greeting>(Greeting.class, this, HelloXvarsPackage.MODEL__GREETINGS);
    }
    return greetings;
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
      case HelloXvarsPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case HelloXvarsPackage.MODEL__VAR_DECLARATIONS:
        return ((InternalEList<?>)getVarDeclarations()).basicRemove(otherEnd, msgs);
      case HelloXvarsPackage.MODEL__GREETINGS:
        return ((InternalEList<?>)getGreetings()).basicRemove(otherEnd, msgs);
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
      case HelloXvarsPackage.MODEL__IMPORTS:
        return getImports();
      case HelloXvarsPackage.MODEL__VAR_DECLARATIONS:
        return getVarDeclarations();
      case HelloXvarsPackage.MODEL__GREETINGS:
        return getGreetings();
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
      case HelloXvarsPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case HelloXvarsPackage.MODEL__VAR_DECLARATIONS:
        getVarDeclarations().clear();
        getVarDeclarations().addAll((Collection<? extends XExpression>)newValue);
        return;
      case HelloXvarsPackage.MODEL__GREETINGS:
        getGreetings().clear();
        getGreetings().addAll((Collection<? extends Greeting>)newValue);
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
      case HelloXvarsPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case HelloXvarsPackage.MODEL__VAR_DECLARATIONS:
        getVarDeclarations().clear();
        return;
      case HelloXvarsPackage.MODEL__GREETINGS:
        getGreetings().clear();
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
      case HelloXvarsPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case HelloXvarsPackage.MODEL__VAR_DECLARATIONS:
        return varDeclarations != null && !varDeclarations.isEmpty();
      case HelloXvarsPackage.MODEL__GREETINGS:
        return greetings != null && !greetings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
