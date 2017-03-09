/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.Input_inputValues_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedInput;

import activitydiagramTrace.States.impl.SpecificTracedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl#getInput_inputValues_Dimension <em>Input input Values Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedInputImpl extends SpecificTracedObjectImpl<SpecificDimension<?>> implements TracedInput {
	/**
	 * The cached value of the '{@link #getInput_inputValues_Dimension() <em>Input input Values Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_inputValues_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Input_inputValues_Dimension input_inputValues_Dimension;

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
	public Input_inputValues_Dimension getInput_inputValues_Dimension() {
		return input_inputValues_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput_inputValues_Dimension(Input_inputValues_Dimension newInput_inputValues_Dimension, NotificationChain msgs) {
		Input_inputValues_Dimension oldInput_inputValues_Dimension = input_inputValues_Dimension;
		input_inputValues_Dimension = newInput_inputValues_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION, oldInput_inputValues_Dimension, newInput_inputValues_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_inputValues_Dimension(Input_inputValues_Dimension newInput_inputValues_Dimension) {
		if (newInput_inputValues_Dimension != input_inputValues_Dimension) {
			NotificationChain msgs = null;
			if (input_inputValues_Dimension != null)
				msgs = ((InternalEObject)input_inputValues_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION, null, msgs);
			if (newInput_inputValues_Dimension != null)
				msgs = ((InternalEObject)newInput_inputValues_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION, null, msgs);
			msgs = basicSetInput_inputValues_Dimension(newInput_inputValues_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION, newInput_inputValues_Dimension, newInput_inputValues_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getInput_inputValues_Dimension());
		return result;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION:
				return basicSetInput_inputValues_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION:
				return getInput_inputValues_Dimension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION:
				setInput_inputValues_Dimension((Input_inputValues_Dimension)newValue);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION:
				setInput_inputValues_Dimension((Input_inputValues_Dimension)null);
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
			case ActivitydiagramPackage.TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION:
				return input_inputValues_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedInputImpl
