/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagram.ForkedToken;

import activitydiagramTrace.States.ForkedToken_baseToken_Value;
import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedForkedToken;
import activitydiagramTrace.States.activitydiagram.TracedToken;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Forked Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl#getBaseToken <em>Base Token</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl#getBaseTokenSequence <em>Base Token Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl#getRemainingOffersCountSequence <em>Remaining Offers Count Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedForkedTokenImpl extends TracedTokenImpl implements TracedForkedToken {
	/**
	 * The cached value of the '{@link #getBaseToken() <em>Base Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseToken()
	 * @generated
	 * @ordered
	 */
	protected TracedToken baseToken;

	/**
	 * The cached value of the '{@link #getBaseTokenSequence() <em>Base Token Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTokenSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_baseToken_Value> baseTokenSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected ForkedToken originalObject;

	/**
	 * The cached value of the '{@link #getRemainingOffersCountSequence() <em>Remaining Offers Count Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOffersCountSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_remainingOffersCount_Value> remainingOffersCountSequence;

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
	public TracedToken getBaseToken() {
		if (baseToken != null && baseToken.eIsProxy()) {
			InternalEObject oldBaseToken = (InternalEObject)baseToken;
			baseToken = (TracedToken)eResolveProxy(oldBaseToken);
			if (baseToken != oldBaseToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN, oldBaseToken, baseToken));
			}
		}
		return baseToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedToken basicGetBaseToken() {
		return baseToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseToken(TracedToken newBaseToken) {
		TracedToken oldBaseToken = baseToken;
		baseToken = newBaseToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN, oldBaseToken, baseToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_baseToken_Value> getBaseTokenSequence() {
		if (baseTokenSequence == null) {
			baseTokenSequence = new EObjectContainmentWithInverseEList<ForkedToken_baseToken_Value>(ForkedToken_baseToken_Value.class, this, ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE, StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT);
		}
		return baseTokenSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (ForkedToken)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_FORKED_TOKEN__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(ForkedToken newOriginalObject) {
		ForkedToken oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_FORKED_TOKEN__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_remainingOffersCount_Value> getRemainingOffersCountSequence() {
		if (remainingOffersCountSequence == null) {
			remainingOffersCountSequence = new EObjectContainmentWithInverseEList<ForkedToken_remainingOffersCount_Value>(ForkedToken_remainingOffersCount_Value.class, this, ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE, StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT);
		}
		return remainingOffersCountSequence;
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseTokenSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemainingOffersCountSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				return ((InternalEList<?>)getBaseTokenSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				return ((InternalEList<?>)getRemainingOffersCountSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN:
				if (resolve) return getBaseToken();
				return basicGetBaseToken();
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				return getBaseTokenSequence();
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				return getRemainingOffersCountSequence();
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN:
				setBaseToken((TracedToken)newValue);
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				getBaseTokenSequence().clear();
				getBaseTokenSequence().addAll((Collection<? extends ForkedToken_baseToken_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__ORIGINAL_OBJECT:
				setOriginalObject((ForkedToken)newValue);
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				getRemainingOffersCountSequence().clear();
				getRemainingOffersCountSequence().addAll((Collection<? extends ForkedToken_remainingOffersCount_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN:
				setBaseToken((TracedToken)null);
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				getBaseTokenSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__ORIGINAL_OBJECT:
				setOriginalObject((ForkedToken)null);
				return;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				getRemainingOffersCountSequence().clear();
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
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN:
				return baseToken != null;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE:
				return baseTokenSequence != null && !baseTokenSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__ORIGINAL_OBJECT:
				return originalObject != null;
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE:
				return remainingOffersCountSequence != null && !remainingOffersCountSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedForkedTokenImpl
