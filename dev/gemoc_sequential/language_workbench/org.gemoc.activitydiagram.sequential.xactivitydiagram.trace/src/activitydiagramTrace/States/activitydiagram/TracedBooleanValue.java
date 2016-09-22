/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.BooleanValue_value_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanValue#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanValue()
 * @model
 * @generated
 */
public interface TracedBooleanValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanValue_ValueSequence()
	 * @see activitydiagramTrace.States.BooleanValue_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanValue_value_Value> getValueSequence();

} // TracedBooleanValue
