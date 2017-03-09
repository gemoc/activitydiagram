/**
 */
package activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.InitialNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see activitydiagram.ActivitydiagramPackage#getInitialNode()
 * @model
 * @generated
 */
public interface InitialNode extends ControlNode {

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(ActivityEdge)
	 * @see activitydiagram.ActivitydiagramPackage#getInitialNode_Outgoing()
	 * @model required="true"
	 * @generated
	 */
	ActivityEdge getOutgoing();

	/**
	 * Sets the value of the '{@link activitydiagram.InitialNode#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(ActivityEdge value);
} // InitialNode
