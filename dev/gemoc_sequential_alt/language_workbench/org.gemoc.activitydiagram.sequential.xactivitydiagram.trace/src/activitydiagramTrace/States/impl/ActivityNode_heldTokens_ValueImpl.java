/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.TracedControlToken;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node held Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl#getHeldTokens <em>Held Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNode_heldTokens_ValueImpl extends SpecificValueImpl implements ActivityNode_heldTokens_Value {
	/**
	 * The cached value of the '{@link #getHeldTokens() <em>Held Tokens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedControlToken> heldTokens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNode_heldTokens_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.ACTIVITY_NODE_HELD_TOKENS_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedControlToken> getHeldTokens() {
		if (heldTokens == null) {
			heldTokens = new EObjectResolvingEList<TracedControlToken>(TracedControlToken.class, this, StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS);
		}
		return heldTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS:
				return getHeldTokens();
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
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS:
				getHeldTokens().clear();
				getHeldTokens().addAll((Collection<? extends TracedControlToken>)newValue);
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
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS:
				getHeldTokens().clear();
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
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS:
				return heldTokens != null && !heldTokens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityNode_heldTokens_ValueImpl
