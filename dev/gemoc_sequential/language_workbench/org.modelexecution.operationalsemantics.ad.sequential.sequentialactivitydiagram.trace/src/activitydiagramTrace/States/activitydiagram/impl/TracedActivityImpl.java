/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagram.Activity;
import activitydiagram.Trace;

import activitydiagramTrace.States.Activity_trace_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivity;
import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;
import activitydiagramTrace.States.activitydiagram.TracedVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getLocals <em>Locals</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getTraceSequence <em>Trace Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedActivityImpl extends TracedNamedElementImpl implements TracedActivity {
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityEdge> edges;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedVariable> inputs;

	/**
	 * The cached value of the '{@link #getLocals() <em>Locals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocals()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedVariable> locals;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityNode> nodes;

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
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected Trace trace;

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
	public EList<TracedActivityEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectResolvingEList<TracedActivityEdge>(TracedActivityEdge.class, this, ActivitydiagramPackage.TRACED_ACTIVITY__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedVariable> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<TracedVariable>(TracedVariable.class, this, ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedVariable> getLocals() {
		if (locals == null) {
			locals = new EObjectResolvingEList<TracedVariable>(TracedVariable.class, this, ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS);
		}
		return locals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<TracedActivityNode>(TracedActivityNode.class, this, ActivitydiagramPackage.TRACED_ACTIVITY__NODES);
		}
		return nodes;
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
	public Trace getTrace() {
		if (trace != null && trace.eIsProxy()) {
			InternalEObject oldTrace = (InternalEObject)trace;
			trace = (Trace)eResolveProxy(oldTrace);
			if (trace != oldTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_ACTIVITY__TRACE, oldTrace, trace));
			}
		}
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace basicGetTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(Trace newTrace) {
		Trace oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY__TRACE, oldTrace, trace));
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES:
				return getEdges();
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS:
				return getInputs();
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS:
				return getLocals();
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES:
				return getNodes();
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE:
				if (resolve) return getTrace();
				return basicGetTrace();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends TracedActivityEdge>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends TracedVariable>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS:
				getLocals().clear();
				getLocals().addAll((Collection<? extends TracedVariable>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends TracedActivityNode>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				setOriginalObject((Activity)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE:
				setTrace((Trace)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES:
				getEdges().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS:
				getInputs().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS:
				getLocals().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES:
				getNodes().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				setOriginalObject((Activity)null);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE:
				setTrace((Trace)null);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES:
				return edges != null && !edges.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS:
				return locals != null && !locals.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES:
				return nodes != null && !nodes.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY__ORIGINAL_OBJECT:
				return originalObject != null;
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE:
				return trace != null;
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_SEQUENCE:
				return traceSequence != null && !traceSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityImpl
