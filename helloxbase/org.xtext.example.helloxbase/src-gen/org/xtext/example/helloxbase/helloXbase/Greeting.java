/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.helloxbase.helloXbase;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.helloxbase.helloXbase.Greeting#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.helloxbase.helloXbase.Greeting#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.helloxbase.helloXbase.HelloXbasePackage#getGreeting()
 * @model
 * @generated
 */
public interface Greeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.helloxbase.helloXbase.HelloXbasePackage#getGreeting_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.helloxbase.helloXbase.Greeting#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference.
   * @see #setExpressions(XExpression)
   * @see org.xtext.example.helloxbase.helloXbase.HelloXbasePackage#getGreeting_Expressions()
   * @model containment="true"
   * @generated
   */
  XExpression getExpressions();

  /**
   * Sets the value of the '{@link org.xtext.example.helloxbase.helloXbase.Greeting#getExpressions <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressions</em>' containment reference.
   * @see #getExpressions()
   * @generated
   */
  void setExpressions(XExpression value);

} // Greeting