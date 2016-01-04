/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.ControlFlow_guard_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedControlFlow;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Control Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlFlowImpl#getGuardSequence <em>Guard Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedControlFlowImpl extends TracedActivityEdgeImpl implements TracedControlFlow {
	/**
	 * The cached value of the '{@link #getGuardSequence() <em>Guard Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlow_guard_Value> guardSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedControlFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_CONTROL_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlow_guard_Value> getGuardSequence() {
		if (guardSequence == null) {
			guardSequence = new EObjectContainmentWithInverseEList<ControlFlow_guard_Value>(ControlFlow_guard_Value.class, this, ActivitydiagramPackage.TRACED_CONTROL_FLOW__GUARD_SEQUENCE, StatesPackage.CONTROL_FLOW_GUARD_VALUE__PARENT);
		}
		return guardSequence;
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
			case ActivitydiagramPackage.TRACED_CONTROL_FLOW__GUARD_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGuardSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_CONTROL_FLOW__GUARD_SEQUENCE:
				return ((InternalEList<?>)getGuardSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_CONTROL_FLOW__GUARD_SEQUENCE:
				return getGuardSequence();
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
			case ActivitydiagramPackage.TRACED_CONTROL_FLOW__GUARD_SEQUENCE:
				getGuardSequence().clear();
				getGuardSequence().addAll((Collection<? extends ControlFlow_guard_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_CONTROL_FLOW__GUARD_SEQUENCE:
				getGuardSequence().clear();
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
			case ActivitydiagramPackage.TRACED_CONTROL_FLOW__GUARD_SEQUENCE:
				return guardSequence != null && !guardSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedControlFlowImpl
