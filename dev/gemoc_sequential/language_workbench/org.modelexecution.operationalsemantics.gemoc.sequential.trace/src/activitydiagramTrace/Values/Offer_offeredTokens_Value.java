/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedOffer;
import activitydiagramTrace.Traced.activitydiagram.TracedToken;

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
 *   <li>{@link activitydiagramTrace.Values.Offer_offeredTokens_Value#getOfferedTokens <em>Offered Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Offer_offeredTokens_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Offer_offeredTokens_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getOffer_offeredTokens_Value()
 * @model
 * @generated
 */
public interface Offer_offeredTokens_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Offered Tokens</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Tokens</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getOffer_offeredTokens_Value_OfferedTokens()
	 * @model
	 * @generated
	 */
	EList<TracedToken> getOfferedTokens();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedOffer#getOfferedTokensTrace <em>Offered Tokens Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedOffer)
	 * @see activitydiagramTrace.Values.ValuesPackage#getOffer_offeredTokens_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedOffer#getOfferedTokensTrace
	 * @model opposite="offeredTokensTrace" required="true" transient="false"
	 * @generated
	 */
	TracedOffer getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.Offer_offeredTokens_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedOffer value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getOffer_offeredTokens_Value_States()
	 * @see activitydiagramTrace.State#getOffer_offeredTokens_Values
	 * @model opposite="offer_offeredTokens_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Offer_offeredTokens_Value
