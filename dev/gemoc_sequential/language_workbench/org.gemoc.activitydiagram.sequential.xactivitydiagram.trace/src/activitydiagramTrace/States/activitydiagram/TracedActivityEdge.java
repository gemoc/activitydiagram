/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.ActivityEdge_offers_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getActivityEdge_offers_Dimension <em>Activity Edge offers Dimension</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface TracedActivityEdge extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Activity Edge offers Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge offers Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge offers Dimension</em>' containment reference.
	 * @see #setActivityEdge_offers_Dimension(ActivityEdge_offers_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityEdge_ActivityEdge_offers_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	ActivityEdge_offers_Dimension getActivityEdge_offers_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getActivityEdge_offers_Dimension <em>Activity Edge offers Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Edge offers Dimension</em>' containment reference.
	 * @see #getActivityEdge_offers_Dimension()
	 * @generated
	 */
	void setActivityEdge_offers_Dimension(ActivityEdge_offers_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getActivityEdge_offers_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedActivityEdge
