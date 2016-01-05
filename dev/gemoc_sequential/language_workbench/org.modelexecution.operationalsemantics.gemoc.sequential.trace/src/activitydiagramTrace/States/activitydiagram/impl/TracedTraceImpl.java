/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagram.ActivityNode;
import activitydiagram.Trace;

import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Trace_executedNodes_Value;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedTrace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl#getExecutedNodes <em>Executed Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl#getExecutedNodesSequence <em>Executed Nodes Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedTraceImpl extends MinimalEObjectImpl.Container implements TracedTrace {
	/**
	 * The cached value of the '{@link #getExecutedNodes() <em>Executed Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> executedNodes;

	/**
	 * The cached value of the '{@link #getExecutedNodesSequence() <em>Executed Nodes Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedNodesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace_executedNodes_Value> executedNodesSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Trace originalObject;

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
	public EList<ActivityNode> getExecutedNodes() {
		if (executedNodes == null) {
			executedNodes = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES);
		}
		return executedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace_executedNodes_Value> getExecutedNodesSequence() {
		if (executedNodesSequence == null) {
			executedNodesSequence = new EObjectContainmentWithInverseEList<Trace_executedNodes_Value>(Trace_executedNodes_Value.class, this, ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_SEQUENCE, StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT);
		}
		return executedNodesSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Trace)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_TRACE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Trace newOriginalObject) {
		Trace oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_TRACE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutedNodesSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_SEQUENCE:
				return ((InternalEList<?>)getExecutedNodesSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES:
				return getExecutedNodes();
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_SEQUENCE:
				return getExecutedNodesSequence();
			case ActivitydiagramPackage.TRACED_TRACE__ORIGINAL_OBJECT:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES:
				getExecutedNodes().clear();
				getExecutedNodes().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_SEQUENCE:
				getExecutedNodesSequence().clear();
				getExecutedNodesSequence().addAll((Collection<? extends Trace_executedNodes_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_TRACE__ORIGINAL_OBJECT:
				setOriginalObject((Trace)newValue);
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES:
				getExecutedNodes().clear();
				return;
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_SEQUENCE:
				getExecutedNodesSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_TRACE__ORIGINAL_OBJECT:
				setOriginalObject((Trace)null);
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
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES:
				return executedNodes != null && !executedNodes.isEmpty();
			case ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_SEQUENCE:
				return executedNodesSequence != null && !executedNodesSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_TRACE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedTraceImpl
