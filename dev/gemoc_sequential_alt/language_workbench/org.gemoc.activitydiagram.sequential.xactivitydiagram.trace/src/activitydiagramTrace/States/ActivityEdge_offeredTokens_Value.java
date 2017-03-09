/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedControlToken;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge offered Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.ActivityEdge_offeredTokens_Value#getOfferedTokens <em>Offered Tokens</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_offeredTokens_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ActivityEdge_offeredTokens_Value extends SpecificReferenceValue<TracedControlToken> {
	/**
	 * Returns the value of the '<em><b>Offered Tokens</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedControlToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Tokens</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_offeredTokens_Value_OfferedTokens()
	 * @model
	 * @generated
	 */
	EList<TracedControlToken> getOfferedTokens();

} // ActivityEdge_offeredTokens_Value
