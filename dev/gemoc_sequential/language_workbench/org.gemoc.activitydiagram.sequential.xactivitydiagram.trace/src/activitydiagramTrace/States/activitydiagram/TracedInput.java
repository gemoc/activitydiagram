/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.Input_inputValues_Dimension;
import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificTracedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedInput#getInput_inputValues_Dimension <em>Input input Values Dimension</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInput()
 * @model
 * @generated
 */
public interface TracedInput extends SpecificTracedObject<SpecificDimension<?>> {
	/**
	 * Returns the value of the '<em><b>Input input Values Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input input Values Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input input Values Dimension</em>' containment reference.
	 * @see #setInput_inputValues_Dimension(Input_inputValues_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInput_Input_inputValues_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Input_inputValues_Dimension getInput_inputValues_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedInput#getInput_inputValues_Dimension <em>Input input Values Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input input Values Dimension</em>' containment reference.
	 * @see #getInput_inputValues_Dimension()
	 * @generated
	 */
	void setInput_inputValues_Dimension(Input_inputValues_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getInput_inputValues_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedInput
