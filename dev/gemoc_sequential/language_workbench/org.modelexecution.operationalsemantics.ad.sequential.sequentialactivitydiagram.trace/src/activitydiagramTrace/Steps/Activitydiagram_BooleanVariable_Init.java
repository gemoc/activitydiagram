/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;

import org.gemoc.executionframework.engine.mse.SmallStep;

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
public interface Activitydiagram_BooleanVariable_Init extends SpecificStep, SmallStep, Activitydiagram_NamedElement_Execute_AbstractSubStep, Activitydiagram_Activity_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedBooleanVariable getCaller();

} // Activitydiagram_BooleanVariable_Init
