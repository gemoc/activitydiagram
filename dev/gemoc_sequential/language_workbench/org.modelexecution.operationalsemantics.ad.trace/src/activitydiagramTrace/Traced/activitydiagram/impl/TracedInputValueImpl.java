/**
 */
package activitydiagramTrace.Traced.activitydiagram.impl;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedInputValue;

import activitydiagramTrace.Values.InputValue_value_Value;
import activitydiagramTrace.Values.InputValue_variable_Value;
import activitydiagramTrace.Values.ValuesPackage;

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
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedInputValueImpl#getValueTrace <em>Value Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedInputValueImpl#getVariableTrace <em>Variable Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedInputValueImpl extends MinimalEObjectImpl.Container implements TracedInputValue {
	/**
	 * The cached value of the '{@link #getValueTrace() <em>Value Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue_value_Value> valueTrace;

	/**
	 * The cached value of the '{@link #getVariableTrace() <em>Variable Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue_variable_Value> variableTrace;

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
	public EList<InputValue_value_Value> getValueTrace() {
		if (valueTrace == null) {
			valueTrace = new EObjectContainmentWithInverseEList<InputValue_value_Value>(InputValue_value_Value.class, this, ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_TRACE, ValuesPackage.INPUT_VALUE_VALUE_VALUE__PARENT);
		}
		return valueTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputValue_variable_Value> getVariableTrace() {
		if (variableTrace == null) {
			variableTrace = new EObjectContainmentWithInverseEList<InputValue_variable_Value>(InputValue_variable_Value.class, this, ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_TRACE, ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT);
		}
		return variableTrace;
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValueTrace()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariableTrace()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_TRACE:
				return ((InternalEList<?>)getValueTrace()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_TRACE:
				return ((InternalEList<?>)getVariableTrace()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_TRACE:
				return getValueTrace();
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_TRACE:
				return getVariableTrace();
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_TRACE:
				getValueTrace().clear();
				getValueTrace().addAll((Collection<? extends InputValue_value_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_TRACE:
				getVariableTrace().clear();
				getVariableTrace().addAll((Collection<? extends InputValue_variable_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_TRACE:
				getValueTrace().clear();
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_TRACE:
				getVariableTrace().clear();
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_TRACE:
				return valueTrace != null && !valueTrace.isEmpty();
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_TRACE:
				return variableTrace != null && !variableTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedInputValueImpl
