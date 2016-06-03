/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.Offer_offeredTokens_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedOffer#getOfferedTokensSequence <em>Offered Tokens Sequence</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedOffer()
 * @model
 * @generated
 */
public interface TracedOffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Offered Tokens Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Offer_offeredTokens_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Tokens Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Tokens Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedOffer_OfferedTokensSequence()
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Offer_offeredTokens_Value> getOfferedTokensSequence();

} // TracedOffer
