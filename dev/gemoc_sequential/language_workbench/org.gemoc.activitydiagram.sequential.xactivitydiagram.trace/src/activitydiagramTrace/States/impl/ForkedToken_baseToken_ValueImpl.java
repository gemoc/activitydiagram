/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.ForkedToken_baseToken_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.TracedToken;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forked Token base Token Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.ForkedToken_baseToken_ValueImpl#getBaseToken <em>Base Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkedToken_baseToken_ValueImpl extends SpecificValueImpl implements ForkedToken_baseToken_Value {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkedToken_baseToken_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.FORKED_TOKEN_BASE_TOKEN_VALUE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN, oldBaseToken, baseToken));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN, oldBaseToken, baseToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN:
				if (resolve) return getBaseToken();
				return basicGetBaseToken();
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN:
				setBaseToken((TracedToken)newValue);
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN:
				setBaseToken((TracedToken)null);
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
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN:
				return baseToken != null;
		}
		return super.eIsSet(featureID);
	}

} //ForkedToken_baseToken_ValueImpl
