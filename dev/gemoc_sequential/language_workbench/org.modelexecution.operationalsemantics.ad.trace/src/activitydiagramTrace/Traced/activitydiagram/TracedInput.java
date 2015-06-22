/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagramTrace.Values.Input_inputValues_Value;

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
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedInput#getInputValuesTrace <em>Input Values Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedInput()
 * @model
 * @generated
 */
public interface TracedInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Values Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Input_inputValues_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Input_inputValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Values Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Values Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedInput_InputValuesTrace()
	 * @see activitydiagramTrace.Values.Input_inputValues_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Input_inputValues_Value> getInputValuesTrace();

} // TracedInput
