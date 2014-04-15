/**
 */
package org.xtext.example.helloxcore.helloxcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.helloxcore.helloxcore.Model#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.xtext.example.helloxcore.helloxcore.Model#getHellos <em>Hellos</em>}</li>
 *   <li>{@link org.xtext.example.helloxcore.helloxcore.Model#getGreetings <em>Greetings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.helloxcore.helloxcore.HelloxcorePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see org.xtext.example.helloxcore.helloxcore.HelloxcorePackage#getModel_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link org.xtext.example.helloxcore.helloxcore.Model#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

  /**
   * Returns the value of the '<em><b>Hellos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.helloxcore.helloxcore.Hello}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hellos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hellos</em>' containment reference list.
   * @see org.xtext.example.helloxcore.helloxcore.HelloxcorePackage#getModel_Hellos()
   * @model containment="true"
   * @generated
   */
  EList<Hello> getHellos();

  /**
   * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.helloxcore.helloxcore.Greeting}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greetings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greetings</em>' containment reference list.
   * @see org.xtext.example.helloxcore.helloxcore.HelloxcorePackage#getModel_Greetings()
   * @model containment="true"
   * @generated
   */
  EList<Greeting> getGreetings();

} // Model
