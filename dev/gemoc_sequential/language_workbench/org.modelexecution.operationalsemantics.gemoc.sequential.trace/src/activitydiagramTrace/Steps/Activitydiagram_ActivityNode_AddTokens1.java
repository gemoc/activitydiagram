/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.Traced.activitydiagram.TracedActivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Node Add Tokens1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getThis <em>This</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_ActivityNode_AddTokens1()
 * @model
 * @generated
 */
public interface Activitydiagram_ActivityNode_AddTokens1 extends Activitydiagram_ActivityNode_Execute_AbstractSubStep, BigStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(TracedActivityNode)
	 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_ActivityNode_AddTokens1_This()
	 * @model
	 * @generated
	 */
	TracedActivityNode getThis();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(TracedActivityNode value);

	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' reference list.
	 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_ActivityNode_AddTokens1_SubSteps()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep> getSubSteps();

} // Activitydiagram_ActivityNode_AddTokens1
