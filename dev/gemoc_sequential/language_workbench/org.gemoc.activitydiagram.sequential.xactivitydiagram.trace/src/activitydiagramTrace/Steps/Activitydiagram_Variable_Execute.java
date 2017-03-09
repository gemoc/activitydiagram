/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.SpecificState;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;

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
public interface Activitydiagram_Variable_Execute extends SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Variable getCaller();

} // Activitydiagram_Variable_Execute
