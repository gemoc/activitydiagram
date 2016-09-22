/**
 */
package org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.Offer#getOfferedTokens <em>Offered Tokens</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getOffer()
 * @model
 * @generated
 */
public interface Offer extends EObject {
	/**
	 * Returns the value of the '<em><b>Offered Tokens</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Tokens</em>' reference list.
	 * @see org.gemoc.activitydiagram.sequential.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getOffer_OfferedTokens()
	 * @model
	 * @generated
	 */
	EList<Token> getOfferedTokens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasTokens1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeWithdrawnTokens1();

} // Offer
