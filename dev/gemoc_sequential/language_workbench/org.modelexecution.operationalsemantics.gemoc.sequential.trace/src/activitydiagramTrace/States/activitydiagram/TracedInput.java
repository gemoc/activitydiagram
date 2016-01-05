/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagram.Input;

import activitydiagramTrace.States.Input_inputValues_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedInput#getInputValues <em>Input Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedInput#getInputValuesSequence <em>Input Values Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedInput#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInput()
 * @model
 * @generated
 */
public interface TracedInput extends EObject {
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
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInput_InputValues()
	 * @model
	 * @generated
	 */
	EList<TracedInputValue> getInputValues();

	/**
	 * Returns the value of the '<em><b>Input Values Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Input_inputValues_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Input_inputValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Values Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Values Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInput_InputValuesSequence()
	 * @see activitydiagramTrace.States.Input_inputValues_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Input_inputValues_Value> getInputValuesSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Input)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInput_OriginalObject()
	 * @model
	 * @generated
	 */
	Input getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedInput#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Input value);

} // TracedInput
