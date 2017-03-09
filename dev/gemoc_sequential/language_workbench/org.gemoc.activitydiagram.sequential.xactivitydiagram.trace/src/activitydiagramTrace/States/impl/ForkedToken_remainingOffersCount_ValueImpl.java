/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.States.StatesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forked Token remaining Offers Count Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl#getRemainingOffersCount <em>Remaining Offers Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkedToken_remainingOffersCount_ValueImpl extends SpecificValueImpl implements ForkedToken_remainingOffersCount_Value {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT:
				return getRemainingOffersCount();
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
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT:
				setRemainingOffersCount((Integer)newValue);
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
