/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.ControlFlow_guard_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedControlFlow#getGuardSequence <em>Guard Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedControlFlow()
 * @model
 * @generated
 */
public interface TracedControlFlow extends TracedActivityEdge {
	/**
	 * Returns the value of the '<em><b>Guard Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ControlFlow_guard_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ControlFlow_guard_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedControlFlow_GuardSequence()
	 * @see activitydiagramTrace.States.ControlFlow_guard_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ControlFlow_guard_Value> getGuardSequence();

} // TracedControlFlow
