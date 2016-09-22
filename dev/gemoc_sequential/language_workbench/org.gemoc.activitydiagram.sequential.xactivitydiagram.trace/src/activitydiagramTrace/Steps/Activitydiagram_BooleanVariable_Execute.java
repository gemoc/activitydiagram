/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Boolean Variable Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_BooleanVariable_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_BooleanVariable_Execute extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedBooleanVariable getCaller();

} // Activitydiagram_BooleanVariable_Execute
