/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.OpaqueAction_expressions_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedOpaqueAction#getExpressionsSequence <em>Expressions Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedOpaqueAction()
 * @model
 * @generated
 */
public interface TracedOpaqueAction extends TracedAction {
	/**
	 * Returns the value of the '<em><b>Expressions Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.OpaqueAction_expressions_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.OpaqueAction_expressions_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedOpaqueAction_ExpressionsSequence()
	 * @see activitydiagramTrace.States.OpaqueAction_expressions_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<OpaqueAction_expressions_Value> getExpressionsSequence();

} // TracedOpaqueAction
