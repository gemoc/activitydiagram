/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedInput;
import activitydiagramTrace.States.activitydiagram.TracedInputValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input input Values Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Input_inputValues_Value#getInputValues <em>Input Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Input_inputValues_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Input_inputValues_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getInput_inputValues_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Input_inputValues_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Input Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedInputValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getInput_inputValues_Value_InputValues()
	 * @model
	 * @generated
	 */
	EList<TracedInputValue> getInputValues();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedInput#getInputValuesSequence <em>Input Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedInput)
	 * @see activitydiagramTrace.States.StatesPackage#getInput_inputValues_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedInput#getInputValuesSequence
	 * @model opposite="inputValuesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedInput getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Input_inputValues_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedInput value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getInput_inputValues_Values <em>Input input Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getInput_inputValues_Value_States()
	 * @see activitydiagramTrace.States.State#getInput_inputValues_Values
	 * @model opposite="input_inputValues_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // Input_inputValues_Value
