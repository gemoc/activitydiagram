/**
 */
package activitydiagramTrace;

import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificState;
import activitydiagramTrace.States.SpecificTracedObject;
import activitydiagramTrace.States.SpecificValue;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init;
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
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_Execute_Sequence <em>Activitydiagram Activity Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_RemoveToken_Sequence <em>Activitydiagram Activity Node Remove Token Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_Terminate_Sequence <em>Activitydiagram Activity Node Terminate Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_Execute_Sequence <em>Activitydiagram Activity Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanVariable_Init_Sequence <em>Activitydiagram Boolean Variable Init Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerVariable_Init_Sequence <em>Activitydiagram Integer Variable Init Sequence</em>}</li>
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
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Remove Token Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Remove Token Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Remove Token Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getSpecificTrace_Activitydiagram_ActivityNode_RemoveToken_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_RemoveToken> getActivitydiagram_ActivityNode_RemoveToken_Sequence();

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
