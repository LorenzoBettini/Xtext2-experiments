/**
 */
package org.xtext.example.hellocustomecore.hellocustomecore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.hellocustomecore.hellocustomecore.HellocustomecorePackage
 * @generated
 */
public interface HellocustomecoreFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HellocustomecoreFactory eINSTANCE = org.xtext.example.hellocustomecore.hellocustomecore.impl.HellocustomecoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Hello</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hello</em>'.
	 * @generated
	 */
	Hello createHello();

	/**
	 * Returns a new object of class '<em>Greeting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greeting</em>'.
	 * @generated
	 */
	Greeting createGreeting();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HellocustomecorePackage getHellocustomecorePackage();

} //HellocustomecoreFactory
