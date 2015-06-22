/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedInputValue;
import activitydiagramTrace.Traced.activitydiagram.TracedVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Value variable Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.InputValue_variable_Value#getVariable <em>Variable</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.InputValue_variable_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.InputValue_variable_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getInputValue_variable_Value()
 * @model
 * @generated
 */
public interface InputValue_variable_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(TracedVariable)
	 * @see activitydiagramTrace.Values.ValuesPackage#getInputValue_variable_Value_Variable()
	 * @model required="true"
	 * @generated
	 */
	TracedVariable getVariable();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.InputValue_variable_Value#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(TracedVariable value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getVariableTrace <em>Variable Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedInputValue)
	 * @see activitydiagramTrace.Values.ValuesPackage#getInputValue_variable_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getVariableTrace
	 * @model opposite="variableTrace" required="true" transient="false"
	 * @generated
	 */
	TracedInputValue getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.InputValue_variable_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedInputValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getInputValue_variable_Values <em>Input Value variable Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getInputValue_variable_Value_States()
	 * @see activitydiagramTrace.State#getInputValue_variable_Values
	 * @model opposite="inputValue_variable_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // InputValue_variable_Value
