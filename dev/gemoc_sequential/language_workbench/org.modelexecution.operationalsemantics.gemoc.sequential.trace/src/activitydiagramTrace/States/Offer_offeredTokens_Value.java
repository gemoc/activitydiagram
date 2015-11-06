/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedOffer;
import activitydiagramTrace.States.activitydiagram.TracedToken;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer offered Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getOfferedTokens <em>Offered Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getOffer_offeredTokens_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Offer_offeredTokens_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Offered Tokens</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Tokens</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getOffer_offeredTokens_Value_OfferedTokens()
	 * @model
	 * @generated
	 */
	EList<TracedToken> getOfferedTokens();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedOffer#getOfferedTokensSequence <em>Offered Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedOffer)
	 * @see activitydiagramTrace.States.StatesPackage#getOffer_offeredTokens_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedOffer#getOfferedTokensSequence
	 * @model opposite="offeredTokensSequence" required="true" transient="false"
	 * @generated
	 */
	TracedOffer getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedOffer value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getOffer_offeredTokens_Value_States()
	 * @see activitydiagramTrace.States.State#getOffer_offeredTokens_Values
	 * @model opposite="offer_offeredTokens_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Offer_offeredTokens_Value
