/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedInputValue;
import activitydiagramTrace.Traced.activitydiagram.TracedValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Value value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.InputValue_value_Value#getValue <em>Value</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.InputValue_value_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.InputValue_value_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getInputValue_value_Value()
 * @model
 * @generated
 */
public interface InputValue_value_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(TracedValue)
	 * @see activitydiagramTrace.Values.ValuesPackage#getInputValue_value_Value_Value()
	 * @model required="true"
	 * @generated
	 */
	TracedValue getValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.InputValue_value_Value#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TracedValue value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getValueTrace <em>Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedInputValue)
	 * @see activitydiagramTrace.Values.ValuesPackage#getInputValue_value_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getValueTrace
	 * @model opposite="valueTrace" required="true" transient="false"
	 * @generated
	 */
	TracedInputValue getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.InputValue_value_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getInputValue_value_Values <em>Input Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getInputValue_value_Value_States()
	 * @see activitydiagramTrace.State#getInputValue_value_Values
	 * @model opposite="inputValue_value_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // InputValue_value_Value
