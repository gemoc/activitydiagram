/**
 */
package org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.AcceptEventAction#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage#getAcceptEventAction()
 * @model
 * @generated
 */
public interface AcceptEventAction extends Action {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(SignalEvent)
	 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage#getAcceptEventAction_Trigger()
	 * @model
	 * @generated
	 */
	SignalEvent getTrigger();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.AcceptEventAction#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(SignalEvent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // AcceptEventAction
