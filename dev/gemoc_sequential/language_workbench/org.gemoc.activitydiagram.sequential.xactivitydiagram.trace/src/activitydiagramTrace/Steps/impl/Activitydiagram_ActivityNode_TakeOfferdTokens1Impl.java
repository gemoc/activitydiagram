/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1;
import activitydiagramTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Activity Node Take Offerd Tokens1</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Activitydiagram_ActivityNode_TakeOfferdTokens1Impl extends SpecificStepImpl implements Activitydiagram_ActivityNode_TakeOfferdTokens1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_ActivityNode_TakeOfferdTokens1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode getCaller() {
		return (activitydiagramTrace.States.activitydiagram.TracedActivityNode) this.getMseoccurrence().getMse().getCaller();
	}

} //Activitydiagram_ActivityNode_TakeOfferdTokens1Impl
