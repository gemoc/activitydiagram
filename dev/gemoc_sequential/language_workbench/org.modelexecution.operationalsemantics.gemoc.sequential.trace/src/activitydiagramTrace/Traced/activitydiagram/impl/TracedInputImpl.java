/**
 */
package activitydiagramTrace.Traced.activitydiagram.impl;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedInput;

import activitydiagramTrace.Values.Input_inputValues_Value;
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
 * An implementation of the model object '<em><b>Traced Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedInputImpl#getInputValuesTrace <em>Input Values Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedInputImpl extends MinimalEObjectImpl.Container implements TracedInput {
	/**
	 * The cached value of the '{@link #getInputValuesTrace() <em>Input Values Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValuesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<Input_inputValues_Value> inputValuesTrace;

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
	public EList<Input_inputValues_Value> getInputValuesTrace() {
		if (inputValuesTrace == null) {
			inputValuesTrace = new EObjectContainmentWithInverseEList<Input_inputValues_Value>(Input_inputValues_Value.class, this, ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_TRACE, ValuesPackage.INPUT_INPUT_VALUES_VALUE__PARENT);
		}
		return inputValuesTrace;
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputValuesTrace()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_TRACE:
				return ((InternalEList<?>)getInputValuesTrace()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_TRACE:
				return getInputValuesTrace();
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_TRACE:
				getInputValuesTrace().clear();
				getInputValuesTrace().addAll((Collection<? extends Input_inputValues_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_TRACE:
				getInputValuesTrace().clear();
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_TRACE:
				return inputValuesTrace != null && !inputValuesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedInputImpl
