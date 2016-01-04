/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivity;
import activitydiagramTrace.States.activitydiagram.TracedVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity locals Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Activity_locals_Value#getLocals <em>Locals</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Activity_locals_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Activity_locals_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivity_locals_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Activity_locals_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Locals</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_locals_Value_Locals()
	 * @model
	 * @generated
	 */
	EList<TracedVariable> getLocals();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getLocalsSequence <em>Locals Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivity)
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_locals_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getLocalsSequence
	 * @model opposite="localsSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivity getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Activity_locals_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivity value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getActivity_locals_Values <em>Activity locals Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_locals_Value_States()
	 * @see activitydiagramTrace.States.State#getActivity_locals_Values
	 * @model opposite="activity_locals_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Activity_locals_Value
