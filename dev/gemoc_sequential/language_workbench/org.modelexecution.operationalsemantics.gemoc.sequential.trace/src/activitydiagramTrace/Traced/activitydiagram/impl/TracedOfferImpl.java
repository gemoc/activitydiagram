/**
 */
package activitydiagramTrace.Traced.activitydiagram.impl;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedOffer;

import activitydiagramTrace.Values.Offer_offeredTokens_Value;
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
 * An implementation of the model object '<em><b>Traced Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedOfferImpl#getOfferedTokensTrace <em>Offered Tokens Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedOfferImpl extends MinimalEObjectImpl.Container implements TracedOffer {
	/**
	 * The cached value of the '{@link #getOfferedTokensTrace() <em>Offered Tokens Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokensTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer_offeredTokens_Value> offeredTokensTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedOfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offer_offeredTokens_Value> getOfferedTokensTrace() {
		if (offeredTokensTrace == null) {
			offeredTokensTrace = new EObjectContainmentWithInverseEList<Offer_offeredTokens_Value>(Offer_offeredTokens_Value.class, this, ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_TRACE, ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT);
		}
		return offeredTokensTrace;
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfferedTokensTrace()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_TRACE:
				return ((InternalEList<?>)getOfferedTokensTrace()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_TRACE:
				return getOfferedTokensTrace();
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_TRACE:
				getOfferedTokensTrace().clear();
				getOfferedTokensTrace().addAll((Collection<? extends Offer_offeredTokens_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_TRACE:
				getOfferedTokensTrace().clear();
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_TRACE:
				return offeredTokensTrace != null && !offeredTokensTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedOfferImpl
