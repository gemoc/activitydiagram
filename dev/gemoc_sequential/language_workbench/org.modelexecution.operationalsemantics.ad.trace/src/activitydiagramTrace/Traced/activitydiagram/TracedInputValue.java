/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagramTrace.Values.InputValue_value_Value;
import activitydiagramTrace.Values.InputValue_variable_Value;

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
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getValueTrace <em>Value Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getVariableTrace <em>Variable Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedInputValue()
 * @model
 * @generated
 */
public interface TracedInputValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.InputValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.InputValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedInputValue_ValueTrace()
	 * @see activitydiagramTrace.Values.InputValue_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InputValue_value_Value> getValueTrace();

	/**
	 * Returns the value of the '<em><b>Variable Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.InputValue_variable_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.InputValue_variable_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedInputValue_VariableTrace()
	 * @see activitydiagramTrace.Values.InputValue_variable_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InputValue_variable_Value> getVariableTrace();

} // TracedInputValue
