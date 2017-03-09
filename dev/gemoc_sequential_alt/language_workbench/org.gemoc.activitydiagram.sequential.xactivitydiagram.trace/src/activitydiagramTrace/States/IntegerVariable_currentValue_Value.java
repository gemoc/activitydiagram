/**
 */
package activitydiagramTrace.States;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable current Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.IntegerVariable_currentValue_Value#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getIntegerVariable_currentValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface IntegerVariable_currentValue_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(int)
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerVariable_currentValue_Value_CurrentValue()
	 * @model unique="false"
	 * @generated
	 */
	int getCurrentValue();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.IntegerVariable_currentValue_Value#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(int value);

} // IntegerVariable_currentValue_Value
