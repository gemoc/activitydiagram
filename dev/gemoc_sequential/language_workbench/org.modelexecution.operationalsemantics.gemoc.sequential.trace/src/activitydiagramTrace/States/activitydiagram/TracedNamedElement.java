/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.NamedElement_name_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedNamedElement#getNameSequence <em>Name Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface TracedNamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.NamedElement_name_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.NamedElement_name_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedNamedElement_NameSequence()
	 * @see activitydiagramTrace.States.NamedElement_name_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<NamedElement_name_Value> getNameSequence();

} // TracedNamedElement
