/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedInput;
import activitydiagramTrace.Traced.activitydiagram.TracedInputValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input input Values Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.Input_inputValues_Value#getInputValues <em>Input Values</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Input_inputValues_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Input_inputValues_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getInput_inputValues_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Input_inputValues_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Values</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getInput_inputValues_Value_InputValues()
	 * @model
	 * @generated
	 */
	EList<TracedInputValue> getInputValues();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedInput#getInputValuesTrace <em>Input Values Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedInput)
	 * @see activitydiagramTrace.Values.ValuesPackage#getInput_inputValues_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInput#getInputValuesTrace
	 * @model opposite="inputValuesTrace" required="true" transient="false"
	 * @generated
	 */
	TracedInput getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.Input_inputValues_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedInput value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getInput_inputValues_Values <em>Input input Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getInput_inputValues_Value_States()
	 * @see activitydiagramTrace.State#getInput_inputValues_Values
	 * @model opposite="input_inputValues_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Input_inputValues_Value
