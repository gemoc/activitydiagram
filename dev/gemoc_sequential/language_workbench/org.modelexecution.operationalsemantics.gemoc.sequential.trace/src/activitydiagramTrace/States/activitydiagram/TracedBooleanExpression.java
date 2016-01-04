/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.BooleanExpression_assignee_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanExpression#getAssigneeSequence <em>Assignee Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanExpression()
 * @model abstract="true"
 * @generated
 */
public interface TracedBooleanExpression extends TracedExpression {
	/**
	 * Returns the value of the '<em><b>Assignee Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanExpression_assignee_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanExpression_AssigneeSequence()
	 * @see activitydiagramTrace.States.BooleanExpression_assignee_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanExpression_assignee_Value> getAssigneeSequence();

} // TracedBooleanExpression
