/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.InputValue_value_Value;
import activitydiagramTrace.States.InputValue_variable_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Input Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedInputValue#getValueSequence <em>Value Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedInputValue#getVariableSequence <em>Variable Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInputValue()
 * @model
 * @generated
 */
public interface TracedInputValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.InputValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.InputValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInputValue_ValueSequence()
	 * @see activitydiagramTrace.States.InputValue_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InputValue_value_Value> getValueSequence();

	/**
	 * Returns the value of the '<em><b>Variable Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.InputValue_variable_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.InputValue_variable_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInputValue_VariableSequence()
	 * @see activitydiagramTrace.States.InputValue_variable_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InputValue_variable_Value> getVariableSequence();

} // TracedInputValue
