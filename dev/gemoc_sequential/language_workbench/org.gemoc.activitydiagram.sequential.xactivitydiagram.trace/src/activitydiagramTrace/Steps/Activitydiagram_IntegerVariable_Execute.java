/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.SpecificState;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;

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
public interface Activitydiagram_IntegerVariable_Execute extends SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	IntegerVariable getCaller();

} // Activitydiagram_IntegerVariable_Execute
