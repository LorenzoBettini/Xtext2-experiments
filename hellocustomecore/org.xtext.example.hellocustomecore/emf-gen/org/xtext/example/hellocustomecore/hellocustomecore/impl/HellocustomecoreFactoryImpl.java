/**
 */
package org.xtext.example.hellocustomecore.hellocustomecore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.hellocustomecore.hellocustomecore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HellocustomecoreFactoryImpl extends EFactoryImpl implements HellocustomecoreFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HellocustomecoreFactory init()
	{
		try
		{
			HellocustomecoreFactory theHellocustomecoreFactory = (HellocustomecoreFactory)EPackage.Registry.INSTANCE.getEFactory(HellocustomecorePackage.eNS_URI);
			if (theHellocustomecoreFactory != null)
			{
				return theHellocustomecoreFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HellocustomecoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HellocustomecoreFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case HellocustomecorePackage.MODEL: return createModel();
			case HellocustomecorePackage.HELLO: return createHello();
			case HellocustomecorePackage.GREETING: return createGreeting();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel()
	{
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hello createHello()
	{
		HelloImpl hello = new HelloImpl();
		return hello;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greeting createGreeting()
	{
		GreetingImpl greeting = new GreetingImpl();
		return greeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HellocustomecorePackage getHellocustomecorePackage()
	{
		return (HellocustomecorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HellocustomecorePackage getPackage()
	{
		return HellocustomecorePackage.eINSTANCE;
	}

} //HellocustomecoreFactoryImpl
