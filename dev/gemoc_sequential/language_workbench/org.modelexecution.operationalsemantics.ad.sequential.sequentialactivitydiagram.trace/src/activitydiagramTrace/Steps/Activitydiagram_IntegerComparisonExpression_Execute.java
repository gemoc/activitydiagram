/**
 */
package activitydiagramTrace.Steps;

import activitydiagram.IntegerComparisonExpression;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Integer Comparison Expression Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_IntegerComparisonExpression_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_IntegerComparisonExpression_Execute extends Activitydiagram_NamedElement_Execute_AbstractSubStep, SpecificStep, SmallStep, Activitydiagram_OpaqueAction_Execute_AbstractSubStep, Activitydiagram_ActivityNode_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagram.IntegerComparisonExpression) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	IntegerComparisonExpression getCaller();

} // Activitydiagram_IntegerComparisonExpression_Execute
