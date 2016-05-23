/**
 */
package org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Activity#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Activity#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Activity#getLocals <em>Locals</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Activity#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Activity#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Nodes()
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivityNode#getActivity
	 * @model opposite="activity" containment="true"
	 * @generated
	 */
	EList<ActivityNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Locals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getLocals();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference.
	 * @see #setTrace(Trace)
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Trace()
	 * @model containment="true"
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Activity#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

} // Activity
