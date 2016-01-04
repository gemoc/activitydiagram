/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.InputValue_value_Value;
import activitydiagramTrace.States.InputValue_variable_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedInputValue;

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
 * An implementation of the model object '<em><b>Traced Input Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl#getValueSequence <em>Value Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl#getVariableSequence <em>Variable Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedInputValueImpl extends MinimalEObjectImpl.Container implements TracedInputValue {
	/**
	 * The cached value of the '{@link #getValueSequence() <em>Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue_value_Value> valueSequence;

	/**
	 * The cached value of the '{@link #getVariableSequence() <em>Variable Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue_variable_Value> variableSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedInputValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_INPUT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputValue_value_Value> getValueSequence() {
		if (valueSequence == null) {
			valueSequence = new EObjectContainmentWithInverseEList<InputValue_value_Value>(InputValue_value_Value.class, this, ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE, StatesPackage.INPUT_VALUE_VALUE_VALUE__PARENT);
		}
		return valueSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputValue_variable_Value> getVariableSequence() {
		if (variableSequence == null) {
			variableSequence = new EObjectContainmentWithInverseEList<InputValue_variable_Value>(InputValue_variable_Value.class, this, ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_SEQUENCE, StatesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT);
		}
		return variableSequence;
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValueSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariableSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				return ((InternalEList<?>)getValueSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_SEQUENCE:
				return ((InternalEList<?>)getVariableSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				return getValueSequence();
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_SEQUENCE:
				return getVariableSequence();
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				getValueSequence().clear();
				getValueSequence().addAll((Collection<? extends InputValue_value_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_SEQUENCE:
				getVariableSequence().clear();
				getVariableSequence().addAll((Collection<? extends InputValue_variable_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				getValueSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_SEQUENCE:
				getVariableSequence().clear();
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				return valueSequence != null && !valueSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_SEQUENCE:
				return variableSequence != null && !variableSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedInputValueImpl
