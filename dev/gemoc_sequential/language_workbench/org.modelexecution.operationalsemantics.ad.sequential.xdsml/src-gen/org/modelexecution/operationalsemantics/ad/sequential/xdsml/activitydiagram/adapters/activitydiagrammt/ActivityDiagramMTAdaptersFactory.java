package org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt;

import activitydiagram.Action;
import activitydiagram.Activity;
import activitydiagram.ActivityEdge;
import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivityNode;
import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanExpression;
import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.ControlFlow;
import activitydiagram.ControlNode;
import activitydiagram.ControlToken;
import activitydiagram.DecisionNode;
import activitydiagram.ExecutableNode;
import activitydiagram.Expression;
import activitydiagram.FinalNode;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.InitialNode;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerExpression;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.NamedElement;
import activitydiagram.Offer;
import activitydiagram.OpaqueAction;
import activitydiagram.Token;
import activitydiagram.Trace;
import activitydiagram.Value;
import activitydiagram.Variable;
import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActionAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityEdgeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityFinalNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanExpressionAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanValueAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanVariableAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlFlowAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlTokenAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.DecisionNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ExecutableNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ExpressionAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.FinalNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ForkNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ForkedTokenAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InitialNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InputAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InputValueAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerCalculationExpressionAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerExpressionAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerValueAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.JoinNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.MergeNodeAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.NamedElementAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.OfferAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.OpaqueActionAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.TokenAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.TraceAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ValueAdapter;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.VariableAdapter;

@SuppressWarnings("all")
public class ActivityDiagramMTAdaptersFactory implements AdaptersFactory {
  private static ActivityDiagramMTAdaptersFactory instance;
  
  public static ActivityDiagramMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ActivityDiagramMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof activitydiagram.Activity){
    	return createActivityAdapter((activitydiagram.Activity) o, res);
    }
    if (o instanceof activitydiagram.ControlFlow){
    	return createControlFlowAdapter((activitydiagram.ControlFlow) o, res);
    }
    if (o instanceof activitydiagram.OpaqueAction){
    	return createOpaqueActionAdapter((activitydiagram.OpaqueAction) o, res);
    }
    if (o instanceof activitydiagram.InitialNode){
    	return createInitialNodeAdapter((activitydiagram.InitialNode) o, res);
    }
    if (o instanceof activitydiagram.ActivityFinalNode){
    	return createActivityFinalNodeAdapter((activitydiagram.ActivityFinalNode) o, res);
    }
    if (o instanceof activitydiagram.ForkNode){
    	return createForkNodeAdapter((activitydiagram.ForkNode) o, res);
    }
    if (o instanceof activitydiagram.JoinNode){
    	return createJoinNodeAdapter((activitydiagram.JoinNode) o, res);
    }
    if (o instanceof activitydiagram.MergeNode){
    	return createMergeNodeAdapter((activitydiagram.MergeNode) o, res);
    }
    if (o instanceof activitydiagram.DecisionNode){
    	return createDecisionNodeAdapter((activitydiagram.DecisionNode) o, res);
    }
    if (o instanceof activitydiagram.IntegerVariable){
    	return createIntegerVariableAdapter((activitydiagram.IntegerVariable) o, res);
    }
    if (o instanceof activitydiagram.BooleanVariable){
    	return createBooleanVariableAdapter((activitydiagram.BooleanVariable) o, res);
    }
    if (o instanceof activitydiagram.BooleanValue){
    	return createBooleanValueAdapter((activitydiagram.BooleanValue) o, res);
    }
    if (o instanceof activitydiagram.IntegerValue){
    	return createIntegerValueAdapter((activitydiagram.IntegerValue) o, res);
    }
    if (o instanceof activitydiagram.IntegerCalculationExpression){
    	return createIntegerCalculationExpressionAdapter((activitydiagram.IntegerCalculationExpression) o, res);
    }
    if (o instanceof activitydiagram.IntegerComparisonExpression){
    	return createIntegerComparisonExpressionAdapter((activitydiagram.IntegerComparisonExpression) o, res);
    }
    if (o instanceof activitydiagram.BooleanUnaryExpression){
    	return createBooleanUnaryExpressionAdapter((activitydiagram.BooleanUnaryExpression) o, res);
    }
    if (o instanceof activitydiagram.BooleanBinaryExpression){
    	return createBooleanBinaryExpressionAdapter((activitydiagram.BooleanBinaryExpression) o, res);
    }
    if (o instanceof activitydiagram.Offer){
    	return createOfferAdapter((activitydiagram.Offer) o, res);
    }
    if (o instanceof activitydiagram.Trace){
    	return createTraceAdapter((activitydiagram.Trace) o, res);
    }
    if (o instanceof activitydiagram.InputValue){
    	return createInputValueAdapter((activitydiagram.InputValue) o, res);
    }
    if (o instanceof activitydiagram.Input){
    	return createInputAdapter((activitydiagram.Input) o, res);
    }
    if (o instanceof activitydiagram.ControlToken){
    	return createControlTokenAdapter((activitydiagram.ControlToken) o, res);
    }
    if (o instanceof activitydiagram.ForkedToken){
    	return createForkedTokenAdapter((activitydiagram.ForkedToken) o, res);
    }
    
    return null;
  }
  
  public ActivityAdapter createActivityAdapter(final Activity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityAdapter) adapter;
    }
  }
  
  public ActivityNodeAdapter createActivityNodeAdapter(final ActivityNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityNodeAdapter) adapter;
    }
  }
  
  public ActivityEdgeAdapter createActivityEdgeAdapter(final ActivityEdge adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityEdgeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityEdgeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityEdgeAdapter) adapter;
    }
  }
  
  public ControlFlowAdapter createControlFlowAdapter(final ControlFlow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlFlowAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlFlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlFlowAdapter) adapter;
    }
  }
  
  public ControlNodeAdapter createControlNodeAdapter(final ControlNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlNodeAdapter) adapter;
    }
  }
  
  public ExecutableNodeAdapter createExecutableNodeAdapter(final ExecutableNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ExecutableNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ExecutableNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ExecutableNodeAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActionAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActionAdapter) adapter;
    }
  }
  
  public OpaqueActionAdapter createOpaqueActionAdapter(final OpaqueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.OpaqueActionAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.OpaqueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.OpaqueActionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.NamedElementAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.NamedElementAdapter) adapter;
    }
  }
  
  public InitialNodeAdapter createInitialNodeAdapter(final InitialNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InitialNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InitialNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InitialNodeAdapter) adapter;
    }
  }
  
  public FinalNodeAdapter createFinalNodeAdapter(final FinalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.FinalNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.FinalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.FinalNodeAdapter) adapter;
    }
  }
  
  public ActivityFinalNodeAdapter createActivityFinalNodeAdapter(final ActivityFinalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityFinalNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityFinalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityFinalNodeAdapter) adapter;
    }
  }
  
  public ForkNodeAdapter createForkNodeAdapter(final ForkNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ForkNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ForkNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ForkNodeAdapter) adapter;
    }
  }
  
  public JoinNodeAdapter createJoinNodeAdapter(final JoinNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.JoinNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.JoinNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.JoinNodeAdapter) adapter;
    }
  }
  
  public MergeNodeAdapter createMergeNodeAdapter(final MergeNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.MergeNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.MergeNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.MergeNodeAdapter) adapter;
    }
  }
  
  public DecisionNodeAdapter createDecisionNodeAdapter(final DecisionNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.DecisionNodeAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.DecisionNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.DecisionNodeAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.VariableAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.VariableAdapter) adapter;
    }
  }
  
  public IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter) adapter;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanVariableAdapter) adapter;
    }
  }
  
  public ValueAdapter createValueAdapter(final Value adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ValueAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ValueAdapter) adapter;
    }
  }
  
  public BooleanValueAdapter createBooleanValueAdapter(final BooleanValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanValueAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanValueAdapter) adapter;
    }
  }
  
  public IntegerValueAdapter createIntegerValueAdapter(final IntegerValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerValueAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerValueAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ExpressionAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ExpressionAdapter) adapter;
    }
  }
  
  public IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerExpressionAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanExpressionAdapter) adapter;
    }
  }
  
  public IntegerCalculationExpressionAdapter createIntegerCalculationExpressionAdapter(final IntegerCalculationExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerCalculationExpressionAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerCalculationExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerCalculationExpressionAdapter) adapter;
    }
  }
  
  public IntegerComparisonExpressionAdapter createIntegerComparisonExpressionAdapter(final IntegerComparisonExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerComparisonExpressionAdapter) adapter;
    }
  }
  
  public BooleanUnaryExpressionAdapter createBooleanUnaryExpressionAdapter(final BooleanUnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanUnaryExpressionAdapter) adapter;
    }
  }
  
  public BooleanBinaryExpressionAdapter createBooleanBinaryExpressionAdapter(final BooleanBinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.BooleanBinaryExpressionAdapter) adapter;
    }
  }
  
  public OfferAdapter createOfferAdapter(final Offer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.OfferAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.OfferAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.OfferAdapter) adapter;
    }
  }
  
  public TokenAdapter createTokenAdapter(final Token adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.TokenAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.TokenAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.TokenAdapter) adapter;
    }
  }
  
  public TraceAdapter createTraceAdapter(final Trace adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.TraceAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.TraceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.TraceAdapter) adapter;
    }
  }
  
  public InputValueAdapter createInputValueAdapter(final InputValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InputValueAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InputValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InputValueAdapter) adapter;
    }
  }
  
  public InputAdapter createInputAdapter(final Input adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InputAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InputAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.InputAdapter) adapter;
    }
  }
  
  public ControlTokenAdapter createControlTokenAdapter(final ControlToken adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlTokenAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlTokenAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ControlTokenAdapter) adapter;
    }
  }
  
  public ForkedTokenAdapter createForkedTokenAdapter(final ForkedToken adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ForkedTokenAdapter) adapter;
    else {
    	adapter = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ForkedTokenAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.ForkedTokenAdapter) adapter;
    }
  }
}
