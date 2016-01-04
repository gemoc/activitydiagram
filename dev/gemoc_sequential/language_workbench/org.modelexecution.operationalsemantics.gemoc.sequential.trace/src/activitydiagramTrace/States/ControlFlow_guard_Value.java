/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;
import activitydiagramTrace.States.activitydiagram.TracedControlFlow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow guard Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.ControlFlow_guard_Value#getGuard <em>Guard</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ControlFlow_guard_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ControlFlow_guard_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getControlFlow_guard_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ControlFlow_guard_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(TracedBooleanVariable)
	 * @see activitydiagramTrace.States.StatesPackage#getControlFlow_guard_Value_Guard()
	 * @model
	 * @generated
	 */
	TracedBooleanVariable getGuard();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ControlFlow_guard_Value#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(TracedBooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedControlFlow#getGuardSequence <em>Guard Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedControlFlow)
	 * @see activitydiagramTrace.States.StatesPackage#getControlFlow_guard_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedControlFlow#getGuardSequence
	 * @model opposite="guardSequence" required="true" transient="false"
	 * @generated
	 */
	TracedControlFlow getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ControlFlow_guard_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedControlFlow value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getControlFlow_guard_Values <em>Control Flow guard Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getControlFlow_guard_Value_States()
	 * @see activitydiagramTrace.States.State#getControlFlow_guard_Values
	 * @model opposite="controlFlow_guard_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // ControlFlow_guard_Value
