/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedVariable;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Variable Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Variable_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_Variable_Execute extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedVariable) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedVariable getCaller();

} // Activitydiagram_Variable_Execute
