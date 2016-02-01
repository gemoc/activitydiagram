/**
 */
package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.OpaqueAction#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getOpaqueAction()
 * @model
 * @generated
 */
public interface OpaqueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getOpaqueAction_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // OpaqueAction
