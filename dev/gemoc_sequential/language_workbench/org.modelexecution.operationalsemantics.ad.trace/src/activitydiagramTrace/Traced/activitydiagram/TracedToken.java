/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagramTrace.Values.Token_holder_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedToken#getHolderTrace <em>Holder Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedToken()
 * @model abstract="true"
 * @generated
 */
public interface TracedToken extends EObject {
	/**
	 * Returns the value of the '<em><b>Holder Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Token_holder_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Token_holder_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedToken_HolderTrace()
	 * @see activitydiagramTrace.Values.Token_holder_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Token_holder_Value> getHolderTrace();

} // TracedToken
