/**
 */
package activitydiagramTrace.Steps;

import activitydiagram.Expression;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Expression Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Expression_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_Expression_Execute extends Activitydiagram_NamedElement_Execute_AbstractSubStep, Activitydiagram_OpaqueAction_Execute_AbstractSubStep, Activitydiagram_ActivityNode_Execute_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagram.Expression) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Expression getCaller();

} // Activitydiagram_Expression_Execute
