/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedControlToken;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node held Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value#getHeldTokens <em>Held Tokens</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_heldTokens_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ActivityNode_heldTokens_Value extends SpecificReferenceValue<TracedControlToken> {
	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedControlToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_heldTokens_Value_HeldTokens()
	 * @model
	 * @generated
	 */
	EList<TracedControlToken> getHeldTokens();

} // ActivityNode_heldTokens_Value
