/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedVariable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable current Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Variable_currentValue_Value#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Variable_currentValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Variable_currentValue_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getVariable_currentValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Variable_currentValue_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' reference.
	 * @see #setCurrentValue(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value)
	 * @see activitydiagramTrace.States.StatesPackage#getVariable_currentValue_Value_CurrentValue()
	 * @model
	 * @generated
	 */
	org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value getCurrentValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Variable_currentValue_Value#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedVariable#getCurrentValueSequence <em>Current Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedVariable)
	 * @see activitydiagramTrace.States.StatesPackage#getVariable_currentValue_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedVariable#getCurrentValueSequence
	 * @model opposite="currentValueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedVariable getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Variable_currentValue_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getVariable_currentValue_Values <em>Variable current Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getVariable_currentValue_Value_States()
	 * @see activitydiagramTrace.States.State#getVariable_currentValue_Values
	 * @model opposite="variable_currentValue_Values" required="true"
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

} // Variable_currentValue_Value
