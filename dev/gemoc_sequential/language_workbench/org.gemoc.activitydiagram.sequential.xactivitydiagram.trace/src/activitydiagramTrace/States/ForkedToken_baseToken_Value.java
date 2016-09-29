/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedForkedToken;
import activitydiagramTrace.States.activitydiagram.TracedToken;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getForkedToken_baseToken_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ForkedToken_baseToken_Value extends Value {
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

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseTokenSequence <em>Base Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedForkedToken)
	 * @see activitydiagramTrace.States.StatesPackage#getForkedToken_baseToken_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseTokenSequence
	 * @model opposite="baseTokenSequence" required="true" transient="false"
	 * @generated
	 */
	TracedForkedToken getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedForkedToken value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getForkedToken_baseToken_Value_States()
	 * @see activitydiagramTrace.States.State#getForkedToken_baseToken_Values
	 * @model opposite="forkedToken_baseToken_Values" required="true"
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

} // ForkedToken_baseToken_Value
