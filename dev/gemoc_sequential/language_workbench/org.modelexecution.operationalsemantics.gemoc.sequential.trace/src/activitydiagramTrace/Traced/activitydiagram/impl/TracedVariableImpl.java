/**
 */
package activitydiagramTrace.Traced.activitydiagram.impl;

import activitydiagram.Value;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedVariable;

import activitydiagramTrace.Values.ValuesPackage;
import activitydiagramTrace.Values.Variable_currentValue_Value;

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
 * An implementation of the model object '<em><b>Traced Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedVariableImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedVariableImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedVariableImpl#getCurrentValueTrace <em>Current Value Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedVariableImpl extends MinimalEObjectImpl.Container implements TracedVariable {
	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected Value initialValue;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected Value currentValue;

	/**
	 * The cached value of the '{@link #getCurrentValueTrace() <em>Current Value Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValueTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_currentValue_Value> currentValueTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getInitialValue() {
		if (initialValue != null && initialValue.eIsProxy()) {
			InternalEObject oldInitialValue = (InternalEObject)initialValue;
			initialValue = (Value)eResolveProxy(oldInitialValue);
			if (initialValue != oldInitialValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE, oldInitialValue, initialValue));
			}
		}
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(Value newInitialValue) {
		Value oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getCurrentValue() {
		if (currentValue != null && currentValue.eIsProxy()) {
			InternalEObject oldCurrentValue = (InternalEObject)currentValue;
			currentValue = (Value)eResolveProxy(oldCurrentValue);
			if (currentValue != oldCurrentValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE, oldCurrentValue, currentValue));
			}
		}
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(Value newCurrentValue) {
		Value oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE, oldCurrentValue, currentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_currentValue_Value> getCurrentValueTrace() {
		if (currentValueTrace == null) {
			currentValueTrace = new EObjectContainmentWithInverseEList<Variable_currentValue_Value>(Variable_currentValue_Value.class, this, ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_TRACE, ValuesPackage.VARIABLE_CURRENT_VALUE_VALUE__PARENT);
		}
		return currentValueTrace;
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
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentValueTrace()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_TRACE:
				return ((InternalEList<?>)getCurrentValueTrace()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE:
				if (resolve) return getInitialValue();
				return basicGetInitialValue();
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE:
				if (resolve) return getCurrentValue();
				return basicGetCurrentValue();
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_TRACE:
				return getCurrentValueTrace();
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
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE:
				setInitialValue((Value)newValue);
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE:
				setCurrentValue((Value)newValue);
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_TRACE:
				getCurrentValueTrace().clear();
				getCurrentValueTrace().addAll((Collection<? extends Variable_currentValue_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE:
				setInitialValue((Value)null);
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE:
				setCurrentValue((Value)null);
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_TRACE:
				getCurrentValueTrace().clear();
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
			case ActivitydiagramPackage.TRACED_VARIABLE__INITIAL_VALUE:
				return initialValue != null;
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE:
				return currentValue != null;
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_TRACE:
				return currentValueTrace != null && !currentValueTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedVariableImpl
