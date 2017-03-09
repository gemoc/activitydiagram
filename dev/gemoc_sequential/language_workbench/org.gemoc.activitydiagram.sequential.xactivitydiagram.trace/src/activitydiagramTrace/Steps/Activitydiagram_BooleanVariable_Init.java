/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.SpecificState;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Boolean Variable Init</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_BooleanVariable_Init()
 * @model
 * @generated
 */
public interface Activitydiagram_BooleanVariable_Init extends Activitydiagram_Activity_Execute_AbstractSubStep, SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	BooleanVariable getCaller();

} // Activitydiagram_BooleanVariable_Init
