package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityFinalNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.DecisionNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ForkNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ForkedToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Input;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.InputValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerCalculationExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.MergeNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Offer;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.OpaqueAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Token;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Trace;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Value;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Variable;

@SuppressWarnings("all")
public class ActivitydiagramFactoryAdapter extends EFactoryImpl implements ActivitydiagramFactory {
  private XActivityDiagramMTAdaptersFactory adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  
  private org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory activitydiagramAdaptee = org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory.eINSTANCE;
  
  @Override
  public Activity createActivity() {
    return adaptersFactory.createActivityAdapter(activitydiagramAdaptee.createActivity(), null);
  }
  
  @Override
  public ActivityNode createActivityNode() {
    return adaptersFactory.createActivityNodeAdapter(activitydiagramAdaptee.createActivityNode(), null);
  }
  
  @Override
  public ControlFlow createControlFlow() {
    return adaptersFactory.createControlFlowAdapter(activitydiagramAdaptee.createControlFlow(), null);
  }
  
  @Override
  public OpaqueAction createOpaqueAction() {
    return adaptersFactory.createOpaqueActionAdapter(activitydiagramAdaptee.createOpaqueAction(), null);
  }
  
  @Override
  public InitialNode createInitialNode() {
    return adaptersFactory.createInitialNodeAdapter(activitydiagramAdaptee.createInitialNode(), null);
  }
  
  @Override
  public ActivityFinalNode createActivityFinalNode() {
    return adaptersFactory.createActivityFinalNodeAdapter(activitydiagramAdaptee.createActivityFinalNode(), null);
  }
  
  @Override
  public ForkNode createForkNode() {
    return adaptersFactory.createForkNodeAdapter(activitydiagramAdaptee.createForkNode(), null);
  }
  
  @Override
  public JoinNode createJoinNode() {
    return adaptersFactory.createJoinNodeAdapter(activitydiagramAdaptee.createJoinNode(), null);
  }
  
  @Override
  public MergeNode createMergeNode() {
    return adaptersFactory.createMergeNodeAdapter(activitydiagramAdaptee.createMergeNode(), null);
  }
  
  @Override
  public DecisionNode createDecisionNode() {
    return adaptersFactory.createDecisionNodeAdapter(activitydiagramAdaptee.createDecisionNode(), null);
  }
  
  @Override
  public Variable createVariable() {
    return adaptersFactory.createVariableAdapter(activitydiagramAdaptee.createVariable(), null);
  }
  
  @Override
  public IntegerVariable createIntegerVariable() {
    return adaptersFactory.createIntegerVariableAdapter(activitydiagramAdaptee.createIntegerVariable(), null);
  }
  
  @Override
  public BooleanVariable createBooleanVariable() {
    return adaptersFactory.createBooleanVariableAdapter(activitydiagramAdaptee.createBooleanVariable(), null);
  }
  
  @Override
  public Value createValue() {
    return adaptersFactory.createValueAdapter(activitydiagramAdaptee.createValue(), null);
  }
  
  @Override
  public BooleanValue createBooleanValue() {
    return adaptersFactory.createBooleanValueAdapter(activitydiagramAdaptee.createBooleanValue(), null);
  }
  
  @Override
  public IntegerValue createIntegerValue() {
    return adaptersFactory.createIntegerValueAdapter(activitydiagramAdaptee.createIntegerValue(), null);
  }
  
  @Override
  public IntegerCalculationExpression createIntegerCalculationExpression() {
    return adaptersFactory.createIntegerCalculationExpressionAdapter(activitydiagramAdaptee.createIntegerCalculationExpression(), null);
  }
  
  @Override
  public IntegerComparisonExpression createIntegerComparisonExpression() {
    return adaptersFactory.createIntegerComparisonExpressionAdapter(activitydiagramAdaptee.createIntegerComparisonExpression(), null);
  }
  
  @Override
  public BooleanUnaryExpression createBooleanUnaryExpression() {
    return adaptersFactory.createBooleanUnaryExpressionAdapter(activitydiagramAdaptee.createBooleanUnaryExpression(), null);
  }
  
  @Override
  public BooleanBinaryExpression createBooleanBinaryExpression() {
    return adaptersFactory.createBooleanBinaryExpressionAdapter(activitydiagramAdaptee.createBooleanBinaryExpression(), null);
  }
  
  @Override
  public Token createToken() {
    return adaptersFactory.createTokenAdapter(activitydiagramAdaptee.createToken(), null);
  }
  
  @Override
  public Offer createOffer() {
    return adaptersFactory.createOfferAdapter(activitydiagramAdaptee.createOffer(), null);
  }
  
  @Override
  public Trace createTrace() {
    return adaptersFactory.createTraceAdapter(activitydiagramAdaptee.createTrace(), null);
  }
  
  @Override
  public InputValue createInputValue() {
    return adaptersFactory.createInputValueAdapter(activitydiagramAdaptee.createInputValue(), null);
  }
  
  @Override
  public Input createInput() {
    return adaptersFactory.createInputAdapter(activitydiagramAdaptee.createInput(), null);
  }
  
  @Override
  public ControlToken createControlToken() {
    return adaptersFactory.createControlTokenAdapter(activitydiagramAdaptee.createControlToken(), null);
  }
  
  @Override
  public ForkedToken createForkedToken() {
    return adaptersFactory.createForkedTokenAdapter(activitydiagramAdaptee.createForkedToken(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getActivitydiagramPackage();
  }
  
  public ActivitydiagramPackage getActivitydiagramPackage() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE;
  }
}
