/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagram.Expression;
import activitydiagram.OpaqueAction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedOpaqueAction()
 * @model
 * @generated
 */
public interface TracedOpaqueAction extends TracedAction {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedOpaqueAction_Expressions()
	 * @model
	 * @generated
	 */
	EList<Expression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(OpaqueAction)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedOpaqueAction_OriginalObject()
	 * @model
	 * @generated
	 */
	OpaqueAction getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(OpaqueAction value);

} // TracedOpaqueAction
