/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.Offer_offeredTokens_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.TracedToken;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer offered Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl#getOfferedTokens <em>Offered Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Offer_offeredTokens_ValueImpl extends SpecificValueImpl implements Offer_offeredTokens_Value {
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
		return StatesPackage.Literals.OFFER_OFFERED_TOKENS_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedToken> getOfferedTokens() {
		if (offeredTokens == null) {
			offeredTokens = new EObjectResolvingEList<TracedToken>(TracedToken.class, this, StatesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS);
		}
		return offeredTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				return getOfferedTokens();
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
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				getOfferedTokens().clear();
				getOfferedTokens().addAll((Collection<? extends TracedToken>)newValue);
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
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				getOfferedTokens().clear();
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
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				return offeredTokens != null && !offeredTokens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Offer_offeredTokens_ValueImpl
