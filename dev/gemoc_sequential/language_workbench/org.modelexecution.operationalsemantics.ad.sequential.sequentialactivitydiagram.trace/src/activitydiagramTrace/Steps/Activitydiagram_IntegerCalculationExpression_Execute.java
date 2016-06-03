/**
 */
package activitydiagramTrace.Steps;

import activitydiagram.IntegerCalculationExpression;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Integer Calculation Expression Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_IntegerCalculationExpression_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_IntegerCalculationExpression_Execute extends Activitydiagram_NamedElement_Execute_AbstractSubStep, Activitydiagram_OpaqueAction_Execute_AbstractSubStep, SpecificStep, SmallStep, Activitydiagram_ActivityNode_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagram.IntegerCalculationExpression) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	IntegerCalculationExpression getCaller();

} // Activitydiagram_IntegerCalculationExpression_Execute
