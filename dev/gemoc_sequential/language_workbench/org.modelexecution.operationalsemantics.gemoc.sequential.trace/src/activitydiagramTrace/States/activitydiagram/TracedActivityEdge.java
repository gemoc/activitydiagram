/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.ActivityEdge_offers_Value;
import activitydiagramTrace.States.ActivityEdge_source_Value;
import activitydiagramTrace.States.ActivityEdge_target_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getTargetSequence <em>Target Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getOffersSequence <em>Offers Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getSourceSequence <em>Source Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface TracedActivityEdge extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Target Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityEdge_target_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityEdge_target_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge_TargetSequence()
	 * @see activitydiagramTrace.States.ActivityEdge_target_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityEdge_target_Value> getTargetSequence();

	/**
	 * Returns the value of the '<em><b>Offers Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityEdge_offers_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge_OffersSequence()
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityEdge_offers_Value> getOffersSequence();

	/**
	 * Returns the value of the '<em><b>Source Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityEdge_source_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityEdge_source_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge_SourceSequence()
	 * @see activitydiagramTrace.States.ActivityEdge_source_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityEdge_source_Value> getSourceSequence();

} // TracedActivityEdge
