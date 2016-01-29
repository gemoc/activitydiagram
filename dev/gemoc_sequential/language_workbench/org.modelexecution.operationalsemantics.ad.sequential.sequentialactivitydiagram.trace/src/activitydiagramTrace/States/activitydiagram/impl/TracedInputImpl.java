/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.Input_inputValues_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedInput;

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
 * An implementation of the model object '<em><b>Traced Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl#getInputValuesSequence <em>Input Values Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedInputImpl extends MinimalEObjectImpl.Container implements TracedInput {
	/**
	 * The cached value of the '{@link #getInputValuesSequence() <em>Input Values Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValuesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Input_inputValues_Value> inputValuesSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input_inputValues_Value> getInputValuesSequence() {
		if (inputValuesSequence == null) {
			inputValuesSequence = new EObjectContainmentWithInverseEList<Input_inputValues_Value>(Input_inputValues_Value.class, this, ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE, StatesPackage.INPUT_INPUT_VALUES_VALUE__PARENT);
		}
		return inputValuesSequence;
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputValuesSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				return ((InternalEList<?>)getInputValuesSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				return getInputValuesSequence();
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				getInputValuesSequence().clear();
				getInputValuesSequence().addAll((Collection<? extends Input_inputValues_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				getInputValuesSequence().clear();
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				return inputValuesSequence != null && !inputValuesSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedInputImpl
