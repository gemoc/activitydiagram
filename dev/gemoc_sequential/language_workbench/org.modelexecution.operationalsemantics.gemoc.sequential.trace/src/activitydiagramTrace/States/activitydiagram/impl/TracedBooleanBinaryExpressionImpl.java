/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operator_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Boolean Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanBinaryExpressionImpl#getOperand1Sequence <em>Operand1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanBinaryExpressionImpl#getOperatorSequence <em>Operator Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanBinaryExpressionImpl#getOperand2Sequence <em>Operand2 Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedBooleanBinaryExpressionImpl extends TracedBooleanExpressionImpl implements TracedBooleanBinaryExpression {
	/**
	 * The cached value of the '{@link #getOperand1Sequence() <em>Operand1 Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanBinaryExpression_operand1_Value> operand1Sequence;

	/**
	 * The cached value of the '{@link #getOperatorSequence() <em>Operator Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanBinaryExpression_operator_Value> operatorSequence;

	/**
	 * The cached value of the '{@link #getOperand2Sequence() <em>Operand2 Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanBinaryExpression_operand2_Value> operand2Sequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBooleanBinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_BOOLEAN_BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanBinaryExpression_operand1_Value> getOperand1Sequence() {
		if (operand1Sequence == null) {
			operand1Sequence = new EObjectContainmentWithInverseEList<BooleanBinaryExpression_operand1_Value>(BooleanBinaryExpression_operand1_Value.class, this, ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__PARENT);
		}
		return operand1Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanBinaryExpression_operator_Value> getOperatorSequence() {
		if (operatorSequence == null) {
			operatorSequence = new EObjectContainmentWithInverseEList<BooleanBinaryExpression_operator_Value>(BooleanBinaryExpression_operator_Value.class, this, ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__PARENT);
		}
		return operatorSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanBinaryExpression_operand2_Value> getOperand2Sequence() {
		if (operand2Sequence == null) {
			operand2Sequence = new EObjectContainmentWithInverseEList<BooleanBinaryExpression_operand2_Value>(BooleanBinaryExpression_operand2_Value.class, this, ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT);
		}
		return operand2Sequence;
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperand1Sequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatorSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperand2Sequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE:
				return ((InternalEList<?>)getOperand1Sequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE:
				return ((InternalEList<?>)getOperatorSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE:
				return ((InternalEList<?>)getOperand2Sequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE:
				return getOperand1Sequence();
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE:
				return getOperatorSequence();
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE:
				return getOperand2Sequence();
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE:
				getOperand1Sequence().clear();
				getOperand1Sequence().addAll((Collection<? extends BooleanBinaryExpression_operand1_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE:
				getOperatorSequence().clear();
				getOperatorSequence().addAll((Collection<? extends BooleanBinaryExpression_operator_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE:
				getOperand2Sequence().clear();
				getOperand2Sequence().addAll((Collection<? extends BooleanBinaryExpression_operand2_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE:
				getOperand1Sequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE:
				getOperatorSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE:
				getOperand2Sequence().clear();
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
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE:
				return operand1Sequence != null && !operand1Sequence.isEmpty();
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE:
				return operatorSequence != null && !operatorSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE:
				return operand2Sequence != null && !operand2Sequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedBooleanBinaryExpressionImpl
