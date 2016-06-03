/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.Token_holder_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedToken#getHolderSequence <em>Holder Sequence</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedToken()
 * @model abstract="true"
 * @generated
 */
public interface TracedToken extends EObject {
	/**
	 * Returns the value of the '<em><b>Holder Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Token_holder_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Token_holder_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedToken_HolderSequence()
	 * @see activitydiagramTrace.States.Token_holder_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Token_holder_Value> getHolderSequence();

} // TracedToken
