/**
 */
package org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token#getHolder <em>Holder</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' reference.
	 * @see #setHolder(ActivityNode)
	 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage#getToken_Holder()
	 * @model
	 * @generated
	 */
	ActivityNode getHolder();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token#getHolder <em>Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(ActivityNode value);

} // Token
