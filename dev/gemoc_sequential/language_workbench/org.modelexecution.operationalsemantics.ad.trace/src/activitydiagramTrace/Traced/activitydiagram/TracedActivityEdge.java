/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagram.Offer;

import activitydiagramTrace.Values.ActivityEdge_offers_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getOffers <em>Offers</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getOffersTrace <em>Offers Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface TracedActivityEdge extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TracedActivityNode)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	TracedActivityNode getSource();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TracedActivityNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TracedActivityNode)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	TracedActivityNode getTarget();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TracedActivityNode value);

	/**
	 * Returns the value of the '<em><b>Offers</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.Offer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge_Offers()
	 * @model
	 * @generated
	 */
	EList<Offer> getOffers();

	/**
	 * Returns the value of the '<em><b>Offers Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.ActivityEdge_offers_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.ActivityEdge_offers_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge_OffersTrace()
	 * @see activitydiagramTrace.Values.ActivityEdge_offers_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityEdge_offers_Value> getOffersTrace();

} // TracedActivityEdge
