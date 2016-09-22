/**
 */
package activitydiagramTrace.States.activitydiagram;

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
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedInput#getInputValuesSequence <em>Input Values Sequence</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInput()
 * @model
 * @generated
 */
public interface TracedInput extends EObject {
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

} // TracedInput
