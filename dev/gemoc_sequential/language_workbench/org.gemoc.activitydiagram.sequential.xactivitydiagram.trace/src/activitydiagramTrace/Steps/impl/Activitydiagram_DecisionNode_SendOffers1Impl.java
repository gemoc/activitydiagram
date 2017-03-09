/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.States.activitydiagram.TracedDecisionNode;

import activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1;
import activitydiagramTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Decision Node Send Offers1</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Activitydiagram_DecisionNode_SendOffers1Impl extends SpecificStepImpl implements Activitydiagram_DecisionNode_SendOffers1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_DecisionNode_SendOffers1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDecisionNode getCaller() {
		return (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) this.getMseoccurrence().getMse().getCaller();
	}

} //Activitydiagram_DecisionNode_SendOffers1Impl
