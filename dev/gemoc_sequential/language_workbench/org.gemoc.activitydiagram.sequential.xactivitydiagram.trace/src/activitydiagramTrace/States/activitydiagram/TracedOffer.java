/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.Offer_offeredTokens_Dimension;
import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificTracedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedOffer#getOffer_offeredTokens_Dimension <em>Offer offered Tokens Dimension</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedOffer()
 * @model
 * @generated
 */
public interface TracedOffer extends SpecificTracedObject<SpecificDimension<?>> {
	/**
	 * Returns the value of the '<em><b>Offer offered Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer offered Tokens Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer offered Tokens Dimension</em>' containment reference.
	 * @see #setOffer_offeredTokens_Dimension(Offer_offeredTokens_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedOffer_Offer_offeredTokens_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Offer_offeredTokens_Dimension getOffer_offeredTokens_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedOffer#getOffer_offeredTokens_Dimension <em>Offer offered Tokens Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer offered Tokens Dimension</em>' containment reference.
	 * @see #getOffer_offeredTokens_Dimension()
	 * @generated
	 */
	void setOffer_offeredTokens_Dimension(Offer_offeredTokens_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getOffer_offeredTokens_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedOffer
