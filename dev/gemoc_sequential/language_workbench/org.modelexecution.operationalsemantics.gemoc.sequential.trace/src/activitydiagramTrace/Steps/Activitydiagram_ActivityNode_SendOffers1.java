/**
 */
package activitydiagramTrace.Steps;

import activitydiagram.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Node Send Offers1</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_ActivityNode_SendOffers1()
 * @model
 * @generated
 */
public interface Activitydiagram_ActivityNode_SendOffers1 extends Activitydiagram_ActivityNode_Execute_AbstractSubStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (ActivityNode) this.getMse().getCaller();\r\n'"
	 * @generated
	 */
	ActivityNode getCaller();

} // Activitydiagram_ActivityNode_SendOffers1
