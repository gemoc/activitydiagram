/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.IntegerValue_value_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedIntegerValue#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerValue()
 * @model
 * @generated
 */
public interface TracedIntegerValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerValue_ValueSequence()
	 * @see activitydiagramTrace.States.IntegerValue_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegerValue_value_Value> getValueSequence();

} // TracedIntegerValue
