/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Trace_executedNodes_Value;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;
import activitydiagramTrace.States.activitydiagram.TracedTrace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace executed Nodes Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl#getExecutedNodes <em>Executed Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Trace_executedNodes_ValueImpl extends MinimalEObjectImpl.Container implements Trace_executedNodes_Value {
	/**
	 * The cached value of the '{@link #getExecutedNodes() <em>Executed Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityNode> executedNodes;

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
	protected Trace_executedNodes_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TRACE_EXECUTED_NODES_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityNode> getExecutedNodes() {
		if (executedNodes == null) {
			executedNodes = new EObjectResolvingEList<TracedActivityNode>(TracedActivityNode.class, this, StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES);
		}
		return executedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTrace getParent() {
		if (eContainerFeatureID() != StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT) return null;
		return (TracedTrace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedTrace newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedTrace newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_SEQUENCE, TracedTrace.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES, StatesPackage.STATE__TRACE_EXECUTED_NODES_VALUES);
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedTrace)otherEnd, msgs);
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES:
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES:
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_TRACE__EXECUTED_NODES_SEQUENCE, TracedTrace.class, msgs);
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES:
				return getExecutedNodes();
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT:
				return getParent();
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES:
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES:
				getExecutedNodes().clear();
				getExecutedNodes().addAll((Collection<? extends TracedActivityNode>)newValue);
				return;
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT:
				setParent((TracedTrace)newValue);
				return;
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES:
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES:
				getExecutedNodes().clear();
				return;
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT:
				setParent((TracedTrace)null);
				return;
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES:
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES:
				return executedNodes != null && !executedNodes.isEmpty();
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Trace_executedNodes_ValueImpl
