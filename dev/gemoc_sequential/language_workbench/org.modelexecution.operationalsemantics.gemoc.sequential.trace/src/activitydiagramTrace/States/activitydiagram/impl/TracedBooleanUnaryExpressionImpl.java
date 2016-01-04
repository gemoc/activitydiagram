/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.BooleanUnaryExpression_operand_Value;
import activitydiagramTrace.States.BooleanUnaryExpression_operator_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Boolean Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanUnaryExpressionImpl#getOperatorSequence <em>Operator Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanUnaryExpressionImpl#getOperandSequence <em>Operand Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedBooleanUnaryExpressionImpl extends TracedBooleanExpressionImpl implements TracedBooleanUnaryExpression {
	/**
	 * The cached value of the '{@link #getOperatorSequence() <em>Operator Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanUnaryExpression_operator_Value> operatorSequence;

	/**
	 * The cached value of the '{@link #getOperandSequence() <em>Operand Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanUnaryExpression_operand_Value> operandSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBooleanUnaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_BOOLEAN_UNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanUnaryExpression_operator_Value> getOperatorSequence() {
		if (operatorSequence == null) {
			operatorSequence = new EObjectContainmentWithInverseEList<BooleanUnaryExpression_operator_Value>(BooleanUnaryExpression_operator_Value.class, this, ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE, StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__PARENT);
		}
		return operatorSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanUnaryExpression_operand_Value> getOperandSequence() {
		if (operandSequence == null) {
			operandSequence = new EObjectContainmentWithInverseEList<BooleanUnaryExpression_operand_Value>(BooleanUnaryExpression_operand_Value.class, this, ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE, StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT);
		}
		return operandSequence;
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatorSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperandSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE:
				return ((InternalEList<?>)getOperatorSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE:
				return ((InternalEList<?>)getOperandSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE:
				return getOperatorSequence();
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE:
				return getOperandSequence();
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE:
				getOperatorSequence().clear();
				getOperatorSequence().addAll((Collection<? extends BooleanUnaryExpression_operator_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE:
				getOperandSequence().clear();
				getOperandSequence().addAll((Collection<? extends BooleanUnaryExpression_operand_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE:
				getOperatorSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE:
				getOperandSequence().clear();
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE:
				return operatorSequence != null && !operatorSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE:
				return operandSequence != null && !operandSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedBooleanUnaryExpressionImpl
