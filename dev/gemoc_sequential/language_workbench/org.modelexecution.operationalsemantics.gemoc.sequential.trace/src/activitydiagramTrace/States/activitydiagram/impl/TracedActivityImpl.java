/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.Activity_edges_Value;
import activitydiagramTrace.States.Activity_inputs_Value;
import activitydiagramTrace.States.Activity_locals_Value;
import activitydiagramTrace.States.Activity_nodes_Value;
import activitydiagramTrace.States.Activity_trace_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivity;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getLocalsSequence <em>Locals Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getEdgesSequence <em>Edges Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getInputsSequence <em>Inputs Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getNodesSequence <em>Nodes Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl#getTraceSequence <em>Trace Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedActivityImpl extends TracedNamedElementImpl implements TracedActivity {
	/**
	 * The cached value of the '{@link #getLocalsSequence() <em>Locals Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalsSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_locals_Value> localsSequence;

	/**
	 * The cached value of the '{@link #getEdgesSequence() <em>Edges Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_edges_Value> edgesSequence;

	/**
	 * The cached value of the '{@link #getInputsSequence() <em>Inputs Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_inputs_Value> inputsSequence;

	/**
	 * The cached value of the '{@link #getNodesSequence() <em>Nodes Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_nodes_Value> nodesSequence;

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
	public EList<Activity_locals_Value> getLocalsSequence() {
		if (localsSequence == null) {
			localsSequence = new EObjectContainmentWithInverseEList<Activity_locals_Value>(Activity_locals_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS_SEQUENCE, StatesPackage.ACTIVITY_LOCALS_VALUE__PARENT);
		}
		return localsSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_edges_Value> getEdgesSequence() {
		if (edgesSequence == null) {
			edgesSequence = new EObjectContainmentWithInverseEList<Activity_edges_Value>(Activity_edges_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY__EDGES_SEQUENCE, StatesPackage.ACTIVITY_EDGES_VALUE__PARENT);
		}
		return edgesSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_inputs_Value> getInputsSequence() {
		if (inputsSequence == null) {
			inputsSequence = new EObjectContainmentWithInverseEList<Activity_inputs_Value>(Activity_inputs_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS_SEQUENCE, StatesPackage.ACTIVITY_INPUTS_VALUE__PARENT);
		}
		return inputsSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_nodes_Value> getNodesSequence() {
		if (nodesSequence == null) {
			nodesSequence = new EObjectContainmentWithInverseEList<Activity_nodes_Value>(Activity_nodes_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY__NODES_SEQUENCE, StatesPackage.ACTIVITY_NODES_VALUE__PARENT);
		}
		return nodesSequence;
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocalsSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdgesSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputsSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodesSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS_SEQUENCE:
				return ((InternalEList<?>)getLocalsSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES_SEQUENCE:
				return ((InternalEList<?>)getEdgesSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS_SEQUENCE:
				return ((InternalEList<?>)getInputsSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES_SEQUENCE:
				return ((InternalEList<?>)getNodesSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS_SEQUENCE:
				return getLocalsSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES_SEQUENCE:
				return getEdgesSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS_SEQUENCE:
				return getInputsSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES_SEQUENCE:
				return getNodesSequence();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS_SEQUENCE:
				getLocalsSequence().clear();
				getLocalsSequence().addAll((Collection<? extends Activity_locals_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES_SEQUENCE:
				getEdgesSequence().clear();
				getEdgesSequence().addAll((Collection<? extends Activity_edges_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS_SEQUENCE:
				getInputsSequence().clear();
				getInputsSequence().addAll((Collection<? extends Activity_inputs_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES_SEQUENCE:
				getNodesSequence().clear();
				getNodesSequence().addAll((Collection<? extends Activity_nodes_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS_SEQUENCE:
				getLocalsSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES_SEQUENCE:
				getEdgesSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS_SEQUENCE:
				getInputsSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES_SEQUENCE:
				getNodesSequence().clear();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY__LOCALS_SEQUENCE:
				return localsSequence != null && !localsSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY__EDGES_SEQUENCE:
				return edgesSequence != null && !edgesSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY__INPUTS_SEQUENCE:
				return inputsSequence != null && !inputsSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY__NODES_SEQUENCE:
				return nodesSequence != null && !nodesSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY__TRACE_SEQUENCE:
				return traceSequence != null && !traceSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityImpl
