/**
 */
package activitydiagramTrace.Traced.activitydiagram.impl;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedForkedToken;

import activitydiagramTrace.Values.ForkedToken_baseToken_Value;
import activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.Values.ValuesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Forked Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedForkedTokenImpl#getBaseTokenTrace <em>Base Token Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedForkedTokenImpl#getRemainingOffersCountTrace <em>Remaining Offers Count Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedForkedTokenImpl extends TracedTokenImpl implements TracedForkedToken {
	/**
	 * The cached value of the '{@link #getBaseTokenTrace() <em>Base Token Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTokenTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_baseToken_Value> baseTokenTrace;

	/**
	 * The cached value of the '{@link #getRemainingOffersCountTrace() <em>Remaining Offers Count Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOffersCountTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_remainingOffersCount_Value> remainingOffersCountTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedForkedTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_FORKED_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_baseToken_Value> getBaseTokenTrace() {
		if (baseTokenTrace == null) {
			baseTokenTrace = new EObjectContainmentWithInverseEList<ForkedToken_baseToken_Value>(ForkedToken_baseToken_Value.class, this, ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE, ValuesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT);
		}
		return baseTokenTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_remainingOffersCount_Value> getRemainingOffersCountTrace() {
		if (remainingOffersCountTrace == null) {
			remainingOffersCountTrace = new EObjectContainmentWithInverseEList<ForkedToken_remainingOffersCount_Value>(ForkedToken_remainingOffersCount_Value.class, this, ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE, ValuesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT);
		}
		return remainingOffersCountTrace;
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseTokenTrace()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemainingOffersCountTrace()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE:
				return ((InternalEList<?>)getBaseTokenTrace()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE:
				return ((InternalEList<?>)getRemainingOffersCountTrace()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE:
				return getBaseTokenTrace();
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE:
				return getRemainingOffersCountTrace();
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE:
				getBaseTokenTrace().clear();
				getBaseTokenTrace().addAll((Collection<? extends ForkedToken_baseToken_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE:
				getRemainingOffersCountTrace().clear();
				getRemainingOffersCountTrace().addAll((Collection<? extends ForkedToken_remainingOffersCount_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE:
				getBaseTokenTrace().clear();
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE:
				getRemainingOffersCountTrace().clear();
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE:
				return baseTokenTrace != null && !baseTokenTrace.isEmpty();
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE:
				return remainingOffersCountTrace != null && !remainingOffersCountTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedForkedTokenImpl
