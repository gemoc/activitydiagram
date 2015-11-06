/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagram.Token;

import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivity;
import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

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
 * An implementation of the model object '<em><b>Traced Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getHeldTokens <em>Held Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getHeldTokensSequence <em>Held Tokens Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedActivityNodeImpl extends TracedNamedElementImpl implements TracedActivityNode {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityEdge> outgoing;

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
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected TracedActivity activity;

	/**
	 * The cached value of the '{@link #getHeldTokens() <em>Held Tokens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> heldTokens;

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
	public EList<TracedActivityEdge> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<TracedActivityEdge>(TracedActivityEdge.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityEdge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<TracedActivityEdge>(TracedActivityEdge.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (TracedActivity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(TracedActivity newActivity) {
		TracedActivity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getHeldTokens() {
		if (heldTokens == null) {
			heldTokens = new EObjectResolvingEList<Token>(Token.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS);
		}
		return heldTokens;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeldTokensSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING:
				return getOutgoing();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING:
				return getIncoming();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS:
				return getHeldTokens();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				return getHeldTokensSequence();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends TracedActivityEdge>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends TracedActivityEdge>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY:
				setActivity((TracedActivity)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS:
				getHeldTokens().clear();
				getHeldTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				getHeldTokensSequence().clear();
				getHeldTokensSequence().addAll((Collection<? extends ActivityNode_heldTokens_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY:
				setActivity((TracedActivity)null);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS:
				getHeldTokens().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				getHeldTokensSequence().clear();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY:
				return activity != null;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS:
				return heldTokens != null && !heldTokens.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				return heldTokensSequence != null && !heldTokensSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityNodeImpl
