/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.BooleanExpression_assignee_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedBooleanExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanExpressionImpl#getAssigneeSequence <em>Assignee Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedBooleanExpressionImpl extends TracedExpressionImpl implements TracedBooleanExpression {
	/**
	 * The cached value of the '{@link #getAssigneeSequence() <em>Assignee Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigneeSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanExpression_assignee_Value> assigneeSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBooleanExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_BOOLEAN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanExpression_assignee_Value> getAssigneeSequence() {
		if (assigneeSequence == null) {
			assigneeSequence = new EObjectContainmentWithInverseEList<BooleanExpression_assignee_Value>(BooleanExpression_assignee_Value.class, this, ActivitydiagramPackage.TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE, StatesPackage.BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__PARENT);
		}
		return assigneeSequence;
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssigneeSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE:
				return ((InternalEList<?>)getAssigneeSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE:
				return getAssigneeSequence();
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE:
				getAssigneeSequence().clear();
				getAssigneeSequence().addAll((Collection<? extends BooleanExpression_assignee_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE:
				getAssigneeSequence().clear();
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE:
				return assigneeSequence != null && !assigneeSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedBooleanExpressionImpl
