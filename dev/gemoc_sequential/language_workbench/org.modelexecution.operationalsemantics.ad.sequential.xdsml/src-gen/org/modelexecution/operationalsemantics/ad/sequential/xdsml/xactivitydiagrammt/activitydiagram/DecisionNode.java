/**
 */
package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getDecisionNode()
 * @model
 * @generated
 */
public interface DecisionNode extends ControlNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute(Context c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensMany="true"
	 * @generated
	 */
	void sendOffers1(EList<Token> tokens);

} // DecisionNode
