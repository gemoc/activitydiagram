/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagramTrace.Values.IntegerValue_value_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue#getValueTrace <em>Value Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedIntegerValue()
 * @model
 * @generated
 */
public interface TracedIntegerValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Value Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.IntegerValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.IntegerValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedIntegerValue_ValueTrace()
	 * @see activitydiagramTrace.Values.IntegerValue_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegerValue_value_Value> getValueTrace();

} // TracedIntegerValue
