/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.ActivityEdge_offeredTokens_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.TracedControlToken;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge offered Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.ActivityEdge_offeredTokens_ValueImpl#getOfferedTokens <em>Offered Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityEdge_offeredTokens_ValueImpl extends SpecificValueImpl implements ActivityEdge_offeredTokens_Value {
	/**
	 * The cached value of the '{@link #getOfferedTokens() <em>Offered Tokens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedControlToken> offeredTokens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdge_offeredTokens_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.ACTIVITY_EDGE_OFFERED_TOKENS_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedControlToken> getOfferedTokens() {
		if (offeredTokens == null) {
			offeredTokens = new EObjectResolvingEList<TracedControlToken>(TracedControlToken.class, this, StatesPackage.ACTIVITY_EDGE_OFFERED_TOKENS_VALUE__OFFERED_TOKENS);
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
			case StatesPackage.ACTIVITY_EDGE_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
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
			case StatesPackage.ACTIVITY_EDGE_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				getOfferedTokens().clear();
				getOfferedTokens().addAll((Collection<? extends TracedControlToken>)newValue);
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
			case StatesPackage.ACTIVITY_EDGE_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
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
			case StatesPackage.ACTIVITY_EDGE_OFFERED_TOKENS_VALUE__OFFERED_TOKENS:
				return offeredTokens != null && !offeredTokens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityEdge_offeredTokens_ValueImpl
