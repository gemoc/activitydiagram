/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedInputValue;
import activitydiagramTrace.States.activitydiagram.TracedValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Value value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.InputValue_value_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.InputValue_value_Value#getStates <em>States</em>}</li>
 *   <li>{@link activitydiagramTrace.States.InputValue_value_Value#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getInputValue_value_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface InputValue_value_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedInputValue#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedInputValue)
	 * @see activitydiagramTrace.States.StatesPackage#getInputValue_value_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedInputValue#getValueSequence
	 * @model opposite="valueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedInputValue getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.InputValue_value_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedInputValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getInputValue_value_Values <em>Input Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getInputValue_value_Value_States()
	 * @see activitydiagramTrace.States.State#getInputValue_value_Values
	 * @model opposite="inputValue_value_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

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
	 * @see activitydiagramTrace.States.StatesPackage#getInputValue_value_Value_Value()
	 * @model required="true"
	 * @generated
	 */
	TracedValue getValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.InputValue_value_Value#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TracedValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // InputValue_value_Value
