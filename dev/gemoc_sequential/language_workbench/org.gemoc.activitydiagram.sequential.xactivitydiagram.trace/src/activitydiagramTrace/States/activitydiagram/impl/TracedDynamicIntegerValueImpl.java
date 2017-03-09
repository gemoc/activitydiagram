/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.DynamicIntegerValue_value_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Dynamic Integer Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedDynamicIntegerValueImpl#getDynamicIntegerValue_value_Dimension <em>Dynamic Integer Value value Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedDynamicIntegerValueImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedDynamicIntegerValueImpl extends TracedValueImpl implements TracedDynamicIntegerValue {
	/**
	 * The cached value of the '{@link #getDynamicIntegerValue_value_Dimension() <em>Dynamic Integer Value value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicIntegerValue_value_Dimension()
	 * @generated
	 * @ordered
	 */
	protected DynamicIntegerValue_value_Dimension dynamicIntegerValue_value_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected DynamicIntegerValue originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedDynamicIntegerValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_DYNAMIC_INTEGER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicIntegerValue_value_Dimension getDynamicIntegerValue_value_Dimension() {
		return dynamicIntegerValue_value_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicIntegerValue_value_Dimension(DynamicIntegerValue_value_Dimension newDynamicIntegerValue_value_Dimension, NotificationChain msgs) {
		DynamicIntegerValue_value_Dimension oldDynamicIntegerValue_value_Dimension = dynamicIntegerValue_value_Dimension;
		dynamicIntegerValue_value_Dimension = newDynamicIntegerValue_value_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION, oldDynamicIntegerValue_value_Dimension, newDynamicIntegerValue_value_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicIntegerValue_value_Dimension(DynamicIntegerValue_value_Dimension newDynamicIntegerValue_value_Dimension) {
		if (newDynamicIntegerValue_value_Dimension != dynamicIntegerValue_value_Dimension) {
			NotificationChain msgs = null;
			if (dynamicIntegerValue_value_Dimension != null)
				msgs = ((InternalEObject)dynamicIntegerValue_value_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION, null, msgs);
			if (newDynamicIntegerValue_value_Dimension != null)
				msgs = ((InternalEObject)newDynamicIntegerValue_value_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION, null, msgs);
			msgs = basicSetDynamicIntegerValue_value_Dimension(newDynamicIntegerValue_value_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION, newDynamicIntegerValue_value_Dimension, newDynamicIntegerValue_value_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicIntegerValue getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (DynamicIntegerValue)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicIntegerValue basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(DynamicIntegerValue newOriginalObject) {
		DynamicIntegerValue oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getDynamicIntegerValue_value_Dimension());
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION:
				return basicSetDynamicIntegerValue_value_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION:
				return getDynamicIntegerValue_value_Dimension();
			case ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__ORIGINAL_OBJECT:
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION:
				setDynamicIntegerValue_value_Dimension((DynamicIntegerValue_value_Dimension)newValue);
				return;
			case ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__ORIGINAL_OBJECT:
				setOriginalObject((DynamicIntegerValue)newValue);
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION:
				setDynamicIntegerValue_value_Dimension((DynamicIntegerValue_value_Dimension)null);
				return;
			case ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__ORIGINAL_OBJECT:
				setOriginalObject((DynamicIntegerValue)null);
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION:
				return dynamicIntegerValue_value_Dimension != null;
			case ActivitydiagramPackage.TRACED_DYNAMIC_INTEGER_VALUE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedDynamicIntegerValueImpl
