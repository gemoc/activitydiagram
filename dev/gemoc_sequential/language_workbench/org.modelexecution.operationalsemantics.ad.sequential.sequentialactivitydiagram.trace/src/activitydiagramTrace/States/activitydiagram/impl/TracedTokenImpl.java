/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Token_holder_Value;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedToken;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedTokenImpl#getHolderSequence <em>Holder Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedTokenImpl extends MinimalEObjectImpl.Container implements TracedToken {
	/**
	 * The cached value of the '{@link #getHolderSequence() <em>Holder Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Token_holder_Value> holderSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token_holder_Value> getHolderSequence() {
		if (holderSequence == null) {
			holderSequence = new EObjectContainmentWithInverseEList<Token_holder_Value>(Token_holder_Value.class, this, ActivitydiagramPackage.TRACED_TOKEN__HOLDER_SEQUENCE, StatesPackage.TOKEN_HOLDER_VALUE__PARENT);
		}
		return holderSequence;
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
			case ActivitydiagramPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHolderSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				return ((InternalEList<?>)getHolderSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				return getHolderSequence();
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
			case ActivitydiagramPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				getHolderSequence().clear();
				getHolderSequence().addAll((Collection<? extends Token_holder_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				getHolderSequence().clear();
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
			case ActivitydiagramPackage.TRACED_TOKEN__HOLDER_SEQUENCE:
				return holderSequence != null && !holderSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedTokenImpl
