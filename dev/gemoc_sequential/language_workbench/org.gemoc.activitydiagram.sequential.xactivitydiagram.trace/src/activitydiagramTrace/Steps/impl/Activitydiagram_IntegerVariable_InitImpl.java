/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init;
import activitydiagramTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Integer Variable Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Activitydiagram_IntegerVariable_InitImpl extends SpecificStepImpl implements Activitydiagram_IntegerVariable_Init {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_IntegerVariable_InitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable getCaller() {
		return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) this.getMseoccurrence().getMse().getCaller();
	}

} //Activitydiagram_IntegerVariable_InitImpl
