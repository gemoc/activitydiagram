/**
 */
package activitydiagramTrace.Traced;

import activitydiagramTrace.Traced.activitydiagram.TracedActivity;
import activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode;
import activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue;
import activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable;
import activitydiagramTrace.Traced.activitydiagram.TracedControlFlow;
import activitydiagramTrace.Traced.activitydiagram.TracedControlToken;
import activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode;
import activitydiagramTrace.Traced.activitydiagram.TracedForkNode;
import activitydiagramTrace.Traced.activitydiagram.TracedForkedToken;
import activitydiagramTrace.Traced.activitydiagram.TracedInitialNode;
import activitydiagramTrace.Traced.activitydiagram.TracedInput;
import activitydiagramTrace.Traced.activitydiagram.TracedInputValue;
import activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue;
import activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable;
import activitydiagramTrace.Traced.activitydiagram.TracedJoinNode;
import activitydiagramTrace.Traced.activitydiagram.TracedMergeNode;
import activitydiagramTrace.Traced.activitydiagram.TracedOffer;
import activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction;
import activitydiagramTrace.Traced.activitydiagram.TracedTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedOffers <em>Activitydiagram traced Offers</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedIntegerVariables <em>Activitydiagram traced Integer Variables</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedControlTokens <em>Activitydiagram traced Control Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedBooleanVariables <em>Activitydiagram traced Boolean Variables</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedInputValues <em>Activitydiagram traced Input Values</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedInputs <em>Activitydiagram traced Inputs</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedActivitys <em>Activitydiagram traced Activitys</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedInitialNodes <em>Activitydiagram traced Initial Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedTraces <em>Activitydiagram traced Traces</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedForkedTokens <em>Activitydiagram traced Forked Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedBooleanValues <em>Activitydiagram traced Boolean Values</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedDecisionNodes <em>Activitydiagram traced Decision Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedActivityFinalNodes <em>Activitydiagram traced Activity Final Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedControlFlows <em>Activitydiagram traced Control Flows</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedJoinNodes <em>Activitydiagram traced Join Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedMergeNodes <em>Activitydiagram traced Merge Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedOpaqueActions <em>Activitydiagram traced Opaque Actions</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedForkNodes <em>Activitydiagram traced Fork Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedIntegerValues <em>Activitydiagram traced Integer Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects()
 * @model
 * @generated
 */
public interface TracedObjects extends EObject {
	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Offers</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedOffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Offers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Offers</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedOffers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedOffer> getActivitydiagram_tracedOffers();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Integer Variables</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Integer Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Integer Variables</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedIntegerVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedIntegerVariable> getActivitydiagram_tracedIntegerVariables();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Control Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedControlToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Control Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Control Tokens</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedControlTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedControlToken> getActivitydiagram_tracedControlTokens();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Boolean Variables</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Boolean Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Boolean Variables</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedBooleanVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBooleanVariable> getActivitydiagram_tracedBooleanVariables();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Input Values</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Input Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Input Values</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedInputValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInputValue> getActivitydiagram_tracedInputValues();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Inputs</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedInputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInput> getActivitydiagram_tracedInputs();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Activitys</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Activitys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Activitys</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedActivitys()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivity> getActivitydiagram_tracedActivitys();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Initial Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedInitialNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Initial Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Initial Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedInitialNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInitialNode> getActivitydiagram_tracedInitialNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Traces</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Traces</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedTraces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedTrace> getActivitydiagram_tracedTraces();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Forked Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedForkedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Forked Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Forked Tokens</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedForkedTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedForkedToken> getActivitydiagram_tracedForkedTokens();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Boolean Values</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Boolean Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Boolean Values</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedBooleanValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBooleanValue> getActivitydiagram_tracedBooleanValues();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Decision Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Decision Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Decision Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedDecisionNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedDecisionNode> getActivitydiagram_tracedDecisionNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Activity Final Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Activity Final Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Activity Final Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedActivityFinalNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityFinalNode> getActivitydiagram_tracedActivityFinalNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Control Flows</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedControlFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Control Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Control Flows</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedControlFlows()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedControlFlow> getActivitydiagram_tracedControlFlows();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Join Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedJoinNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Join Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Join Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedJoinNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedJoinNode> getActivitydiagram_tracedJoinNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Merge Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedMergeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Merge Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Merge Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedMergeNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedMergeNode> getActivitydiagram_tracedMergeNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Opaque Actions</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Opaque Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Opaque Actions</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedOpaqueActions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedOpaqueAction> getActivitydiagram_tracedOpaqueActions();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Fork Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedForkNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Fork Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Fork Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedForkNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedForkNode> getActivitydiagram_tracedForkNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Integer Values</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Integer Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Integer Values</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.TracedPackage#getTracedObjects_Activitydiagram_tracedIntegerValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedIntegerValue> getActivitydiagram_tracedIntegerValues();

} // TracedObjects
