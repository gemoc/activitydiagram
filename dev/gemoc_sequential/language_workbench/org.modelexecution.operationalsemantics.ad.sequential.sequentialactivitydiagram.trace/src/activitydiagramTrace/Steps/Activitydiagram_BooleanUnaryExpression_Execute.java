/**
 */
package activitydiagramTrace.Steps;

import activitydiagram.BooleanUnaryExpression;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Boolean Unary Expression Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_BooleanUnaryExpression_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_BooleanUnaryExpression_Execute extends Activitydiagram_NamedElement_Execute_AbstractSubStep, Activitydiagram_OpaqueAction_Execute_AbstractSubStep, Activitydiagram_ActivityNode_Execute_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagram.BooleanUnaryExpression) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	BooleanUnaryExpression getCaller();

} // Activitydiagram_BooleanUnaryExpression_Execute
