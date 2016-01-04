/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.NamedElement_name_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedNamedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedNamedElementImpl#getNameSequence <em>Name Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedNamedElementImpl extends MinimalEObjectImpl.Container implements TracedNamedElement {
	/**
	 * The cached value of the '{@link #getNameSequence() <em>Name Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement_name_Value> nameSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedNamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement_name_Value> getNameSequence() {
		if (nameSequence == null) {
			nameSequence = new EObjectContainmentWithInverseEList<NamedElement_name_Value>(NamedElement_name_Value.class, this, ActivitydiagramPackage.TRACED_NAMED_ELEMENT__NAME_SEQUENCE, StatesPackage.NAMED_ELEMENT_NAME_VALUE__PARENT);
		}
		return nameSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_NAMED_ELEMENT__NAME_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNameSequence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_NAMED_ELEMENT__NAME_SEQUENCE:
				return ((InternalEList<?>)getNameSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_NAMED_ELEMENT__NAME_SEQUENCE:
				return getNameSequence();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_NAMED_ELEMENT__NAME_SEQUENCE:
				getNameSequence().clear();
				getNameSequence().addAll((Collection<? extends NamedElement_name_Value>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_NAMED_ELEMENT__NAME_SEQUENCE:
				getNameSequence().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_NAMED_ELEMENT__NAME_SEQUENCE:
				return nameSequence != null && !nameSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedNamedElementImpl
