/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.Offer_offeredTokens_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedOffer;

import activitydiagramTrace.States.impl.SpecificTracedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl#getOffer_offeredTokens_Dimension <em>Offer offered Tokens Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedOfferImpl extends SpecificTracedObjectImpl<SpecificDimension<?>> implements TracedOffer {
	/**
	 * The cached value of the '{@link #getOffer_offeredTokens_Dimension() <em>Offer offered Tokens Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer_offeredTokens_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Offer_offeredTokens_Dimension offer_offeredTokens_Dimension;

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
	public Offer_offeredTokens_Dimension getOffer_offeredTokens_Dimension() {
		return offer_offeredTokens_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffer_offeredTokens_Dimension(Offer_offeredTokens_Dimension newOffer_offeredTokens_Dimension, NotificationChain msgs) {
		Offer_offeredTokens_Dimension oldOffer_offeredTokens_Dimension = offer_offeredTokens_Dimension;
		offer_offeredTokens_Dimension = newOffer_offeredTokens_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION, oldOffer_offeredTokens_Dimension, newOffer_offeredTokens_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffer_offeredTokens_Dimension(Offer_offeredTokens_Dimension newOffer_offeredTokens_Dimension) {
		if (newOffer_offeredTokens_Dimension != offer_offeredTokens_Dimension) {
			NotificationChain msgs = null;
			if (offer_offeredTokens_Dimension != null)
				msgs = ((InternalEObject)offer_offeredTokens_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION, null, msgs);
			if (newOffer_offeredTokens_Dimension != null)
				msgs = ((InternalEObject)newOffer_offeredTokens_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION, null, msgs);
			msgs = basicSetOffer_offeredTokens_Dimension(newOffer_offeredTokens_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION, newOffer_offeredTokens_Dimension, newOffer_offeredTokens_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getOffer_offeredTokens_Dimension());
		return result;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION:
				return basicSetOffer_offeredTokens_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION:
				return getOffer_offeredTokens_Dimension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION:
				setOffer_offeredTokens_Dimension((Offer_offeredTokens_Dimension)newValue);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION:
				setOffer_offeredTokens_Dimension((Offer_offeredTokens_Dimension)null);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION:
				return offer_offeredTokens_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedOfferImpl
