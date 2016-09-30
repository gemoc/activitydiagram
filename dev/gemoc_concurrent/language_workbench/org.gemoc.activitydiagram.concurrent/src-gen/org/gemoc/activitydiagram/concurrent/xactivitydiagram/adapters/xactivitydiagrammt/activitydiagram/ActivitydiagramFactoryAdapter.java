package org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.AcceptEventAction;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Activity;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivityFinalNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.BooleanBinaryExpression;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Context;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.DecisionNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ForkNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ForkedToken;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Input;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.InputValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.IntegerCalculationExpression;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.MergeNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Offer;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.OpaqueAction;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.SendSignalAction;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Signal;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.SignalEvent;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Token;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Trace;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Util;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Value;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Variable;

@SuppressWarnings("all")
public class ActivitydiagramFactoryAdapter extends EFactoryImpl implements ActivitydiagramFactory {
  private XActivityDiagramMTAdaptersFactory adaptersFactory = org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  
  private org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramFactory activitydiagramAdaptee = org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramFactory.eINSTANCE;
  
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
  public InputValue createInputValue() {
    return adaptersFactory.createInputValueAdapter(activitydiagramAdaptee.createInputValue(), null);
  }
  
  @Override
  public Input createInput() {
    return adaptersFactory.createInputAdapter(activitydiagramAdaptee.createInput(), null);
  }
  
  @Override
  public SendSignalAction createSendSignalAction() {
    return adaptersFactory.createSendSignalActionAdapter(activitydiagramAdaptee.createSendSignalAction(), null);
  }
  
  @Override
  public AcceptEventAction createAcceptEventAction() {
    return adaptersFactory.createAcceptEventActionAdapter(activitydiagramAdaptee.createAcceptEventAction(), null);
  }
  
  @Override
  public Signal createSignal() {
    return adaptersFactory.createSignalAdapter(activitydiagramAdaptee.createSignal(), null);
  }
  
  @Override
  public SignalEvent createSignalEvent() {
    return adaptersFactory.createSignalEventAdapter(activitydiagramAdaptee.createSignalEvent(), null);
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
  public ControlToken createControlToken() {
    return adaptersFactory.createControlTokenAdapter(activitydiagramAdaptee.createControlToken(), null);
  }
  
  @Override
  public ForkedToken createForkedToken() {
    return adaptersFactory.createForkedTokenAdapter(activitydiagramAdaptee.createForkedToken(), null);
  }
  
  @Override
  public Context createContext() {
    return adaptersFactory.createContextAdapter(activitydiagramAdaptee.createContext(), null);
  }
  
  @Override
  public Util createUtil() {
    return adaptersFactory.createUtilAdapter(activitydiagramAdaptee.createUtil(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getActivitydiagramPackage();
  }
  
  public ActivitydiagramPackage getActivitydiagramPackage() {
    return org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE;
  }
}
