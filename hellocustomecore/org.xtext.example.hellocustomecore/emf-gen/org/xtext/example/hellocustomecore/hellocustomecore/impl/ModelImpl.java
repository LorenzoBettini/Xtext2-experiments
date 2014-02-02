/**
 */
package org.xtext.example.hellocustomecore.hellocustomecore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtype.XImportSection;

import org.xtext.example.hellocustomecore.hellocustomecore.Greeting;
import org.xtext.example.hellocustomecore.hellocustomecore.Hello;
import org.xtext.example.hellocustomecore.hellocustomecore.HellocustomecorePackage;
import org.xtext.example.hellocustomecore.hellocustomecore.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.hellocustomecore.hellocustomecore.impl.ModelImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.xtext.example.hellocustomecore.hellocustomecore.impl.ModelImpl#getHellos <em>Hellos</em>}</li>
 *   <li>{@link org.xtext.example.hellocustomecore.hellocustomecore.impl.ModelImpl#getGreetings <em>Greetings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
	/**
	 * The cached value of the '{@link #getImportSection() <em>Import Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportSection()
	 * @generated
	 * @ordered
	 */
	protected XImportSection importSection;

	/**
	 * The cached value of the '{@link #getHellos() <em>Hellos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHellos()
	 * @generated
	 * @ordered
	 */
	protected EList<Hello> hellos;

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
		return HellocustomecorePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XImportSection getImportSection()
	{
		return importSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportSection(XImportSection newImportSection, NotificationChain msgs)
	{
		XImportSection oldImportSection = importSection;
		importSection = newImportSection;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HellocustomecorePackage.MODEL__IMPORT_SECTION, oldImportSection, newImportSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportSection(XImportSection newImportSection)
	{
		if (newImportSection != importSection)
		{
			NotificationChain msgs = null;
			if (importSection != null)
				msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HellocustomecorePackage.MODEL__IMPORT_SECTION, null, msgs);
			if (newImportSection != null)
				msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HellocustomecorePackage.MODEL__IMPORT_SECTION, null, msgs);
			msgs = basicSetImportSection(newImportSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HellocustomecorePackage.MODEL__IMPORT_SECTION, newImportSection, newImportSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hello> getHellos()
	{
		if (hellos == null)
		{
			hellos = new EObjectContainmentEList<Hello>(Hello.class, this, HellocustomecorePackage.MODEL__HELLOS);
		}
		return hellos;
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
			greetings = new EObjectContainmentEList<Greeting>(Greeting.class, this, HellocustomecorePackage.MODEL__GREETINGS);
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
			case HellocustomecorePackage.MODEL__IMPORT_SECTION:
				return basicSetImportSection(null, msgs);
			case HellocustomecorePackage.MODEL__HELLOS:
				return ((InternalEList<?>)getHellos()).basicRemove(otherEnd, msgs);
			case HellocustomecorePackage.MODEL__GREETINGS:
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
			case HellocustomecorePackage.MODEL__IMPORT_SECTION:
				return getImportSection();
			case HellocustomecorePackage.MODEL__HELLOS:
				return getHellos();
			case HellocustomecorePackage.MODEL__GREETINGS:
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
			case HellocustomecorePackage.MODEL__IMPORT_SECTION:
				setImportSection((XImportSection)newValue);
				return;
			case HellocustomecorePackage.MODEL__HELLOS:
				getHellos().clear();
				getHellos().addAll((Collection<? extends Hello>)newValue);
				return;
			case HellocustomecorePackage.MODEL__GREETINGS:
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
			case HellocustomecorePackage.MODEL__IMPORT_SECTION:
				setImportSection((XImportSection)null);
				return;
			case HellocustomecorePackage.MODEL__HELLOS:
				getHellos().clear();
				return;
			case HellocustomecorePackage.MODEL__GREETINGS:
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
			case HellocustomecorePackage.MODEL__IMPORT_SECTION:
				return importSection != null;
			case HellocustomecorePackage.MODEL__HELLOS:
				return hellos != null && !hellos.isEmpty();
			case HellocustomecorePackage.MODEL__GREETINGS:
				return greetings != null && !greetings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
