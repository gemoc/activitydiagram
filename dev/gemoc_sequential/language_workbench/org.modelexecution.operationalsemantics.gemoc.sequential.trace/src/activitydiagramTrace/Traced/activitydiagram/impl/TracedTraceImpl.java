/**
 */
package activitydiagramTrace.Traced.activitydiagram.impl;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedTrace;

import activitydiagramTrace.Values.Trace_executedNodes_Value;
import activitydiagramTrace.Values.ValuesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedTraceImpl#getExecutedNodesTrace <em>Executed Nodes Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedTraceImpl extends MinimalEObjectImpl.Container implements TracedTrace {
	/**
	 * The cached value of the '{@link #getExecutedNodesTrace() <em>Executed Nodes Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedNodesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace_executedNodes_Value> executedNodesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace_executedNodes_Value> getExecutedNodesTrace() {
		if (executedNodesTrace == null) {
			executedNodesTrace = new EObjectContainmentWithInverseEList<Trace_executedNodes_Value>(Trace_executedNodes_Value.class, this, ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_TRACE, ValuesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT);
		}
		return executedNodesTrace;
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutedNodesTrace()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_TRACE:
				return ((InternalEList<?>)getExecutedNodesTrace()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_TRACE:
				return getExecutedNodesTrace();
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_TRACE:
				getExecutedNodesTrace().clear();
				getExecutedNodesTrace().addAll((Collection<? extends Trace_executedNodes_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_TRACE:
				getExecutedNodesTrace().clear();
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_TRACE:
				return executedNodesTrace != null && !executedNodesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedTraceImpl
