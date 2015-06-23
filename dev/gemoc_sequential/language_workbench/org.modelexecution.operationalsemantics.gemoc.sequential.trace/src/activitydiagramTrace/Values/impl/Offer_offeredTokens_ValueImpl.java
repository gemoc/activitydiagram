/**
 */
package activitydiagramTrace.Values.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;
import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedOffer;
import activitydiagramTrace.Traced.activitydiagram.TracedToken;

import activitydiagramTrace.Values.Offer_offeredTokens_Value;
import activitydiagramTrace.Values.ValuesPackage;

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
 * An implementation of the model object '<em><b>Offer offered Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.impl.Offer_offeredTokens_ValueImpl#getOfferedTokens <em>Offered Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.impl.Offer_offeredTokens_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.impl.Offer_offeredTokens_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Offer_offeredTokens_ValueImpl extends MinimalEObjectImpl.Container implements Offer_offeredTokens_Value {
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
	protected Offer_offeredTokens_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuesPackage.Literals.OFFER_OFFERED_TOKENS_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedToken> getOfferedTokens() {
		if (offeredTokens == null) {
			offeredTokens = new EObjectResolvingEList<TracedToken>(TracedToken.class, this, ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS);
		}
		return offeredTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOffer getParent() {
		if (eContainerFeatureID() != ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT) return null;
		return (TracedOffer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedOffer newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedOffer newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_TRACE, TracedOffer.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES, ActivitydiagramTracePackage.STATE__OFFER_OFFERED_TOKENS_VALUES);
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
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedOffer)otherEnd, msgs);
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES:
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
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES:
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
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_OFFER__OFFERED_TOKENS_TRACE, TracedOffer.class, msgs);
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
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				return getOfferedTokens();
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT:
				return getParent();
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES:
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
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				getOfferedTokens().clear();
				getOfferedTokens().addAll((Collection<? extends TracedToken>)newValue);
				return;
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT:
				setParent((TracedOffer)newValue);
				return;
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES:
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
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				getOfferedTokens().clear();
				return;
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT:
				setParent((TracedOffer)null);
				return;
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES:
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
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				return offeredTokens != null && !offeredTokens.isEmpty();
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__PARENT:
				return getParent() != null;
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Offer_offeredTokens_ValueImpl
