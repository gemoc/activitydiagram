/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.IntegerVariable_currentValue_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedIntegerVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl#getIntegerVariable_currentValue_Dimension <em>Integer Variable current Value Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedIntegerVariableImpl extends TracedVariableImpl implements TracedIntegerVariable {
	/**
	 * The cached value of the '{@link #getIntegerVariable_currentValue_Dimension() <em>Integer Variable current Value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerVariable_currentValue_Dimension()
	 * @generated
	 * @ordered
	 */
	protected IntegerVariable_currentValue_Dimension integerVariable_currentValue_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected IntegerVariable originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedIntegerVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_INTEGER_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable_currentValue_Dimension getIntegerVariable_currentValue_Dimension() {
		return integerVariable_currentValue_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerVariable_currentValue_Dimension(IntegerVariable_currentValue_Dimension newIntegerVariable_currentValue_Dimension, NotificationChain msgs) {
		IntegerVariable_currentValue_Dimension oldIntegerVariable_currentValue_Dimension = integerVariable_currentValue_Dimension;
		integerVariable_currentValue_Dimension = newIntegerVariable_currentValue_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION, oldIntegerVariable_currentValue_Dimension, newIntegerVariable_currentValue_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerVariable_currentValue_Dimension(IntegerVariable_currentValue_Dimension newIntegerVariable_currentValue_Dimension) {
		if (newIntegerVariable_currentValue_Dimension != integerVariable_currentValue_Dimension) {
			NotificationChain msgs = null;
			if (integerVariable_currentValue_Dimension != null)
				msgs = ((InternalEObject)integerVariable_currentValue_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION, null, msgs);
			if (newIntegerVariable_currentValue_Dimension != null)
				msgs = ((InternalEObject)newIntegerVariable_currentValue_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION, null, msgs);
			msgs = basicSetIntegerVariable_currentValue_Dimension(newIntegerVariable_currentValue_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION, newIntegerVariable_currentValue_Dimension, newIntegerVariable_currentValue_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (IntegerVariable)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(IntegerVariable newOriginalObject) {
		IntegerVariable oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getIntegerVariable_currentValue_Dimension());
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
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION:
				return basicSetIntegerVariable_currentValue_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION:
				return getIntegerVariable_currentValue_Dimension();
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION:
				setIntegerVariable_currentValue_Dimension((IntegerVariable_currentValue_Dimension)newValue);
				return;
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT:
				setOriginalObject((IntegerVariable)newValue);
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
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION:
				setIntegerVariable_currentValue_Dimension((IntegerVariable_currentValue_Dimension)null);
				return;
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT:
				setOriginalObject((IntegerVariable)null);
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
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION:
				return integerVariable_currentValue_Dimension != null;
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedIntegerVariableImpl
