/**
 */
package activitydiagramTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = activitydiagramTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activitydiagram Activity Node Add Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Activity Node Add Token</em>'.
	 * @generated
	 */
	Activitydiagram_ActivityNode_AddToken createActivitydiagram_ActivityNode_AddToken();

	/**
	 * Returns a new object of class '<em>Activitydiagram Activity Node Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Activity Node Execute</em>'.
	 * @generated
	 */
	Activitydiagram_ActivityNode_Execute createActivitydiagram_ActivityNode_Execute();

	/**
	 * Returns a new object of class '<em>Activitydiagram Activity Node Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Activity Node Execute Implicit Step</em>'.
	 * @generated
	 */
	Activitydiagram_ActivityNode_Execute_ImplicitStep createActivitydiagram_ActivityNode_Execute_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Activitydiagram Activity Node Remove Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Activity Node Remove Token</em>'.
	 * @generated
	 */
	Activitydiagram_ActivityNode_RemoveToken createActivitydiagram_ActivityNode_RemoveToken();

	/**
	 * Returns a new object of class '<em>Activitydiagram Activity Node Terminate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Activity Node Terminate</em>'.
	 * @generated
	 */
	Activitydiagram_ActivityNode_Terminate createActivitydiagram_ActivityNode_Terminate();

	/**
	 * Returns a new object of class '<em>Activitydiagram Activity Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Activity Execute</em>'.
	 * @generated
	 */
	Activitydiagram_Activity_Execute createActivitydiagram_Activity_Execute();

	/**
	 * Returns a new object of class '<em>Activitydiagram Activity Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Activity Execute Implicit Step</em>'.
	 * @generated
	 */
	Activitydiagram_Activity_Execute_ImplicitStep createActivitydiagram_Activity_Execute_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Activitydiagram Boolean Variable Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Boolean Variable Init</em>'.
	 * @generated
	 */
	Activitydiagram_BooleanVariable_Init createActivitydiagram_BooleanVariable_Init();

	/**
	 * Returns a new object of class '<em>Activitydiagram Integer Variable Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Integer Variable Init</em>'.
	 * @generated
	 */
	Activitydiagram_IntegerVariable_Init createActivitydiagram_IntegerVariable_Init();

	/**
	 * Returns a new object of class '<em>Activitydiagram Variable Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activitydiagram Variable Init</em>'.
	 * @generated
	 */
	Activitydiagram_Variable_Init createActivitydiagram_Variable_Init();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns a new object of class '<em>Specific Root Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Root Step</em>'.
	 * @generated
	 */
	SpecificRootStep createSpecificRootStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
