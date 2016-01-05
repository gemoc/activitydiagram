/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagram.Offer;

import activitydiagramTrace.States.Offer_offeredTokens_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedOffer;
import activitydiagramTrace.States.activitydiagram.TracedToken;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl#getOfferedTokens <em>Offered Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl#getOfferedTokensSequence <em>Offered Tokens Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedOfferImpl extends MinimalEObjectImpl.Container implements TracedOffer {
	/**
	 * The cached value of the '{@link #getOfferedTokens() <em>Offered Tokens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedToken> offeredTokens;

	/**
	 * The cached value of the '{@link #getOfferedTokensSequence() <em>Offered Tokens Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokensSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer_offeredTokens_Value> offeredTokensSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Offer originalObject;

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
	public EList<TracedToken> getOfferedTokens() {
		if (offeredTokens == null) {
			offeredTokens = new EObjectResolvingEList<TracedToken>(TracedToken.class, this, ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS);
		}
		return offeredTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offer_offeredTokens_Value> getOfferedTokensSequence() {
		if (offeredTokensSequence == null) {
			offeredTokensSequence = new EObjectContainmentWithInverseEList<Offer_offeredTokens_Value>(Offer_offeredTokens_Value.class, this, ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_SEQUENCE, StatesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT);
		}
		return offeredTokensSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Offer)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_OFFER__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Offer newOriginalObject) {
		Offer oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_OFFER__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfferedTokensSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_SEQUENCE:
				return ((InternalEList<?>)getOfferedTokensSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS:
				return getOfferedTokens();
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_SEQUENCE:
				return getOfferedTokensSequence();
			case ActivitydiagramPackage.TRACED_OFFER__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS:
				getOfferedTokens().clear();
				getOfferedTokens().addAll((Collection<? extends TracedToken>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_SEQUENCE:
				getOfferedTokensSequence().clear();
				getOfferedTokensSequence().addAll((Collection<? extends Offer_offeredTokens_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_OFFER__ORIGINAL_OBJECT:
				setOriginalObject((Offer)newValue);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS:
				getOfferedTokens().clear();
				return;
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_SEQUENCE:
				getOfferedTokensSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_OFFER__ORIGINAL_OBJECT:
				setOriginalObject((Offer)null);
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
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS:
				return offeredTokens != null && !offeredTokens.isEmpty();
			case ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_SEQUENCE:
				return offeredTokensSequence != null && !offeredTokensSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_OFFER__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedOfferImpl
