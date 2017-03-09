/**
 */
package activitydiagramTrace.States;

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
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getInput_inputValues_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Input_inputValues_Value extends SpecificReferenceValue<TracedInputValue> {
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

} // Input_inputValues_Value
