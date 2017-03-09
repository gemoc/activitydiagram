/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.Input_inputValues_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.TracedInputValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input input Values Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.Input_inputValues_ValueImpl#getInputValues <em>Input Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Input_inputValues_ValueImpl extends SpecificValueImpl implements Input_inputValues_Value {
	/**
	 * The cached value of the '{@link #getInputValues() <em>Input Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInputValue> inputValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Input_inputValues_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.INPUT_INPUT_VALUES_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInputValue> getInputValues() {
		if (inputValues == null) {
			inputValues = new EObjectResolvingEList<TracedInputValue>(TracedInputValue.class, this, StatesPackage.INPUT_INPUT_VALUES_VALUE__INPUT_VALUES);
		}
		return inputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.INPUT_INPUT_VALUES_VALUE__INPUT_VALUES:
				return getInputValues();
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
			case StatesPackage.INPUT_INPUT_VALUES_VALUE__INPUT_VALUES:
				getInputValues().clear();
				getInputValues().addAll((Collection<? extends TracedInputValue>)newValue);
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
			case StatesPackage.INPUT_INPUT_VALUES_VALUE__INPUT_VALUES:
				getInputValues().clear();
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
			case StatesPackage.INPUT_INPUT_VALUES_VALUE__INPUT_VALUES:
				return inputValues != null && !inputValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Input_inputValues_ValueImpl
