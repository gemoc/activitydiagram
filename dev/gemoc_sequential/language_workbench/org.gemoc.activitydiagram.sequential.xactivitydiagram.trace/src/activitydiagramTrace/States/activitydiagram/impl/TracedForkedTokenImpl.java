/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.ForkedToken_baseToken_Dimension;
import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedForkedToken;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Forked Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl#getForkedToken_baseToken_Dimension <em>Forked Token base Token Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl#getForkedToken_remainingOffersCount_Dimension <em>Forked Token remaining Offers Count Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedForkedTokenImpl extends TracedTokenImpl implements TracedForkedToken {
	/**
	 * The cached value of the '{@link #getForkedToken_baseToken_Dimension() <em>Forked Token base Token Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedToken_baseToken_Dimension()
	 * @generated
	 * @ordered
	 */
	protected ForkedToken_baseToken_Dimension forkedToken_baseToken_Dimension;

	/**
	 * The cached value of the '{@link #getForkedToken_remainingOffersCount_Dimension() <em>Forked Token remaining Offers Count Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedToken_remainingOffersCount_Dimension()
	 * @generated
	 * @ordered
	 */
	protected ForkedToken_remainingOffersCount_Dimension forkedToken_remainingOffersCount_Dimension;

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
	public ForkedToken_baseToken_Dimension getForkedToken_baseToken_Dimension() {
		return forkedToken_baseToken_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForkedToken_baseToken_Dimension(ForkedToken_baseToken_Dimension newForkedToken_baseToken_Dimension, NotificationChain msgs) {
		ForkedToken_baseToken_Dimension oldForkedToken_baseToken_Dimension = forkedToken_baseToken_Dimension;
		forkedToken_baseToken_Dimension = newForkedToken_baseToken_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION, oldForkedToken_baseToken_Dimension, newForkedToken_baseToken_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForkedToken_baseToken_Dimension(ForkedToken_baseToken_Dimension newForkedToken_baseToken_Dimension) {
		if (newForkedToken_baseToken_Dimension != forkedToken_baseToken_Dimension) {
			NotificationChain msgs = null;
			if (forkedToken_baseToken_Dimension != null)
				msgs = ((InternalEObject)forkedToken_baseToken_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION, null, msgs);
			if (newForkedToken_baseToken_Dimension != null)
				msgs = ((InternalEObject)newForkedToken_baseToken_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION, null, msgs);
			msgs = basicSetForkedToken_baseToken_Dimension(newForkedToken_baseToken_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION, newForkedToken_baseToken_Dimension, newForkedToken_baseToken_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_remainingOffersCount_Dimension getForkedToken_remainingOffersCount_Dimension() {
		return forkedToken_remainingOffersCount_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForkedToken_remainingOffersCount_Dimension(ForkedToken_remainingOffersCount_Dimension newForkedToken_remainingOffersCount_Dimension, NotificationChain msgs) {
		ForkedToken_remainingOffersCount_Dimension oldForkedToken_remainingOffersCount_Dimension = forkedToken_remainingOffersCount_Dimension;
		forkedToken_remainingOffersCount_Dimension = newForkedToken_remainingOffersCount_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION, oldForkedToken_remainingOffersCount_Dimension, newForkedToken_remainingOffersCount_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForkedToken_remainingOffersCount_Dimension(ForkedToken_remainingOffersCount_Dimension newForkedToken_remainingOffersCount_Dimension) {
		if (newForkedToken_remainingOffersCount_Dimension != forkedToken_remainingOffersCount_Dimension) {
			NotificationChain msgs = null;
			if (forkedToken_remainingOffersCount_Dimension != null)
				msgs = ((InternalEObject)forkedToken_remainingOffersCount_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION, null, msgs);
			if (newForkedToken_remainingOffersCount_Dimension != null)
				msgs = ((InternalEObject)newForkedToken_remainingOffersCount_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION, null, msgs);
			msgs = basicSetForkedToken_remainingOffersCount_Dimension(newForkedToken_remainingOffersCount_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION, newForkedToken_remainingOffersCount_Dimension, newForkedToken_remainingOffersCount_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getForkedToken_baseToken_Dimension());
		result.add(getForkedToken_remainingOffersCount_Dimension());
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION:
				return basicSetForkedToken_baseToken_Dimension(null, msgs);
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION:
				return basicSetForkedToken_remainingOffersCount_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION:
				return getForkedToken_baseToken_Dimension();
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION:
				return getForkedToken_remainingOffersCount_Dimension();
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION:
				setForkedToken_baseToken_Dimension((ForkedToken_baseToken_Dimension)newValue);
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION:
				setForkedToken_remainingOffersCount_Dimension((ForkedToken_remainingOffersCount_Dimension)newValue);
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION:
				setForkedToken_baseToken_Dimension((ForkedToken_baseToken_Dimension)null);
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION:
				setForkedToken_remainingOffersCount_Dimension((ForkedToken_remainingOffersCount_Dimension)null);
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION:
				return forkedToken_baseToken_Dimension != null;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION:
				return forkedToken_remainingOffersCount_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedForkedTokenImpl
