/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getHeldTokensSequence <em>Held Tokens Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getOriginalObject_ActivityNode <em>Original Object Activity Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedActivityNodeImpl extends TracedNamedElementImpl implements TracedActivityNode {
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
	 * The cached value of the '{@link #getOriginalObject_ActivityNode() <em>Original Object Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_ActivityNode()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode originalObject_ActivityNode;

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
	public ActivityNode getOriginalObject_ActivityNode() {
		if (originalObject_ActivityNode != null && originalObject_ActivityNode.eIsProxy()) {
			InternalEObject oldOriginalObject_ActivityNode = (InternalEObject)originalObject_ActivityNode;
			originalObject_ActivityNode = (ActivityNode)eResolveProxy(oldOriginalObject_ActivityNode);
			if (originalObject_ActivityNode != oldOriginalObject_ActivityNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE, oldOriginalObject_ActivityNode, originalObject_ActivityNode));
			}
		}
		return originalObject_ActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetOriginalObject_ActivityNode() {
		return originalObject_ActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_ActivityNode(ActivityNode newOriginalObject_ActivityNode) {
		ActivityNode oldOriginalObject_ActivityNode = originalObject_ActivityNode;
		originalObject_ActivityNode = newOriginalObject_ActivityNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE, oldOriginalObject_ActivityNode, originalObject_ActivityNode));
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE:
				return getHeldTokensSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE:
				if (resolve) return getOriginalObject_ActivityNode();
				return basicGetOriginalObject_ActivityNode();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE:
				setOriginalObject_ActivityNode((ActivityNode)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE:
				setOriginalObject_ActivityNode((ActivityNode)null);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE:
				return originalObject_ActivityNode != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityNodeImpl
