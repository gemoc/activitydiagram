/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedValue;
import activitydiagramTrace.States.activitydiagram.TracedVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable initial Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Variable_initialValue_Value#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Variable_initialValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Variable_initialValue_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getVariable_initialValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Variable_initialValue_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' reference.
	 * @see #setInitialValue(TracedValue)
	 * @see activitydiagramTrace.States.StatesPackage#getVariable_initialValue_Value_InitialValue()
	 * @model
	 * @generated
	 */
	TracedValue getInitialValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Variable_initialValue_Value#getInitialValue <em>Initial Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(TracedValue value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedVariable#getInitialValueSequence <em>Initial Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedVariable)
	 * @see activitydiagramTrace.States.StatesPackage#getVariable_initialValue_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedVariable#getInitialValueSequence
	 * @model opposite="initialValueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedVariable getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Variable_initialValue_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedVariable value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getVariable_initialValue_Values <em>Variable initial Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getVariable_initialValue_Value_States()
	 * @see activitydiagramTrace.States.State#getVariable_initialValue_Values
	 * @model opposite="variable_initialValue_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Variable_initialValue_Value
