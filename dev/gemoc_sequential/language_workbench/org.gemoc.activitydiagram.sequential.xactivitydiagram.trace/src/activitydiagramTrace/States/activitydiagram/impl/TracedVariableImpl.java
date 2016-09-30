/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Variable_currentValue_Value;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedVariable;

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

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl#getCurrentValueSequence <em>Current Value Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl#getOriginalObject_Variable <em>Original Object Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedVariableImpl extends MinimalEObjectImpl.Container implements TracedVariable {
	/**
	 * The cached value of the '{@link #getCurrentValueSequence() <em>Current Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_currentValue_Value> currentValueSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject_Variable() <em>Original Object Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_Variable()
	 * @generated
	 * @ordered
	 */
	protected Variable originalObject_Variable;

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
	public EList<Variable_currentValue_Value> getCurrentValueSequence() {
		if (currentValueSequence == null) {
			currentValueSequence = new EObjectContainmentWithInverseEList<Variable_currentValue_Value>(Variable_currentValue_Value.class, this, ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE, StatesPackage.VARIABLE_CURRENT_VALUE_VALUE__PARENT);
		}
		return currentValueSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getOriginalObject_Variable() {
		if (originalObject_Variable != null && originalObject_Variable.eIsProxy()) {
			InternalEObject oldOriginalObject_Variable = (InternalEObject)originalObject_Variable;
			originalObject_Variable = (Variable)eResolveProxy(oldOriginalObject_Variable);
			if (originalObject_Variable != oldOriginalObject_Variable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE, oldOriginalObject_Variable, originalObject_Variable));
			}
		}
		return originalObject_Variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetOriginalObject_Variable() {
		return originalObject_Variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_Variable(Variable newOriginalObject_Variable) {
		Variable oldOriginalObject_Variable = originalObject_Variable;
		originalObject_Variable = newOriginalObject_Variable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE, oldOriginalObject_Variable, originalObject_Variable));
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
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentValueSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				return ((InternalEList<?>)getCurrentValueSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				return getCurrentValueSequence();
			case ActivitydiagramPackage.TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE:
				if (resolve) return getOriginalObject_Variable();
				return basicGetOriginalObject_Variable();
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
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				getCurrentValueSequence().clear();
				getCurrentValueSequence().addAll((Collection<? extends Variable_currentValue_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE:
				setOriginalObject_Variable((Variable)newValue);
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
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				getCurrentValueSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE:
				setOriginalObject_Variable((Variable)null);
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
			case ActivitydiagramPackage.TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE:
				return currentValueSequence != null && !currentValueSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE:
				return originalObject_Variable != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedVariableImpl
