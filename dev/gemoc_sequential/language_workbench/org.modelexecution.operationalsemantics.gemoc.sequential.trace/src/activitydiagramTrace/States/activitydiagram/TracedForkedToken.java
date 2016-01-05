/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagram.ForkedToken;

import activitydiagramTrace.States.ForkedToken_baseToken_Value;
import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Forked Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseToken <em>Base Token</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseTokenSequence <em>Base Token Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getRemainingOffersCountSequence <em>Remaining Offers Count Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken()
 * @model
 * @generated
 */
public interface TracedForkedToken extends TracedToken {
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
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_BaseToken()
	 * @model required="true"
	 * @generated
	 */
	TracedToken getBaseToken();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseToken <em>Base Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Token</em>' reference.
	 * @see #getBaseToken()
	 * @generated
	 */
	void setBaseToken(TracedToken value);

	/**
	 * Returns the value of the '<em><b>Base Token Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ForkedToken_baseToken_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_BaseTokenSequence()
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ForkedToken_baseToken_Value> getBaseTokenSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ForkedToken)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_OriginalObject()
	 * @model
	 * @generated
	 */
	ForkedToken getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ForkedToken value);

	/**
	 * Returns the value of the '<em><b>Remaining Offers Count Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Offers Count Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Offers Count Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_RemainingOffersCountSequence()
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ForkedToken_remainingOffersCount_Value> getRemainingOffersCountSequence();

} // TracedForkedToken
