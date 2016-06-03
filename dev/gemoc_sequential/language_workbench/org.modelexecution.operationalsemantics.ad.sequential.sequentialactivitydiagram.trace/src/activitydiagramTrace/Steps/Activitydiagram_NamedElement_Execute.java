/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedNamedElement;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Named Element Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_NamedElement_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_NamedElement_Execute extends SpecificStep, SequentialStep<Activitydiagram_NamedElement_Execute_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedNamedElement) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedNamedElement getCaller();

} // Activitydiagram_NamedElement_Execute
