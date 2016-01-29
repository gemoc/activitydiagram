/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedBooleanValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.BooleanValue_value_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.BooleanValue_value_Value#getStates <em>States</em>}</li>
 *   <li>{@link activitydiagramTrace.States.BooleanValue_value_Value#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getBooleanValue_value_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface BooleanValue_value_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanValue#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedBooleanValue)
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanValue_value_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanValue#getValueSequence
	 * @model opposite="valueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedBooleanValue getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.BooleanValue_value_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedBooleanValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanValue_value_Value_States()
	 * @see activitydiagramTrace.States.State#getBooleanValue_value_Values
	 * @model opposite="booleanValue_value_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanValue_value_Value_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.BooleanValue_value_Value#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanValue_value_Value
