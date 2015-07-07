/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagramTrace.Values.ForkedToken_baseToken_Value;
import activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Forked Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedForkedToken#getRemainingOffersCountTrace <em>Remaining Offers Count Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedForkedToken#getBaseTokenTrace <em>Base Token Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedForkedToken()
 * @model
 * @generated
 */
public interface TracedForkedToken extends TracedToken {
	/**
	 * Returns the value of the '<em><b>Remaining Offers Count Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Offers Count Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Offers Count Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_RemainingOffersCountTrace()
	 * @see activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ForkedToken_remainingOffersCount_Value> getRemainingOffersCountTrace();

	/**
	 * Returns the value of the '<em><b>Base Token Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.ForkedToken_baseToken_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.ForkedToken_baseToken_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_BaseTokenTrace()
	 * @see activitydiagramTrace.Values.ForkedToken_baseToken_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ForkedToken_baseToken_Value> getBaseTokenTrace();

} // TracedForkedToken
