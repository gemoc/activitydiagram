/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerComparisonExpressionImpl extends BooleanExpressionImpl implements IntegerComparisonExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final IntegerComparisonOperator OPERATOR_EDEFAULT = IntegerComparisonOperator.SMALLER;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected IntegerComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression operand1;

	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression operand2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerComparisonExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.INTEGER_COMPARISON_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(IntegerComparisonOperator newOperator) {
		IntegerComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getOperand1() {
		if (operand1 != null && operand1.eIsProxy()) {
			InternalEObject oldOperand1 = (InternalEObject)operand1;
			operand1 = (IntegerExpression)eResolveProxy(oldOperand1);
			if (operand1 != oldOperand1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1, oldOperand1, operand1));
			}
		}
		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetOperand1() {
		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand1(IntegerExpression newOperand1) {
		IntegerExpression oldOperand1 = operand1;
		operand1 = newOperand1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1, oldOperand1, operand1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getOperand2() {
		if (operand2 != null && operand2.eIsProxy()) {
			InternalEObject oldOperand2 = (InternalEObject)operand2;
			operand2 = (IntegerExpression)eResolveProxy(oldOperand2);
			if (operand2 != oldOperand2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2, oldOperand2, operand2));
			}
		}
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetOperand2() {
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand2(IntegerExpression newOperand2) {
		IntegerExpression oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2, oldOperand2, operand2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
				return getOperator();
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
				if (resolve) return getOperand1();
				return basicGetOperand1();
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
				if (resolve) return getOperand2();
				return basicGetOperand2();
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
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
				setOperator((IntegerComparisonOperator)newValue);
				return;
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
				setOperand1((IntegerExpression)newValue);
				return;
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
				setOperand2((IntegerExpression)newValue);
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
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
				setOperand1((IntegerExpression)null);
				return;
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
				setOperand2((IntegerExpression)null);
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
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
				return operand1 != null;
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
				return operand2 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //IntegerComparisonExpressionImpl
