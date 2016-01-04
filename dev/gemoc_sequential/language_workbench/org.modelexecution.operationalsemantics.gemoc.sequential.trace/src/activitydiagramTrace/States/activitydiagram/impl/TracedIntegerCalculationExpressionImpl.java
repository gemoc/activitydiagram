/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value;
import activitydiagramTrace.States.IntegerCalculationExpression_operator_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Integer Calculation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerCalculationExpressionImpl#getAssigneeSequence <em>Assignee Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerCalculationExpressionImpl#getOperatorSequence <em>Operator Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedIntegerCalculationExpressionImpl extends TracedIntegerExpressionImpl implements TracedIntegerCalculationExpression {
	/**
	 * The cached value of the '{@link #getAssigneeSequence() <em>Assignee Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigneeSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerCalculationExpression_assignee_Value> assigneeSequence;

	/**
	 * The cached value of the '{@link #getOperatorSequence() <em>Operator Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerCalculationExpression_operator_Value> operatorSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedIntegerCalculationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_INTEGER_CALCULATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerCalculationExpression_assignee_Value> getAssigneeSequence() {
		if (assigneeSequence == null) {
			assigneeSequence = new EObjectContainmentWithInverseEList<IntegerCalculationExpression_assignee_Value>(IntegerCalculationExpression_assignee_Value.class, this, ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE, StatesPackage.INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__PARENT);
		}
		return assigneeSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerCalculationExpression_operator_Value> getOperatorSequence() {
		if (operatorSequence == null) {
			operatorSequence = new EObjectContainmentWithInverseEList<IntegerCalculationExpression_operator_Value>(IntegerCalculationExpression_operator_Value.class, this, ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE, StatesPackage.INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__PARENT);
		}
		return operatorSequence;
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
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssigneeSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatorSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE:
				return ((InternalEList<?>)getAssigneeSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE:
				return ((InternalEList<?>)getOperatorSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE:
				return getAssigneeSequence();
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE:
				return getOperatorSequence();
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
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE:
				getAssigneeSequence().clear();
				getAssigneeSequence().addAll((Collection<? extends IntegerCalculationExpression_assignee_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE:
				getOperatorSequence().clear();
				getOperatorSequence().addAll((Collection<? extends IntegerCalculationExpression_operator_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE:
				getAssigneeSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE:
				getOperatorSequence().clear();
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
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE:
				return assigneeSequence != null && !assigneeSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE:
				return operatorSequence != null && !operatorSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedIntegerCalculationExpressionImpl
