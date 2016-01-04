/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.ActivityNode_incoming_Value;
import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

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
 * An implementation of the model object '<em><b>Activity Node incoming Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.ActivityNode_incoming_ValueImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.ActivityNode_incoming_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.ActivityNode_incoming_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityNode_incoming_ValueImpl extends MinimalEObjectImpl.Container implements ActivityNode_incoming_Value {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityEdge> incoming;

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
	protected ActivityNode_incoming_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.ACTIVITY_NODE_INCOMING_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityEdge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<TracedActivityEdge>(TracedActivityEdge.class, this, StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode getParent() {
		if (eContainerFeatureID() != StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT) return null;
		return (TracedActivityNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedActivityNode newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedActivityNode newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE, TracedActivityNode.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__STATES, StatesPackage.STATE__ACTIVITY_NODE_INCOMING_VALUES);
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
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedActivityNode)otherEnd, msgs);
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE, TracedActivityNode.class, msgs);
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
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__INCOMING:
				return getIncoming();
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT:
				return getParent();
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends TracedActivityEdge>)newValue);
				return;
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT:
				setParent((TracedActivityNode)newValue);
				return;
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__INCOMING:
				getIncoming().clear();
				return;
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT:
				setParent((TracedActivityNode)null);
				return;
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__STATES:
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
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityNode_incoming_ValueImpl
