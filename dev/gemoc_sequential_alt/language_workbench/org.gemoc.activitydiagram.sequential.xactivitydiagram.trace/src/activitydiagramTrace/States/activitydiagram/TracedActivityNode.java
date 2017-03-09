/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.ActivityNode_heldTokens_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getActivityNode_heldTokens_Dimension <em>Activity Node held Tokens Dimension</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface TracedActivityNode extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node held Tokens Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node held Tokens Dimension</em>' containment reference.
	 * @see #setActivityNode_heldTokens_Dimension(ActivityNode_heldTokens_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_ActivityNode_heldTokens_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	ActivityNode_heldTokens_Dimension getActivityNode_heldTokens_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getActivityNode_heldTokens_Dimension <em>Activity Node held Tokens Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Node held Tokens Dimension</em>' containment reference.
	 * @see #getActivityNode_heldTokens_Dimension()
	 * @generated
	 */
	void setActivityNode_heldTokens_Dimension(ActivityNode_heldTokens_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getActivityNode_heldTokens_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedActivityNode
