/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.BooleanVariable_currentValue_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl#getBooleanVariable_currentValue_Dimension <em>Boolean Variable current Value Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedBooleanVariableImpl extends TracedVariableImpl implements TracedBooleanVariable {
	/**
	 * The cached value of the '{@link #getBooleanVariable_currentValue_Dimension() <em>Boolean Variable current Value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanVariable_currentValue_Dimension()
	 * @generated
	 * @ordered
	 */
	protected BooleanVariable_currentValue_Dimension booleanVariable_currentValue_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected BooleanVariable originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBooleanVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_BOOLEAN_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable_currentValue_Dimension getBooleanVariable_currentValue_Dimension() {
		return booleanVariable_currentValue_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanVariable_currentValue_Dimension(BooleanVariable_currentValue_Dimension newBooleanVariable_currentValue_Dimension, NotificationChain msgs) {
		BooleanVariable_currentValue_Dimension oldBooleanVariable_currentValue_Dimension = booleanVariable_currentValue_Dimension;
		booleanVariable_currentValue_Dimension = newBooleanVariable_currentValue_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION, oldBooleanVariable_currentValue_Dimension, newBooleanVariable_currentValue_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanVariable_currentValue_Dimension(BooleanVariable_currentValue_Dimension newBooleanVariable_currentValue_Dimension) {
		if (newBooleanVariable_currentValue_Dimension != booleanVariable_currentValue_Dimension) {
			NotificationChain msgs = null;
			if (booleanVariable_currentValue_Dimension != null)
				msgs = ((InternalEObject)booleanVariable_currentValue_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION, null, msgs);
			if (newBooleanVariable_currentValue_Dimension != null)
				msgs = ((InternalEObject)newBooleanVariable_currentValue_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION, null, msgs);
			msgs = basicSetBooleanVariable_currentValue_Dimension(newBooleanVariable_currentValue_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION, newBooleanVariable_currentValue_Dimension, newBooleanVariable_currentValue_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (BooleanVariable)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(BooleanVariable newOriginalObject) {
		BooleanVariable oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getBooleanVariable_currentValue_Dimension());
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION:
				return basicSetBooleanVariable_currentValue_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION:
				return getBooleanVariable_currentValue_Dimension();
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT:
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION:
				setBooleanVariable_currentValue_Dimension((BooleanVariable_currentValue_Dimension)newValue);
				return;
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT:
				setOriginalObject((BooleanVariable)newValue);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION:
				setBooleanVariable_currentValue_Dimension((BooleanVariable_currentValue_Dimension)null);
				return;
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT:
				setOriginalObject((BooleanVariable)null);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION:
				return booleanVariable_currentValue_Dimension != null;
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedBooleanVariableImpl
