/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.helloinferrer.helloInferrer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.helloinferrer.helloInferrer.Greeting#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.helloinferrer.helloInferrer.Greeting#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.helloinferrer.helloInferrer.HelloInferrerPackage#getGreeting()
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
   * @see org.xtext.example.helloinferrer.helloInferrer.HelloInferrerPackage#getGreeting_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.helloinferrer.helloInferrer.Greeting#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.helloinferrer.helloInferrer.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.example.helloinferrer.helloInferrer.HelloInferrerPackage#getGreeting_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // Greeting
