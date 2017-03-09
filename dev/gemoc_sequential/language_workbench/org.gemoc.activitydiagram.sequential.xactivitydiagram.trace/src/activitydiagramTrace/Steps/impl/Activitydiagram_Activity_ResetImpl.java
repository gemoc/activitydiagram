/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.States.activitydiagram.TracedActivity;

import activitydiagramTrace.Steps.Activitydiagram_Activity_Reset;
import activitydiagramTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Activity Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Activitydiagram_Activity_ResetImpl extends SpecificStepImpl implements Activitydiagram_Activity_Reset {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_Activity_ResetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_ACTIVITY_RESET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivity getCaller() {
		return (activitydiagramTrace.States.activitydiagram.TracedActivity) this.getMseoccurrence().getMse().getCaller();
	}

} //Activitydiagram_Activity_ResetImpl
