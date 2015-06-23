/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedValue;
import activitydiagramTrace.Traced.activitydiagram.TracedVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable current Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.Variable_currentValue_Value#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Variable_currentValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Variable_currentValue_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getVariable_currentValue_Value()
 * @model
 * @generated
 */
public interface Variable_currentValue_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' reference.
	 * @see #setCurrentValue(TracedValue)
	 * @see activitydiagramTrace.Values.ValuesPackage#getVariable_currentValue_Value_CurrentValue()
	 * @model
	 * @generated
	 */
	TracedValue getCurrentValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.Variable_currentValue_Value#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(TracedValue value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable#getCurrentValueTrace <em>Current Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedVariable)
	 * @see activitydiagramTrace.Values.ValuesPackage#getVariable_currentValue_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedVariable#getCurrentValueTrace
	 * @model opposite="currentValueTrace" required="true" transient="false"
	 * @generated
	 */
	TracedVariable getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.Variable_currentValue_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedVariable value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getVariable_currentValue_Values <em>Variable current Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getVariable_currentValue_Value_States()
	 * @see activitydiagramTrace.State#getVariable_currentValue_Values
	 * @model opposite="variable_currentValue_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Variable_currentValue_Value
