/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.DynamicBooleanValue_value_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Dynamic Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedDynamicBooleanValueImpl#getDynamicBooleanValue_value_Dimension <em>Dynamic Boolean Value value Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedDynamicBooleanValueImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedDynamicBooleanValueImpl extends TracedValueImpl implements TracedDynamicBooleanValue {
	/**
	 * The cached value of the '{@link #getDynamicBooleanValue_value_Dimension() <em>Dynamic Boolean Value value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicBooleanValue_value_Dimension()
	 * @generated
	 * @ordered
	 */
	protected DynamicBooleanValue_value_Dimension dynamicBooleanValue_value_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected DynamicBooleanValue originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedDynamicBooleanValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_DYNAMIC_BOOLEAN_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBooleanValue_value_Dimension getDynamicBooleanValue_value_Dimension() {
		return dynamicBooleanValue_value_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicBooleanValue_value_Dimension(DynamicBooleanValue_value_Dimension newDynamicBooleanValue_value_Dimension, NotificationChain msgs) {
		DynamicBooleanValue_value_Dimension oldDynamicBooleanValue_value_Dimension = dynamicBooleanValue_value_Dimension;
		dynamicBooleanValue_value_Dimension = newDynamicBooleanValue_value_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION, oldDynamicBooleanValue_value_Dimension, newDynamicBooleanValue_value_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicBooleanValue_value_Dimension(DynamicBooleanValue_value_Dimension newDynamicBooleanValue_value_Dimension) {
		if (newDynamicBooleanValue_value_Dimension != dynamicBooleanValue_value_Dimension) {
			NotificationChain msgs = null;
			if (dynamicBooleanValue_value_Dimension != null)
				msgs = ((InternalEObject)dynamicBooleanValue_value_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION, null, msgs);
			if (newDynamicBooleanValue_value_Dimension != null)
				msgs = ((InternalEObject)newDynamicBooleanValue_value_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION, null, msgs);
			msgs = basicSetDynamicBooleanValue_value_Dimension(newDynamicBooleanValue_value_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION, newDynamicBooleanValue_value_Dimension, newDynamicBooleanValue_value_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBooleanValue getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (DynamicBooleanValue)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBooleanValue basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(DynamicBooleanValue newOriginalObject) {
		DynamicBooleanValue oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getDynamicBooleanValue_value_Dimension());
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION:
				return basicSetDynamicBooleanValue_value_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION:
				return getDynamicBooleanValue_value_Dimension();
			case ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__ORIGINAL_OBJECT:
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION:
				setDynamicBooleanValue_value_Dimension((DynamicBooleanValue_value_Dimension)newValue);
				return;
			case ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__ORIGINAL_OBJECT:
				setOriginalObject((DynamicBooleanValue)newValue);
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION:
				setDynamicBooleanValue_value_Dimension((DynamicBooleanValue_value_Dimension)null);
				return;
			case ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__ORIGINAL_OBJECT:
				setOriginalObject((DynamicBooleanValue)null);
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
			case ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION:
				return dynamicBooleanValue_value_Dimension != null;
			case ActivitydiagramPackage.TRACED_DYNAMIC_BOOLEAN_VALUE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedDynamicBooleanValueImpl
