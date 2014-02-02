/**
 */
package org.xtext.example.hellocustomecore.hellocustomecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hello</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.hellocustomecore.hellocustomecore.Hello#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.hellocustomecore.hellocustomecore.HellocustomecorePackage#getHello()
 * @model
 * @generated
 */
public interface Hello extends Element
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
	 * @see org.xtext.example.hellocustomecore.hellocustomecore.HellocustomecorePackage#getHello_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.example.hellocustomecore.hellocustomecore.Hello#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Hello
