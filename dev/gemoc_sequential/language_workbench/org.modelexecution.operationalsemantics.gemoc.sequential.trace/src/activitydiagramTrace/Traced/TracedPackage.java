/**
 */
package activitydiagramTrace.Traced;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.Traced.TracedFactory
 * @model kind="package"
 * @generated
 */
public interface TracedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Traced";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "activitydiagramTrace_Traced";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracedPackage eINSTANCE = activitydiagramTrace.Traced.impl.TracedPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl <em>Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.impl.TracedObjectsImpl
	 * @see activitydiagramTrace.Traced.impl.TracedPackageImpl#getTracedObjects()
	 * @generated
	 */
	int TRACED_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OFFERS = 0;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Integer Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Control Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS = 2;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Boolean Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Input Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUTS = 5;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Activitys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITYS = 6;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Initial Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES = 7;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_TRACES = 8;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Forked Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS = 9;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Decision Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_DECISION_NODES = 11;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Activity Final Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES = 12;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Control Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS = 13;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Join Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_JOIN_NODES = 14;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Merge Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_MERGE_NODES = 15;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Opaque Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS = 16;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Fork Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORK_NODES = 17;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES = 18;

	/**
	 * The number of structural features of the '<em>Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.TracedObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objects</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects
	 * @generated
	 */
	EClass getTracedObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedOffers <em>Activitydiagram traced Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Offers</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedOffers()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedOffers();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedIntegerVariables <em>Activitydiagram traced Integer Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Integer Variables</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedIntegerVariables()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedIntegerVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedControlTokens <em>Activitydiagram traced Control Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Control Tokens</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedControlTokens()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedControlTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedBooleanVariables <em>Activitydiagram traced Boolean Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Boolean Variables</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedBooleanVariables()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedBooleanVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedInputValues <em>Activitydiagram traced Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Input Values</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedInputValues()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedInputValues();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedInputs <em>Activitydiagram traced Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Inputs</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedInputs()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedActivitys <em>Activitydiagram traced Activitys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Activitys</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedActivitys()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedActivitys();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedInitialNodes <em>Activitydiagram traced Initial Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Initial Nodes</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedInitialNodes()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedInitialNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedTraces <em>Activitydiagram traced Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Traces</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedTraces()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedTraces();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedForkedTokens <em>Activitydiagram traced Forked Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Forked Tokens</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedForkedTokens()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedForkedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedBooleanValues <em>Activitydiagram traced Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Boolean Values</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedBooleanValues()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedBooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedDecisionNodes <em>Activitydiagram traced Decision Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Decision Nodes</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedDecisionNodes()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedDecisionNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedActivityFinalNodes <em>Activitydiagram traced Activity Final Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Activity Final Nodes</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedActivityFinalNodes()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedActivityFinalNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedControlFlows <em>Activitydiagram traced Control Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Control Flows</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedControlFlows()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedControlFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedJoinNodes <em>Activitydiagram traced Join Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Join Nodes</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedJoinNodes()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedJoinNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedMergeNodes <em>Activitydiagram traced Merge Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Merge Nodes</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedMergeNodes()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedMergeNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedOpaqueActions <em>Activitydiagram traced Opaque Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Opaque Actions</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedOpaqueActions()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedOpaqueActions();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedForkNodes <em>Activitydiagram traced Fork Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Fork Nodes</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedForkNodes()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedForkNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedIntegerValues <em>Activitydiagram traced Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Integer Values</em>'.
	 * @see activitydiagramTrace.Traced.TracedObjects#getActivitydiagram_tracedIntegerValues()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Activitydiagram_tracedIntegerValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracedFactory getTracedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl <em>Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.impl.TracedObjectsImpl
		 * @see activitydiagramTrace.Traced.impl.TracedPackageImpl#getTracedObjects()
		 * @generated
		 */
		EClass TRACED_OBJECTS = eINSTANCE.getTracedObjects();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OFFERS = eINSTANCE.getTracedObjects_Activitydiagram_tracedOffers();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Integer Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES = eINSTANCE.getTracedObjects_Activitydiagram_tracedIntegerVariables();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Control Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS = eINSTANCE.getTracedObjects_Activitydiagram_tracedControlTokens();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Boolean Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES = eINSTANCE.getTracedObjects_Activitydiagram_tracedBooleanVariables();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Input Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES = eINSTANCE.getTracedObjects_Activitydiagram_tracedInputValues();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUTS = eINSTANCE.getTracedObjects_Activitydiagram_tracedInputs();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Activitys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITYS = eINSTANCE.getTracedObjects_Activitydiagram_tracedActivitys();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Initial Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES = eINSTANCE.getTracedObjects_Activitydiagram_tracedInitialNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_TRACES = eINSTANCE.getTracedObjects_Activitydiagram_tracedTraces();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Forked Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS = eINSTANCE.getTracedObjects_Activitydiagram_tracedForkedTokens();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES = eINSTANCE.getTracedObjects_Activitydiagram_tracedBooleanValues();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Decision Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_DECISION_NODES = eINSTANCE.getTracedObjects_Activitydiagram_tracedDecisionNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Activity Final Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES = eINSTANCE.getTracedObjects_Activitydiagram_tracedActivityFinalNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Control Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS = eINSTANCE.getTracedObjects_Activitydiagram_tracedControlFlows();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Join Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_JOIN_NODES = eINSTANCE.getTracedObjects_Activitydiagram_tracedJoinNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Merge Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_MERGE_NODES = eINSTANCE.getTracedObjects_Activitydiagram_tracedMergeNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Opaque Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS = eINSTANCE.getTracedObjects_Activitydiagram_tracedOpaqueActions();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Fork Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORK_NODES = eINSTANCE.getTracedObjects_Activitydiagram_tracedForkNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES = eINSTANCE.getTracedObjects_Activitydiagram_tracedIntegerValues();

	}

} //TracedPackage
