/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagram.Input;

import activitydiagramTrace.States.Input_inputValues_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedInput;
import activitydiagramTrace.States.activitydiagram.TracedInputValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl#getInputValues <em>Input Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl#getInputValuesSequence <em>Input Values Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedInputImpl extends MinimalEObjectImpl.Container implements TracedInput {
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
	 * The cached value of the '{@link #getInputValuesSequence() <em>Input Values Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValuesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Input_inputValues_Value> inputValuesSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Input originalObject;

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
	public EList<TracedInputValue> getInputValues() {
		if (inputValues == null) {
			inputValues = new EObjectResolvingEList<TracedInputValue>(TracedInputValue.class, this, ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES);
		}
		return inputValues;
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
	public Input getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Input)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_INPUT__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Input newOriginalObject) {
		Input oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_INPUT__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES:
				return getInputValues();
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				return getInputValuesSequence();
			case ActivitydiagramPackage.TRACED_INPUT__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES:
				getInputValues().clear();
				getInputValues().addAll((Collection<? extends TracedInputValue>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				getInputValuesSequence().clear();
				getInputValuesSequence().addAll((Collection<? extends Input_inputValues_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_INPUT__ORIGINAL_OBJECT:
				setOriginalObject((Input)newValue);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES:
				getInputValues().clear();
				return;
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				getInputValuesSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_INPUT__ORIGINAL_OBJECT:
				setOriginalObject((Input)null);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES:
				return inputValues != null && !inputValues.isEmpty();
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_VALUES_SEQUENCE:
				return inputValuesSequence != null && !inputValuesSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_INPUT__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedInputImpl
