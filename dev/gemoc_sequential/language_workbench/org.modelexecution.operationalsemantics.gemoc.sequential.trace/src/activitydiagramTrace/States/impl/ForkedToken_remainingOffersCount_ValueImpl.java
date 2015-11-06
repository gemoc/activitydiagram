/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedForkedToken;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forked Token remaining Offers Count Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl#getRemainingOffersCount <em>Remaining Offers Count</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForkedToken_remainingOffersCount_ValueImpl extends MinimalEObjectImpl.Container implements ForkedToken_remainingOffersCount_Value {
	/**
	 * The default value of the '{@link #getRemainingOffersCount() <em>Remaining Offers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOffersCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REMAINING_OFFERS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRemainingOffersCount() <em>Remaining Offers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOffersCount()
	 * @generated
	 * @ordered
	 */
	protected int remainingOffersCount = REMAINING_OFFERS_COUNT_EDEFAULT;

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
	protected ForkedToken_remainingOffersCount_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemainingOffersCount() {
		return remainingOffersCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingOffersCount(int newRemainingOffersCount) {
		int oldRemainingOffersCount = remainingOffersCount;
		remainingOffersCount = newRemainingOffersCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT, oldRemainingOffersCount, remainingOffersCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedForkedToken getParent() {
		if (eContainerFeatureID() != StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT) return null;
		return (TracedForkedToken)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedForkedToken newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedForkedToken newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE, TracedForkedToken.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES, StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES);
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
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedForkedToken)otherEnd, msgs);
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE, TracedForkedToken.class, msgs);
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
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT:
				return getRemainingOffersCount();
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT:
				return getParent();
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT:
				setRemainingOffersCount((Integer)newValue);
				return;
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT:
				setParent((TracedForkedToken)newValue);
				return;
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT:
				setRemainingOffersCount(REMAINING_OFFERS_COUNT_EDEFAULT);
				return;
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT:
				setParent((TracedForkedToken)null);
				return;
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES:
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
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT:
				return remainingOffersCount != REMAINING_OFFERS_COUNT_EDEFAULT;
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (remainingOffersCount: ");
		result.append(remainingOffersCount);
		result.append(')');
		return result.toString();
	}

} //ForkedToken_remainingOffersCount_ValueImpl
