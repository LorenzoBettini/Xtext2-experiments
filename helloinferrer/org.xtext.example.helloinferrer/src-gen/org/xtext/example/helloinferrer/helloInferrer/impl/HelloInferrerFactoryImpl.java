/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.helloinferrer.helloInferrer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.helloinferrer.helloInferrer.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelloInferrerFactoryImpl extends EFactoryImpl implements HelloInferrerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HelloInferrerFactory init()
  {
    try
    {
      HelloInferrerFactory theHelloInferrerFactory = (HelloInferrerFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/helloinferrer/HelloInferrer"); 
      if (theHelloInferrerFactory != null)
      {
        return theHelloInferrerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HelloInferrerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelloInferrerFactoryImpl()
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
      case HelloInferrerPackage.MODEL: return createModel();
      case HelloInferrerPackage.IMPORT: return createImport();
      case HelloInferrerPackage.GREETING: return createGreeting();
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
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
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
  public HelloInferrerPackage getHelloInferrerPackage()
  {
    return (HelloInferrerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HelloInferrerPackage getPackage()
  {
    return HelloInferrerPackage.eINSTANCE;
  }

} //HelloInferrerFactoryImpl
