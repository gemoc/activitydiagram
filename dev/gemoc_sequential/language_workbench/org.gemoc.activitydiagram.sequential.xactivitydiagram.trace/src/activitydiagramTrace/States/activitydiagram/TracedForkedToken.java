/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.ForkedToken_baseToken_Dimension;
import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Forked Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getForkedToken_baseToken_Dimension <em>Forked Token base Token Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getForkedToken_remainingOffersCount_Dimension <em>Forked Token remaining Offers Count Dimension</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken()
 * @model
 * @generated
 */
public interface TracedForkedToken extends TracedToken {
	/**
	 * Returns the value of the '<em><b>Forked Token base Token Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Token base Token Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Token base Token Dimension</em>' containment reference.
	 * @see #setForkedToken_baseToken_Dimension(ForkedToken_baseToken_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_ForkedToken_baseToken_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	ForkedToken_baseToken_Dimension getForkedToken_baseToken_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getForkedToken_baseToken_Dimension <em>Forked Token base Token Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forked Token base Token Dimension</em>' containment reference.
	 * @see #getForkedToken_baseToken_Dimension()
	 * @generated
	 */
	void setForkedToken_baseToken_Dimension(ForkedToken_baseToken_Dimension value);

	/**
	 * Returns the value of the '<em><b>Forked Token remaining Offers Count Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Token remaining Offers Count Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Token remaining Offers Count Dimension</em>' containment reference.
	 * @see #setForkedToken_remainingOffersCount_Dimension(ForkedToken_remainingOffersCount_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_ForkedToken_remainingOffersCount_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	ForkedToken_remainingOffersCount_Dimension getForkedToken_remainingOffersCount_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getForkedToken_remainingOffersCount_Dimension <em>Forked Token remaining Offers Count Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forked Token remaining Offers Count Dimension</em>' containment reference.
	 * @see #getForkedToken_remainingOffersCount_Dimension()
	 * @generated
	 */
	void setForkedToken_remainingOffersCount_Dimension(ForkedToken_remainingOffersCount_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getForkedToken_baseToken_Dimension());\nresult.add(getForkedToken_remainingOffersCount_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedForkedToken
