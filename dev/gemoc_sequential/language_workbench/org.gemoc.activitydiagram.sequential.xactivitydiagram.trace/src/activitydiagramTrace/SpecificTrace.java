/**
 */
package activitydiagramTrace;

import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificState;
import activitydiagramTrace.States.SpecificTracedObject;
import activitydiagramTrace.States.SpecificValue;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Reset;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Init;
import activitydiagramTrace.Steps.SpecificStep;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_AddToken_Sequence <em>Activitydiagram Activity Node Add Token Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_AddTokens1_Sequence <em>Activitydiagram Activity Node Add Tokens1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_Execute_Sequence <em>Activitydiagram Activity Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_RemoveToken1_Sequence <em>Activitydiagram Activity Node Remove Token1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_SendOffers1_Sequence <em>Activitydiagram Activity Node Send Offers1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence <em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_Terminate_Sequence <em>Activitydiagram Activity Node Terminate Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_Execute_Sequence <em>Activitydiagram Activity Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_Reset_Sequence <em>Activitydiagram Activity Reset Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanVariable_Execute_Sequence <em>Activitydiagram Boolean Variable Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanVariable_Init_Sequence <em>Activitydiagram Boolean Variable Init Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_DecisionNode_SendOffers1_Sequence <em>Activitydiagram Decision Node Send Offers1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerVariable_Execute_Sequence <em>Activitydiagram Integer Variable Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerVariable_Init_Sequence <em>Activitydiagram Integer Variable Init Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Variable_Execute_Sequence <em>Activitydiagram Variable Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Variable_Init_Sequence <em>Activitydiagram Variable Init Sequence</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<? extends SpecificStep, ? extends SpecificState>, SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>, SpecificState> {
	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Add Token Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Add Token Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Add Token Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_ActivityNode_AddToken_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_AddToken> getActivitydiagram_ActivityNode_AddToken_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Add Tokens1 Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Add Tokens1 Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Add Tokens1 Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_ActivityNode_AddTokens1_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_AddTokens1> getActivitydiagram_ActivityNode_AddTokens1_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Execute Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_ActivityNode_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_Execute> getActivitydiagram_ActivityNode_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Remove Token1 Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Remove Token1 Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Remove Token1 Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_ActivityNode_RemoveToken1_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_RemoveToken1> getActivitydiagram_ActivityNode_RemoveToken1_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Send Offers1 Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Send Offers1 Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Send Offers1 Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_ActivityNode_SendOffers1_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_SendOffers1> getActivitydiagram_ActivityNode_SendOffers1_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_TakeOfferdTokens1> getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Terminate Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Terminate Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Terminate Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_ActivityNode_Terminate_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_Terminate> getActivitydiagram_ActivityNode_Terminate_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Execute Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_Activity_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Activity_Execute> getActivitydiagram_Activity_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Reset Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Activity_Reset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Reset Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Reset Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_Activity_Reset_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Activity_Reset> getActivitydiagram_Activity_Reset_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Boolean Variable Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Boolean Variable Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Boolean Variable Execute Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_BooleanVariable_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_BooleanVariable_Execute> getActivitydiagram_BooleanVariable_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Boolean Variable Init Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Boolean Variable Init Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Boolean Variable Init Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_BooleanVariable_Init_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_BooleanVariable_Init> getActivitydiagram_BooleanVariable_Init_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Decision Node Send Offers1 Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Decision Node Send Offers1 Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Decision Node Send Offers1 Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_DecisionNode_SendOffers1_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_DecisionNode_SendOffers1> getActivitydiagram_DecisionNode_SendOffers1_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Integer Variable Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Integer Variable Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Integer Variable Execute Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_IntegerVariable_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_IntegerVariable_Execute> getActivitydiagram_IntegerVariable_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Integer Variable Init Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Integer Variable Init Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Integer Variable Init Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_IntegerVariable_Init_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_IntegerVariable_Init> getActivitydiagram_IntegerVariable_Init_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Variable Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Variable_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Variable Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Variable Execute Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_Variable_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Variable_Execute> getActivitydiagram_Variable_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Variable Init Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Variable Init Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Variable Init Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_Variable_Init_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Variable_Init> getActivitydiagram_Variable_Init_Sequence();

} // SpecificTrace
