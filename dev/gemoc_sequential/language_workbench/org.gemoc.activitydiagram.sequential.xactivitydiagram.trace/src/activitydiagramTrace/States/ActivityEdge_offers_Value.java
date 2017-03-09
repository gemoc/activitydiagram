/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedOffer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge offers Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_offers_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ActivityEdge_offers_Value extends SpecificReferenceValue<TracedOffer> {
	/**
	 * Returns the value of the '<em><b>Offers</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedOffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_offers_Value_Offers()
	 * @model
	 * @generated
	 */
	EList<TracedOffer> getOffers();

} // ActivityEdge_offers_Value
