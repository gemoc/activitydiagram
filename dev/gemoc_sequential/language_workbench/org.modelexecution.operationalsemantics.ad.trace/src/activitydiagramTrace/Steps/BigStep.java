/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.State;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Big Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.BigStep#getStartingState <em>Starting State</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.BigStep#getEndingState <em>Ending State</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getBigStep()
 * @model abstract="true"
 * @generated
 */
public interface BigStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getStartedBigSteps <em>Started Big Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting State</em>' reference.
	 * @see #setStartingState(State)
	 * @see activitydiagramTrace.Steps.StepsPackage#getBigStep_StartingState()
	 * @see activitydiagramTrace.State#getStartedBigSteps
	 * @model opposite="startedBigSteps" required="true"
	 * @generated
	 */
	State getStartingState();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Steps.BigStep#getStartingState <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting State</em>' reference.
	 * @see #getStartingState()
	 * @generated
	 */
	void setStartingState(State value);

	/**
	 * Returns the value of the '<em><b>Ending State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getEndedBigSteps <em>Ended Big Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ending State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending State</em>' reference.
	 * @see #setEndingState(State)
	 * @see activitydiagramTrace.Steps.StepsPackage#getBigStep_EndingState()
	 * @see activitydiagramTrace.State#getEndedBigSteps
	 * @model opposite="endedBigSteps"
	 * @generated
	 */
	State getEndingState();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Steps.BigStep#getEndingState <em>Ending State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending State</em>' reference.
	 * @see #getEndingState()
	 * @generated
	 */
	void setEndingState(State value);

} // BigStep
