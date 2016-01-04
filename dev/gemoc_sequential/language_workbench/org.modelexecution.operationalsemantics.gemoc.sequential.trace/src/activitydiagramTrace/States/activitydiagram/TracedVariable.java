/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.Variable_currentValue_Value;
import activitydiagramTrace.States.Variable_initialValue_Value;
import activitydiagramTrace.States.Variable_name_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedVariable#getCurrentValueSequence <em>Current Value Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedVariable#getInitialValueSequence <em>Initial Value Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedVariable#getNameSequence <em>Name Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedVariable()
 * @model abstract="true"
 * @generated
 */
public interface TracedVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Variable_currentValue_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Variable_currentValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedVariable_CurrentValueSequence()
	 * @see activitydiagramTrace.States.Variable_currentValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Variable_currentValue_Value> getCurrentValueSequence();

	/**
	 * Returns the value of the '<em><b>Initial Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Variable_initialValue_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Variable_initialValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedVariable_InitialValueSequence()
	 * @see activitydiagramTrace.States.Variable_initialValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Variable_initialValue_Value> getInitialValueSequence();

	/**
	 * Returns the value of the '<em><b>Name Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Variable_name_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Variable_name_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedVariable_NameSequence()
	 * @see activitydiagramTrace.States.Variable_name_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Variable_name_Value> getNameSequence();

} // TracedVariable
