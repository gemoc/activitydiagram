/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.Traced.activitydiagram.TracedOffer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge offers Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.ActivityEdge_offers_Value#getOffers <em>Offers</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.ActivityEdge_offers_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.ActivityEdge_offers_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getActivityEdge_offers_Value()
 * @model
 * @generated
 */
public interface ActivityEdge_offers_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Offers</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedOffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getActivityEdge_offers_Value_Offers()
	 * @model
	 * @generated
	 */
	EList<TracedOffer> getOffers();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getOffersTrace <em>Offers Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityEdge)
	 * @see activitydiagramTrace.Values.ValuesPackage#getActivityEdge_offers_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getOffersTrace
	 * @model opposite="offersTrace" required="true" transient="false"
	 * @generated
	 */
	TracedActivityEdge getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.ActivityEdge_offers_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityEdge value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getActivityEdge_offers_Value_States()
	 * @see activitydiagramTrace.State#getActivityEdge_offers_Values
	 * @model opposite="activityEdge_offers_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // ActivityEdge_offers_Value
