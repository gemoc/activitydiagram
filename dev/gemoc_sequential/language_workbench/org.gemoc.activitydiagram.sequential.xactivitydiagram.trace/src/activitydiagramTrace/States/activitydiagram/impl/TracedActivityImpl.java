/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.Activity_trace_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getActivity_trace_Dimension <em>Activity trace Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedActivityImpl extends TracedNamedElementImpl implements TracedActivity {
	/**
	 * The cached value of the '{@link #getActivity_trace_Dimension() <em>Activity trace Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_trace_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Activity_trace_Dimension activity_trace_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Activity originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_trace_Dimension getActivity_trace_Dimension() {
		return activity_trace_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity_trace_Dimension(Activity_trace_Dimension newActivity_trace_Dimension, NotificationChain msgs) {
		Activity_trace_Dimension oldActivity_trace_Dimension = activity_trace_Dimension;
		activity_trace_Dimension = newActivity_trace_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION, oldActivity_trace_Dimension, newActivity_trace_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity_trace_Dimension(Activity_trace_Dimension newActivity_trace_Dimension) {
		if (newActivity_trace_Dimension != activity_trace_Dimension) {
			NotificationChain msgs = null;
			if (activity_trace_Dimension != null)
				msgs = ((InternalEObject)activity_trace_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION, null, msgs);
			if (newActivity_trace_Dimension != null)
				msgs = ((InternalEObject)newActivity_trace_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION, null, msgs);
			msgs = basicSetActivity_trace_Dimension(newActivity_trace_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION, newActivity_trace_Dimension, newActivity_trace_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Activity)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Activity newOriginalObject) {
		Activity oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getActivity_trace_Dimension());
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION:
				return basicSetActivity_trace_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION:
				return getActivity_trace_Dimension();
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION:
				setActivity_trace_Dimension((Activity_trace_Dimension)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				setOriginalObject((Activity)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION:
				setActivity_trace_Dimension((Activity_trace_Dimension)null);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				setOriginalObject((Activity)null);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION:
				return activity_trace_Dimension != null;
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityImpl
