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
 * A representation of the model object '<em><b>Token holder Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.Token_holder_Value#getHolder <em>Holder</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Token_holder_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Token_holder_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getToken_holder_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Token_holder_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' reference.
	 * @see #setHolder(TracedActivityNode)
	 * @see activitydiagramTrace.Values.ValuesPackage#getToken_holder_Value_Holder()
	 * @model required="true"
	 * @generated
	 */
	TracedActivityNode getHolder();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.Token_holder_Value#getHolder <em>Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(TracedActivityNode value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedToken#getHolderTrace <em>Holder Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedToken)
	 * @see activitydiagramTrace.Values.ValuesPackage#getToken_holder_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedToken#getHolderTrace
	 * @model opposite="holderTrace" required="true" transient="false"
	 * @generated
	 */
	TracedToken getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.Token_holder_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedToken value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getToken_holder_Values <em>Token holder Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getToken_holder_Value_States()
	 * @see activitydiagramTrace.State#getToken_holder_Values
	 * @model opposite="token_holder_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Token_holder_Value
