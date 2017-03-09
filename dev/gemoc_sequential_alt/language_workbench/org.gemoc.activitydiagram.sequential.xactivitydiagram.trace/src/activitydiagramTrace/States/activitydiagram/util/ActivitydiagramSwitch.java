/**
 */
package activitydiagramTrace.States.activitydiagram.util;

import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificTracedObject;
import activitydiagramTrace.States.SpecificValue;

import activitydiagramTrace.States.activitydiagram.*;

import fr.inria.diverse.trace.commons.model.trace.Dimension;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage
 * @generated
 */
public class ActivitydiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivitydiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = ActivitydiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ActivitydiagramPackage.TRACED_ACTION: {
				TracedAction tracedAction = (TracedAction)theEObject;
				T result = caseTracedAction(tracedAction);
				if (result == null) result = caseTracedActivityNode(tracedAction);
				if (result == null) result = caseTracedNamedElement(tracedAction);
				if (result == null) result = caseSpecificTracedObject(tracedAction);
				if (result == null) result = caseTracedObject(tracedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_ACTIVITY: {
				TracedActivity tracedActivity = (TracedActivity)theEObject;
				T result = caseTracedActivity(tracedActivity);
				if (result == null) result = caseTracedNamedElement(tracedActivity);
				if (result == null) result = caseSpecificTracedObject(tracedActivity);
				if (result == null) result = caseTracedObject(tracedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE: {
				TracedActivityEdge tracedActivityEdge = (TracedActivityEdge)theEObject;
				T result = caseTracedActivityEdge(tracedActivityEdge);
				if (result == null) result = caseTracedNamedElement(tracedActivityEdge);
				if (result == null) result = caseSpecificTracedObject(tracedActivityEdge);
				if (result == null) result = caseTracedObject(tracedActivityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_ACTIVITY_FINAL_NODE: {
				TracedActivityFinalNode tracedActivityFinalNode = (TracedActivityFinalNode)theEObject;
				T result = caseTracedActivityFinalNode(tracedActivityFinalNode);
				if (result == null) result = caseTracedFinalNode(tracedActivityFinalNode);
				if (result == null) result = caseTracedControlNode(tracedActivityFinalNode);
				if (result == null) result = caseTracedActivityNode(tracedActivityFinalNode);
				if (result == null) result = caseTracedNamedElement(tracedActivityFinalNode);
				if (result == null) result = caseSpecificTracedObject(tracedActivityFinalNode);
				if (result == null) result = caseTracedObject(tracedActivityFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE: {
				TracedActivityNode tracedActivityNode = (TracedActivityNode)theEObject;
				T result = caseTracedActivityNode(tracedActivityNode);
				if (result == null) result = caseTracedNamedElement(tracedActivityNode);
				if (result == null) result = caseSpecificTracedObject(tracedActivityNode);
				if (result == null) result = caseTracedObject(tracedActivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION: {
				TracedBooleanBinaryExpression tracedBooleanBinaryExpression = (TracedBooleanBinaryExpression)theEObject;
				T result = caseTracedBooleanBinaryExpression(tracedBooleanBinaryExpression);
				if (result == null) result = caseTracedBooleanExpression(tracedBooleanBinaryExpression);
				if (result == null) result = caseTracedExpression(tracedBooleanBinaryExpression);
				if (result == null) result = caseSpecificTracedObject(tracedBooleanBinaryExpression);
				if (result == null) result = caseTracedObject(tracedBooleanBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_BOOLEAN_EXPRESSION: {
				TracedBooleanExpression tracedBooleanExpression = (TracedBooleanExpression)theEObject;
				T result = caseTracedBooleanExpression(tracedBooleanExpression);
				if (result == null) result = caseTracedExpression(tracedBooleanExpression);
				if (result == null) result = caseSpecificTracedObject(tracedBooleanExpression);
				if (result == null) result = caseTracedObject(tracedBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION: {
				TracedBooleanUnaryExpression tracedBooleanUnaryExpression = (TracedBooleanUnaryExpression)theEObject;
				T result = caseTracedBooleanUnaryExpression(tracedBooleanUnaryExpression);
				if (result == null) result = caseTracedBooleanExpression(tracedBooleanUnaryExpression);
				if (result == null) result = caseTracedExpression(tracedBooleanUnaryExpression);
				if (result == null) result = caseSpecificTracedObject(tracedBooleanUnaryExpression);
				if (result == null) result = caseTracedObject(tracedBooleanUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_BOOLEAN_VALUE: {
				TracedBooleanValue tracedBooleanValue = (TracedBooleanValue)theEObject;
				T result = caseTracedBooleanValue(tracedBooleanValue);
				if (result == null) result = caseTracedValue(tracedBooleanValue);
				if (result == null) result = caseTracedBooleanExpression(tracedBooleanValue);
				if (result == null) result = caseTracedExpression(tracedBooleanValue);
				if (result == null) result = caseSpecificTracedObject(tracedBooleanValue);
				if (result == null) result = caseTracedObject(tracedBooleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE: {
				TracedBooleanVariable tracedBooleanVariable = (TracedBooleanVariable)theEObject;
				T result = caseTracedBooleanVariable(tracedBooleanVariable);
				if (result == null) result = caseTracedVariable(tracedBooleanVariable);
				if (result == null) result = caseTracedBooleanExpression(tracedBooleanVariable);
				if (result == null) result = caseTracedExpression(tracedBooleanVariable);
				if (result == null) result = caseSpecificTracedObject(tracedBooleanVariable);
				if (result == null) result = caseTracedObject(tracedBooleanVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_CONTROL_FLOW: {
				TracedControlFlow tracedControlFlow = (TracedControlFlow)theEObject;
				T result = caseTracedControlFlow(tracedControlFlow);
				if (result == null) result = caseTracedActivityEdge(tracedControlFlow);
				if (result == null) result = caseTracedNamedElement(tracedControlFlow);
				if (result == null) result = caseSpecificTracedObject(tracedControlFlow);
				if (result == null) result = caseTracedObject(tracedControlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_CONTROL_NODE: {
				TracedControlNode tracedControlNode = (TracedControlNode)theEObject;
				T result = caseTracedControlNode(tracedControlNode);
				if (result == null) result = caseTracedActivityNode(tracedControlNode);
				if (result == null) result = caseTracedNamedElement(tracedControlNode);
				if (result == null) result = caseSpecificTracedObject(tracedControlNode);
				if (result == null) result = caseTracedObject(tracedControlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_CONTROL_TOKEN: {
				TracedControlToken tracedControlToken = (TracedControlToken)theEObject;
				T result = caseTracedControlToken(tracedControlToken);
				if (result == null) result = caseSpecificTracedObject(tracedControlToken);
				if (result == null) result = caseTracedObject(tracedControlToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_DECISION_NODE: {
				TracedDecisionNode tracedDecisionNode = (TracedDecisionNode)theEObject;
				T result = caseTracedDecisionNode(tracedDecisionNode);
				if (result == null) result = caseTracedControlNode(tracedDecisionNode);
				if (result == null) result = caseTracedActivityNode(tracedDecisionNode);
				if (result == null) result = caseTracedNamedElement(tracedDecisionNode);
				if (result == null) result = caseSpecificTracedObject(tracedDecisionNode);
				if (result == null) result = caseTracedObject(tracedDecisionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_EXPRESSION: {
				TracedExpression tracedExpression = (TracedExpression)theEObject;
				T result = caseTracedExpression(tracedExpression);
				if (result == null) result = caseSpecificTracedObject(tracedExpression);
				if (result == null) result = caseTracedObject(tracedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_FINAL_NODE: {
				TracedFinalNode tracedFinalNode = (TracedFinalNode)theEObject;
				T result = caseTracedFinalNode(tracedFinalNode);
				if (result == null) result = caseTracedControlNode(tracedFinalNode);
				if (result == null) result = caseTracedActivityNode(tracedFinalNode);
				if (result == null) result = caseTracedNamedElement(tracedFinalNode);
				if (result == null) result = caseSpecificTracedObject(tracedFinalNode);
				if (result == null) result = caseTracedObject(tracedFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_FLOW_FINAL_NODE: {
				TracedFlowFinalNode tracedFlowFinalNode = (TracedFlowFinalNode)theEObject;
				T result = caseTracedFlowFinalNode(tracedFlowFinalNode);
				if (result == null) result = caseTracedFinalNode(tracedFlowFinalNode);
				if (result == null) result = caseTracedControlNode(tracedFlowFinalNode);
				if (result == null) result = caseTracedActivityNode(tracedFlowFinalNode);
				if (result == null) result = caseTracedNamedElement(tracedFlowFinalNode);
				if (result == null) result = caseSpecificTracedObject(tracedFlowFinalNode);
				if (result == null) result = caseTracedObject(tracedFlowFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_FORK_NODE: {
				TracedForkNode tracedForkNode = (TracedForkNode)theEObject;
				T result = caseTracedForkNode(tracedForkNode);
				if (result == null) result = caseTracedControlNode(tracedForkNode);
				if (result == null) result = caseTracedActivityNode(tracedForkNode);
				if (result == null) result = caseTracedNamedElement(tracedForkNode);
				if (result == null) result = caseSpecificTracedObject(tracedForkNode);
				if (result == null) result = caseTracedObject(tracedForkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_INITIAL_NODE: {
				TracedInitialNode tracedInitialNode = (TracedInitialNode)theEObject;
				T result = caseTracedInitialNode(tracedInitialNode);
				if (result == null) result = caseTracedControlNode(tracedInitialNode);
				if (result == null) result = caseTracedActivityNode(tracedInitialNode);
				if (result == null) result = caseTracedNamedElement(tracedInitialNode);
				if (result == null) result = caseSpecificTracedObject(tracedInitialNode);
				if (result == null) result = caseTracedObject(tracedInitialNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_INTEGER_BINARY_EXPRESSION: {
				TracedIntegerBinaryExpression tracedIntegerBinaryExpression = (TracedIntegerBinaryExpression)theEObject;
				T result = caseTracedIntegerBinaryExpression(tracedIntegerBinaryExpression);
				if (result == null) result = caseTracedIntegerExpression(tracedIntegerBinaryExpression);
				if (result == null) result = caseTracedExpression(tracedIntegerBinaryExpression);
				if (result == null) result = caseSpecificTracedObject(tracedIntegerBinaryExpression);
				if (result == null) result = caseTracedObject(tracedIntegerBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_INTEGER_COMPARISON_EXPRESSION: {
				TracedIntegerComparisonExpression tracedIntegerComparisonExpression = (TracedIntegerComparisonExpression)theEObject;
				T result = caseTracedIntegerComparisonExpression(tracedIntegerComparisonExpression);
				if (result == null) result = caseTracedBooleanExpression(tracedIntegerComparisonExpression);
				if (result == null) result = caseTracedExpression(tracedIntegerComparisonExpression);
				if (result == null) result = caseSpecificTracedObject(tracedIntegerComparisonExpression);
				if (result == null) result = caseTracedObject(tracedIntegerComparisonExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_INTEGER_EXPRESSION: {
				TracedIntegerExpression tracedIntegerExpression = (TracedIntegerExpression)theEObject;
				T result = caseTracedIntegerExpression(tracedIntegerExpression);
				if (result == null) result = caseTracedExpression(tracedIntegerExpression);
				if (result == null) result = caseSpecificTracedObject(tracedIntegerExpression);
				if (result == null) result = caseTracedObject(tracedIntegerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_INTEGER_VALUE: {
				TracedIntegerValue tracedIntegerValue = (TracedIntegerValue)theEObject;
				T result = caseTracedIntegerValue(tracedIntegerValue);
				if (result == null) result = caseTracedValue(tracedIntegerValue);
				if (result == null) result = caseTracedIntegerExpression(tracedIntegerValue);
				if (result == null) result = caseTracedExpression(tracedIntegerValue);
				if (result == null) result = caseSpecificTracedObject(tracedIntegerValue);
				if (result == null) result = caseTracedObject(tracedIntegerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE: {
				TracedIntegerVariable tracedIntegerVariable = (TracedIntegerVariable)theEObject;
				T result = caseTracedIntegerVariable(tracedIntegerVariable);
				if (result == null) result = caseTracedVariable(tracedIntegerVariable);
				if (result == null) result = caseTracedIntegerExpression(tracedIntegerVariable);
				if (result == null) result = caseTracedExpression(tracedIntegerVariable);
				if (result == null) result = caseSpecificTracedObject(tracedIntegerVariable);
				if (result == null) result = caseTracedObject(tracedIntegerVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_JOIN_NODE: {
				TracedJoinNode tracedJoinNode = (TracedJoinNode)theEObject;
				T result = caseTracedJoinNode(tracedJoinNode);
				if (result == null) result = caseTracedControlNode(tracedJoinNode);
				if (result == null) result = caseTracedActivityNode(tracedJoinNode);
				if (result == null) result = caseTracedNamedElement(tracedJoinNode);
				if (result == null) result = caseSpecificTracedObject(tracedJoinNode);
				if (result == null) result = caseTracedObject(tracedJoinNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_MERGE_NODE: {
				TracedMergeNode tracedMergeNode = (TracedMergeNode)theEObject;
				T result = caseTracedMergeNode(tracedMergeNode);
				if (result == null) result = caseTracedControlNode(tracedMergeNode);
				if (result == null) result = caseTracedActivityNode(tracedMergeNode);
				if (result == null) result = caseTracedNamedElement(tracedMergeNode);
				if (result == null) result = caseSpecificTracedObject(tracedMergeNode);
				if (result == null) result = caseTracedObject(tracedMergeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_NAMED_ELEMENT: {
				TracedNamedElement tracedNamedElement = (TracedNamedElement)theEObject;
				T result = caseTracedNamedElement(tracedNamedElement);
				if (result == null) result = caseSpecificTracedObject(tracedNamedElement);
				if (result == null) result = caseTracedObject(tracedNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_OFFER: {
				TracedOffer tracedOffer = (TracedOffer)theEObject;
				T result = caseTracedOffer(tracedOffer);
				if (result == null) result = caseSpecificTracedObject(tracedOffer);
				if (result == null) result = caseTracedObject(tracedOffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_OPAQUE_ACTION: {
				TracedOpaqueAction tracedOpaqueAction = (TracedOpaqueAction)theEObject;
				T result = caseTracedOpaqueAction(tracedOpaqueAction);
				if (result == null) result = caseTracedAction(tracedOpaqueAction);
				if (result == null) result = caseTracedActivityNode(tracedOpaqueAction);
				if (result == null) result = caseTracedNamedElement(tracedOpaqueAction);
				if (result == null) result = caseSpecificTracedObject(tracedOpaqueAction);
				if (result == null) result = caseTracedObject(tracedOpaqueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_VALUE: {
				TracedValue tracedValue = (TracedValue)theEObject;
				T result = caseTracedValue(tracedValue);
				if (result == null) result = caseTracedExpression(tracedValue);
				if (result == null) result = caseSpecificTracedObject(tracedValue);
				if (result == null) result = caseTracedObject(tracedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitydiagramPackage.TRACED_VARIABLE: {
				TracedVariable tracedVariable = (TracedVariable)theEObject;
				T result = caseTracedVariable(tracedVariable);
				if (result == null) result = caseTracedExpression(tracedVariable);
				if (result == null) result = caseSpecificTracedObject(tracedVariable);
				if (result == null) result = caseTracedObject(tracedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAction(TracedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivity(TracedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityEdge(TracedActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityFinalNode(TracedActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedActivityNode(TracedActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanBinaryExpression(TracedBooleanBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanExpression(TracedBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanUnaryExpression(TracedBooleanUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanValue(TracedBooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanVariable(TracedBooleanVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedControlFlow(TracedControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedControlNode(TracedControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Control Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Control Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedControlToken(TracedControlToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDecisionNode(TracedDecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExpression(TracedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedFinalNode(TracedFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Flow Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedFlowFinalNode(TracedFlowFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedForkNode(TracedForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInitialNode(TracedInitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerBinaryExpression(TracedIntegerBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Comparison Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerComparisonExpression(TracedIntegerComparisonExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerExpression(TracedIntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerValue(TracedIntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerVariable(TracedIntegerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedJoinNode(TracedJoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMergeNode(TracedMergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedNamedElement(TracedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOffer(TracedOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Opaque Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOpaqueAction(TracedOpaqueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedValue(TracedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVariable(TracedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <DimensionSubType extends Dimension<?>> T caseTracedObject(TracedObject<DimensionSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <DimensionSubType extends SpecificDimension<? extends SpecificValue>> T caseSpecificTracedObject(SpecificTracedObject<DimensionSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ActivitydiagramSwitch
