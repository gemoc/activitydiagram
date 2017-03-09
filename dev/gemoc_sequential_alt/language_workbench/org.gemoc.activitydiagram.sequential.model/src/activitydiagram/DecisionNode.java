/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.DecisionNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link activitydiagram.DecisionNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see activitydiagram.ActivitydiagramPackage#getDecisionNode()
 * @model
 * @generated
 */
public interface DecisionNode extends ControlNode {

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(ActivityEdge)
	 * @see activitydiagram.ActivitydiagramPackage#getDecisionNode_Incoming()
	 * @model required="true"
	 * @generated
	 */
	ActivityEdge getIncoming();

	/**
	 * Sets the value of the '{@link activitydiagram.DecisionNode#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(ActivityEdge value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getDecisionNode_Outgoing()
	 * @model
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();
} // DecisionNode
