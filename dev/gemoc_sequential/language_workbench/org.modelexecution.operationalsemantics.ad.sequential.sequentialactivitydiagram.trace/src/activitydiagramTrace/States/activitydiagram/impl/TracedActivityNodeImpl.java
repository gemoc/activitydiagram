/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
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
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getHeldTokensSequence <em>Held Tokens Sequence</em>}</li>
 * </ul>
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
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityNodeImpl
