/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedActivityNode;
import activitydiagramTrace.Traced.activitydiagram.TracedToken;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node held Tokens Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.ActivityNode_heldTokens_Value#getHeldTokens <em>Held Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.ActivityNode_heldTokens_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.ActivityNode_heldTokens_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getActivityNode_heldTokens_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ActivityNode_heldTokens_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getActivityNode_heldTokens_Value_HeldTokens()
	 * @model
	 * @generated
	 */
	EList<TracedToken> getHeldTokens();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getHeldTokensTrace <em>Held Tokens Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNode)
	 * @see activitydiagramTrace.Values.ValuesPackage#getActivityNode_heldTokens_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getHeldTokensTrace
	 * @model opposite="heldTokensTrace" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNode getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.ActivityNode_heldTokens_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityNode value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getActivityNode_heldTokens_Values <em>Activity Node held Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getActivityNode_heldTokens_Value_States()
	 * @see activitydiagramTrace.State#getActivityNode_heldTokens_Values
	 * @model opposite="activityNode_heldTokens_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // ActivityNode_heldTokens_Value
