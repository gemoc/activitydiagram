/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.ActivityNode_activity_Value;
import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
import activitydiagramTrace.States.ActivityNode_incoming_Value;
import activitydiagramTrace.States.ActivityNode_outgoing_Value;
import activitydiagramTrace.States.ActivityNode_running_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getHeldTokensSequence <em>Held Tokens Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getIncomingSequence <em>Incoming Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getRunningSequence <em>Running Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getActivitySequence <em>Activity Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getOutgoingSequence <em>Outgoing Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedActivityNodeImpl extends TracedNamedElementImpl implements TracedActivityNode {
	/**
	 * The cached value of the '{@link #getHeldTokensSequence() <em>Held Tokens Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldTokensSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_heldTokens_Value> heldTokensSequence;

	/**
	 * The cached value of the '{@link #getIncomingSequence() <em>Incoming Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_incoming_Value> incomingSequence;

	/**
	 * The cached value of the '{@link #getRunningSequence() <em>Running Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_running_Value> runningSequence;

	/**
	 * The cached value of the '{@link #getActivitySequence() <em>Activity Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitySequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_activity_Value> activitySequence;

	/**
	 * The cached value of the '{@link #getOutgoingSequence() <em>Outgoing Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_outgoing_Value> outgoingSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_heldTokens_Value> getHeldTokensSequence() {
		if (heldTokensSequence == null) {
			heldTokensSequence = new EObjectContainmentWithInverseEList<ActivityNode_heldTokens_Value>(ActivityNode_heldTokens_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE, StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE__PARENT);
		}
		return heldTokensSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_incoming_Value> getIncomingSequence() {
		if (incomingSequence == null) {
			incomingSequence = new EObjectContainmentWithInverseEList<ActivityNode_incoming_Value>(ActivityNode_incoming_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE, StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__PARENT);
		}
		return incomingSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_running_Value> getRunningSequence() {
		if (runningSequence == null) {
			runningSequence = new EObjectContainmentWithInverseEList<ActivityNode_running_Value>(ActivityNode_running_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE, StatesPackage.ACTIVITY_NODE_RUNNING_VALUE__PARENT);
		}
		return runningSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_activity_Value> getActivitySequence() {
		if (activitySequence == null) {
			activitySequence = new EObjectContainmentWithInverseEList<ActivityNode_activity_Value>(ActivityNode_activity_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE, StatesPackage.ACTIVITY_NODE_ACTIVITY_VALUE__PARENT);
		}
		return activitySequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_outgoing_Value> getOutgoingSequence() {
		if (outgoingSequence == null) {
			outgoingSequence = new EObjectContainmentWithInverseEList<ActivityNode_outgoing_Value>(ActivityNode_outgoing_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE, StatesPackage.ACTIVITY_NODE_OUTGOING_VALUE__PARENT);
		}
		return outgoingSequence;
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeldTokensSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRunningSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivitySequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				return ((InternalEList<?>)getHeldTokensSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE:
				return ((InternalEList<?>)getIncomingSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE:
				return ((InternalEList<?>)getRunningSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE:
				return ((InternalEList<?>)getActivitySequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE:
				return ((InternalEList<?>)getOutgoingSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				return getHeldTokensSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE:
				return getIncomingSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE:
				return getRunningSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE:
				return getActivitySequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE:
				return getOutgoingSequence();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				getHeldTokensSequence().clear();
				getHeldTokensSequence().addAll((Collection<? extends ActivityNode_heldTokens_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE:
				getIncomingSequence().clear();
				getIncomingSequence().addAll((Collection<? extends ActivityNode_incoming_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE:
				getRunningSequence().clear();
				getRunningSequence().addAll((Collection<? extends ActivityNode_running_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE:
				getActivitySequence().clear();
				getActivitySequence().addAll((Collection<? extends ActivityNode_activity_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE:
				getOutgoingSequence().clear();
				getOutgoingSequence().addAll((Collection<? extends ActivityNode_outgoing_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				getHeldTokensSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE:
				getIncomingSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE:
				getRunningSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE:
				getActivitySequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE:
				getOutgoingSequence().clear();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				return heldTokensSequence != null && !heldTokensSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE:
				return incomingSequence != null && !incomingSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE:
				return runningSequence != null && !runningSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE:
				return activitySequence != null && !activitySequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE:
				return outgoingSequence != null && !outgoingSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityNodeImpl
