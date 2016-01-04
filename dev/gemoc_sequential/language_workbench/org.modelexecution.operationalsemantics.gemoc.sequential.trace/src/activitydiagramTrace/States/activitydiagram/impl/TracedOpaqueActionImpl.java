/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.OpaqueAction_expressions_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedOpaqueAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedOpaqueActionImpl#getExpressionsSequence <em>Expressions Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedOpaqueActionImpl extends TracedActionImpl implements TracedOpaqueAction {
	/**
	 * The cached value of the '{@link #getExpressionsSequence() <em>Expressions Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionsSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<OpaqueAction_expressions_Value> expressionsSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedOpaqueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_OPAQUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpaqueAction_expressions_Value> getExpressionsSequence() {
		if (expressionsSequence == null) {
			expressionsSequence = new EObjectContainmentWithInverseEList<OpaqueAction_expressions_Value>(OpaqueAction_expressions_Value.class, this, ActivitydiagramPackage.TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE, StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT);
		}
		return expressionsSequence;
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
			case ActivitydiagramPackage.TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpressionsSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE:
				return ((InternalEList<?>)getExpressionsSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE:
				return getExpressionsSequence();
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
			case ActivitydiagramPackage.TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE:
				getExpressionsSequence().clear();
				getExpressionsSequence().addAll((Collection<? extends OpaqueAction_expressions_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE:
				getExpressionsSequence().clear();
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
			case ActivitydiagramPackage.TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE:
				return expressionsSequence != null && !expressionsSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedOpaqueActionImpl
