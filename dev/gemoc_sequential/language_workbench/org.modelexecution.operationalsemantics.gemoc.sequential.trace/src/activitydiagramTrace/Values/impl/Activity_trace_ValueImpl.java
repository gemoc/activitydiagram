/**
 */
package activitydiagramTrace.Values.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;
import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedActivity;
import activitydiagramTrace.Traced.activitydiagram.TracedTrace;

import activitydiagramTrace.Values.Activity_trace_Value;
import activitydiagramTrace.Values.ValuesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity trace Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.impl.Activity_trace_ValueImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.impl.Activity_trace_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.impl.Activity_trace_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Activity_trace_ValueImpl extends MinimalEObjectImpl.Container implements Activity_trace_Value {
	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected TracedTrace trace;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activity_trace_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuesPackage.Literals.ACTIVITY_TRACE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTrace getTrace() {
		if (trace != null && trace.eIsProxy()) {
			InternalEObject oldTrace = (InternalEObject)trace;
			trace = (TracedTrace)eResolveProxy(oldTrace);
			if (trace != oldTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuesPackage.ACTIVITY_TRACE_VALUE__TRACE, oldTrace, trace));
			}
		}
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTrace basicGetTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(TracedTrace newTrace) {
		TracedTrace oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.ACTIVITY_TRACE_VALUE__TRACE, oldTrace, trace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivity getParent() {
		if (eContainerFeatureID() != ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT) return null;
		return (TracedActivity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedActivity newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedActivity newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_TRACE, TracedActivity.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, ValuesPackage.ACTIVITY_TRACE_VALUE__STATES, ActivitydiagramTracePackage.STATE__ACTIVITY_TRACE_VALUES);
		}
		return states;
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
			case ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedActivity)otherEnd, msgs);
			case ValuesPackage.ACTIVITY_TRACE_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case ValuesPackage.ACTIVITY_TRACE_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_TRACE, TracedActivity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValuesPackage.ACTIVITY_TRACE_VALUE__TRACE:
				if (resolve) return getTrace();
				return basicGetTrace();
			case ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT:
				return getParent();
			case ValuesPackage.ACTIVITY_TRACE_VALUE__STATES:
				return getStates();
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
			case ValuesPackage.ACTIVITY_TRACE_VALUE__TRACE:
				setTrace((TracedTrace)newValue);
				return;
			case ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT:
				setParent((TracedActivity)newValue);
				return;
			case ValuesPackage.ACTIVITY_TRACE_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case ValuesPackage.ACTIVITY_TRACE_VALUE__TRACE:
				setTrace((TracedTrace)null);
				return;
			case ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT:
				setParent((TracedActivity)null);
				return;
			case ValuesPackage.ACTIVITY_TRACE_VALUE__STATES:
				getStates().clear();
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
			case ValuesPackage.ACTIVITY_TRACE_VALUE__TRACE:
				return trace != null;
			case ValuesPackage.ACTIVITY_TRACE_VALUE__PARENT:
				return getParent() != null;
			case ValuesPackage.ACTIVITY_TRACE_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Activity_trace_ValueImpl
