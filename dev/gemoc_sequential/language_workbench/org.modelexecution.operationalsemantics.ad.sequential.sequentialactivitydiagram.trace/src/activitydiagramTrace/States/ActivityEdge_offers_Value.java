/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;
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
 *   <li>{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_offers_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ActivityEdge_offers_Value extends Value {
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

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getOffersSequence <em>Offers Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityEdge)
	 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_offers_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getOffersSequence
	 * @model opposite="offersSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityEdge getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityEdge value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_offers_Value_States()
	 * @see activitydiagramTrace.States.State#getActivityEdge_offers_Values
	 * @model opposite="activityEdge_offers_Values" required="true"
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

} // ActivityEdge_offers_Value
