/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forked Token base Token Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getBaseToken <em>Base Token</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getForkedToken_baseToken_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ForkedToken_baseToken_Value extends SpecificReferenceValue<TracedToken> {
	/**
	 * Returns the value of the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token</em>' reference.
	 * @see #setBaseToken(TracedToken)
	 * @see activitydiagramTrace.States.StatesPackage#getForkedToken_baseToken_Value_BaseToken()
	 * @model
	 * @generated
	 */
	TracedToken getBaseToken();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getBaseToken <em>Base Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Token</em>' reference.
	 * @see #getBaseToken()
	 * @generated
	 */
	void setBaseToken(TracedToken value);

} // ForkedToken_baseToken_Value
