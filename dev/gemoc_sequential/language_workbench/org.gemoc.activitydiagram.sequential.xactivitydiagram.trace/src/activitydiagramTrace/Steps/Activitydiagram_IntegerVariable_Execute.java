/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedIntegerVariable;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Integer Variable Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_IntegerVariable_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_IntegerVariable_Execute extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedIntegerVariable getCaller();

} // Activitydiagram_IntegerVariable_Execute
