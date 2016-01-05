/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagram.InputValue;
import activitydiagram.Variable;

import activitydiagramTrace.States.InputValue_value_Value;
import activitydiagramTrace.States.InputValue_variable_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedInputValue;
import activitydiagramTrace.States.activitydiagram.TracedValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl#getValueSequence <em>Value Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl#getVariableSequence <em>Variable Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedInputValueImpl extends MinimalEObjectImpl.Container implements TracedInputValue {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected InputValue originalObject;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected TracedValue value;

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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

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
	public InputValue getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (InputValue)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_INPUT_VALUE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(InputValue newOriginalObject) {
		InputValue oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_INPUT_VALUE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedValue getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (TracedValue)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedValue basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(TracedValue newValue) {
		TracedValue oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE, oldValue, value));
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
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE, oldVariable, variable));
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				return getValueSequence();
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__ORIGINAL_OBJECT:
				setOriginalObject((InputValue)newValue);
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE:
				setValue((TracedValue)newValue);
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				getValueSequence().clear();
				getValueSequence().addAll((Collection<? extends InputValue_value_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE:
				setVariable((Variable)newValue);
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__ORIGINAL_OBJECT:
				setOriginalObject((InputValue)null);
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE:
				setValue((TracedValue)null);
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				getValueSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE:
				setVariable((Variable)null);
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
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__ORIGINAL_OBJECT:
				return originalObject != null;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE:
				return value != null;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VALUE_SEQUENCE:
				return valueSequence != null && !valueSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE:
				return variable != null;
			case ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_SEQUENCE:
				return variableSequence != null && !variableSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedInputValueImpl
