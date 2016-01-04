/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedNamedElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element name Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.NamedElement_name_Value#getName <em>Name</em>}</li>
 *   <li>{@link activitydiagramTrace.States.NamedElement_name_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.NamedElement_name_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getNamedElement_name_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface NamedElement_name_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see activitydiagramTrace.States.StatesPackage#getNamedElement_name_Value_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.NamedElement_name_Value#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedNamedElement#getNameSequence <em>Name Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedNamedElement)
	 * @see activitydiagramTrace.States.StatesPackage#getNamedElement_name_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedNamedElement#getNameSequence
	 * @model opposite="nameSequence" required="true" transient="false"
	 * @generated
	 */
	TracedNamedElement getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.NamedElement_name_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedNamedElement value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getNamedElement_name_Values <em>Named Element name Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getNamedElement_name_Value_States()
	 * @see activitydiagramTrace.States.State#getNamedElement_name_Values
	 * @model opposite="namedElement_name_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // NamedElement_name_Value
