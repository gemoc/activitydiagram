/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.Activity_trace_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getTraceSequence <em>Trace Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedActivityImpl extends TracedNamedElementImpl implements TracedActivity {
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
	 * The cached value of the '{@link #getTraceSequence() <em>Trace Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_trace_Value> traceSequence;

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
	public EList<Activity_trace_Value> getTraceSequence() {
		if (traceSequence == null) {
			traceSequence = new EObjectContainmentWithInverseEList<Activity_trace_Value>(Activity_trace_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_SEQUENCE, StatesPackage.ACTIVITY_TRACE_VALUE__PARENT);
		}
		return traceSequence;
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraceSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_SEQUENCE:
				return ((InternalEList<?>)getTraceSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_SEQUENCE:
				return getTraceSequence();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				setOriginalObject((Activity)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_SEQUENCE:
				getTraceSequence().clear();
				getTraceSequence().addAll((Collection<? extends Activity_trace_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				setOriginalObject((Activity)null);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_SEQUENCE:
				getTraceSequence().clear();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				return originalObject != null;
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_SEQUENCE:
				return traceSequence != null && !traceSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityImpl
