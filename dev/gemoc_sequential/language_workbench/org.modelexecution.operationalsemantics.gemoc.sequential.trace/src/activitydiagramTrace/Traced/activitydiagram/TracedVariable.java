/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagram.Value;

import activitydiagramTrace.Values.Variable_currentValue_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable#getCurrentValueTrace <em>Current Value Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedVariable()
 * @model abstract="true"
 * @generated
 */
public interface TracedVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' reference.
	 * @see #setInitialValue(Value)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedVariable_InitialValue()
	 * @model
	 * @generated
	 */
	Value getInitialValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable#getInitialValue <em>Initial Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Value value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' reference.
	 * @see #setCurrentValue(Value)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedVariable_CurrentValue()
	 * @model
	 * @generated
	 */
	Value getCurrentValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(Value value);

	/**
	 * Returns the value of the '<em><b>Current Value Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Variable_currentValue_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Variable_currentValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedVariable_CurrentValueTrace()
	 * @see activitydiagramTrace.Values.Variable_currentValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Variable_currentValue_Value> getCurrentValueTrace();

} // TracedVariable
