/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedExpression;
import activitydiagramTrace.States.activitydiagram.TracedOpaqueAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action expressions Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.OpaqueAction_expressions_Value#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link activitydiagramTrace.States.OpaqueAction_expressions_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.OpaqueAction_expressions_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getOpaqueAction_expressions_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface OpaqueAction_expressions_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getOpaqueAction_expressions_Value_Expressions()
	 * @model
	 * @generated
	 */
	EList<TracedExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedOpaqueAction#getExpressionsSequence <em>Expressions Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedOpaqueAction)
	 * @see activitydiagramTrace.States.StatesPackage#getOpaqueAction_expressions_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedOpaqueAction#getExpressionsSequence
	 * @model opposite="expressionsSequence" required="true" transient="false"
	 * @generated
	 */
	TracedOpaqueAction getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.OpaqueAction_expressions_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedOpaqueAction value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getOpaqueAction_expressions_Values <em>Opaque Action expressions Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getOpaqueAction_expressions_Value_States()
	 * @see activitydiagramTrace.States.State#getOpaqueAction_expressions_Values
	 * @model opposite="opaqueAction_expressions_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // OpaqueAction_expressions_Value
