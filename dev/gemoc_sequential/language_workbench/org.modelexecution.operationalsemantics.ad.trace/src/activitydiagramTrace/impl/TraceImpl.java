/**
 */
package activitydiagramTrace.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;
import activitydiagramTrace.State;

import activitydiagramTrace.Steps.Steps;

import activitydiagramTrace.Trace;

import activitydiagramTrace.Traced.TracedObjects;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.impl.TraceImpl#getStatesTrace <em>States Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.TraceImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.TraceImpl#getTracedObjects <em>Traced Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected Steps steps;

	/**
	 * The cached value of the '{@link #getTracedObjects() <em>Traced Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracedObjects()
	 * @generated
	 * @ordered
	 */
	protected TracedObjects tracedObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramTracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, ActivitydiagramTracePackage.TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Steps getSteps() {
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteps(Steps newSteps, NotificationChain msgs) {
		Steps oldSteps = steps;
		steps = newSteps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramTracePackage.TRACE__STEPS, oldSteps, newSteps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteps(Steps newSteps) {
		if (newSteps != steps) {
			NotificationChain msgs = null;
			if (steps != null)
				msgs = ((InternalEObject)steps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramTracePackage.TRACE__STEPS, null, msgs);
			if (newSteps != null)
				msgs = ((InternalEObject)newSteps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramTracePackage.TRACE__STEPS, null, msgs);
			msgs = basicSetSteps(newSteps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramTracePackage.TRACE__STEPS, newSteps, newSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObjects getTracedObjects() {
		return tracedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTracedObjects(TracedObjects newTracedObjects, NotificationChain msgs) {
		TracedObjects oldTracedObjects = tracedObjects;
		tracedObjects = newTracedObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramTracePackage.TRACE__TRACED_OBJECTS, oldTracedObjects, newTracedObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTracedObjects(TracedObjects newTracedObjects) {
		if (newTracedObjects != tracedObjects) {
			NotificationChain msgs = null;
			if (tracedObjects != null)
				msgs = ((InternalEObject)tracedObjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramTracePackage.TRACE__TRACED_OBJECTS, null, msgs);
			if (newTracedObjects != null)
				msgs = ((InternalEObject)newTracedObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramTracePackage.TRACE__TRACED_OBJECTS, null, msgs);
			msgs = basicSetTracedObjects(newTracedObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramTracePackage.TRACE__TRACED_OBJECTS, newTracedObjects, newTracedObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramTracePackage.TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.TRACE__STEPS:
				return basicSetSteps(null, msgs);
			case ActivitydiagramTracePackage.TRACE__TRACED_OBJECTS:
				return basicSetTracedObjects(null, msgs);
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
			case ActivitydiagramTracePackage.TRACE__STATES_TRACE:
				return getStatesTrace();
			case ActivitydiagramTracePackage.TRACE__STEPS:
				return getSteps();
			case ActivitydiagramTracePackage.TRACE__TRACED_OBJECTS:
				return getTracedObjects();
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
			case ActivitydiagramTracePackage.TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
			case ActivitydiagramTracePackage.TRACE__STEPS:
				setSteps((Steps)newValue);
				return;
			case ActivitydiagramTracePackage.TRACE__TRACED_OBJECTS:
				setTracedObjects((TracedObjects)newValue);
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
			case ActivitydiagramTracePackage.TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
			case ActivitydiagramTracePackage.TRACE__STEPS:
				setSteps((Steps)null);
				return;
			case ActivitydiagramTracePackage.TRACE__TRACED_OBJECTS:
				setTracedObjects((TracedObjects)null);
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
			case ActivitydiagramTracePackage.TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
			case ActivitydiagramTracePackage.TRACE__STEPS:
				return steps != null;
			case ActivitydiagramTracePackage.TRACE__TRACED_OBJECTS:
				return tracedObjects != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
