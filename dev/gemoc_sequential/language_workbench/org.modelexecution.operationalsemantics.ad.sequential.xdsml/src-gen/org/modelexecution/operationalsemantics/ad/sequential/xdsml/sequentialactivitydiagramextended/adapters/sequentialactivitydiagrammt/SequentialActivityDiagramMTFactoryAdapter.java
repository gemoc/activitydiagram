package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityFinalNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.BooleanBinaryExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.BooleanUnaryExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.BooleanValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.BooleanVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Context;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ControlFlow;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ControlToken;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.DecisionNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ForkNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ForkedToken;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.InitialNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Input;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.InputValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.IntegerCalculationExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.IntegerComparisonExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.IntegerValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.IntegerVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.JoinNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.MergeNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Offer;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.OpaqueAction;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Trace;

@SuppressWarnings("all")
public class SequentialActivityDiagramMTFactoryAdapter extends EFactoryImpl implements ActivitydiagramFactory {
  private SequentialActivityDiagramMTAdaptersFactory adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance();
  
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.ActivitydiagramFactory activitydiagramAdaptee = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.ActivitydiagramFactory.eINSTANCE;
  
  @Override
  public Activity createActivity() {
    return adaptersFactory.createActivityAdapter(activitydiagramAdaptee.createActivity(), null) ;
  }
  
  @Override
  public ControlFlow createControlFlow() {
    return adaptersFactory.createControlFlowAdapter(activitydiagramAdaptee.createControlFlow(), null) ;
  }
  
  @Override
  public OpaqueAction createOpaqueAction() {
    return adaptersFactory.createOpaqueActionAdapter(activitydiagramAdaptee.createOpaqueAction(), null) ;
  }
  
  @Override
  public InitialNode createInitialNode() {
    return adaptersFactory.createInitialNodeAdapter(activitydiagramAdaptee.createInitialNode(), null) ;
  }
  
  @Override
  public ActivityFinalNode createActivityFinalNode() {
    return adaptersFactory.createActivityFinalNodeAdapter(activitydiagramAdaptee.createActivityFinalNode(), null) ;
  }
  
  @Override
  public ForkNode createForkNode() {
    return adaptersFactory.createForkNodeAdapter(activitydiagramAdaptee.createForkNode(), null) ;
  }
  
  @Override
  public JoinNode createJoinNode() {
    return adaptersFactory.createJoinNodeAdapter(activitydiagramAdaptee.createJoinNode(), null) ;
  }
  
  @Override
  public MergeNode createMergeNode() {
    return adaptersFactory.createMergeNodeAdapter(activitydiagramAdaptee.createMergeNode(), null) ;
  }
  
  @Override
  public DecisionNode createDecisionNode() {
    return adaptersFactory.createDecisionNodeAdapter(activitydiagramAdaptee.createDecisionNode(), null) ;
  }
  
  @Override
  public IntegerVariable createIntegerVariable() {
    return adaptersFactory.createIntegerVariableAdapter(activitydiagramAdaptee.createIntegerVariable(), null) ;
  }
  
  @Override
  public BooleanVariable createBooleanVariable() {
    return adaptersFactory.createBooleanVariableAdapter(activitydiagramAdaptee.createBooleanVariable(), null) ;
  }
  
  @Override
  public BooleanValue createBooleanValue() {
    return adaptersFactory.createBooleanValueAdapter(activitydiagramAdaptee.createBooleanValue(), null) ;
  }
  
  @Override
  public IntegerValue createIntegerValue() {
    return adaptersFactory.createIntegerValueAdapter(activitydiagramAdaptee.createIntegerValue(), null) ;
  }
  
  @Override
  public IntegerCalculationExpression createIntegerCalculationExpression() {
    return adaptersFactory.createIntegerCalculationExpressionAdapter(activitydiagramAdaptee.createIntegerCalculationExpression(), null) ;
  }
  
  @Override
  public IntegerComparisonExpression createIntegerComparisonExpression() {
    return adaptersFactory.createIntegerComparisonExpressionAdapter(activitydiagramAdaptee.createIntegerComparisonExpression(), null) ;
  }
  
  @Override
  public BooleanUnaryExpression createBooleanUnaryExpression() {
    return adaptersFactory.createBooleanUnaryExpressionAdapter(activitydiagramAdaptee.createBooleanUnaryExpression(), null) ;
  }
  
  @Override
  public BooleanBinaryExpression createBooleanBinaryExpression() {
    return adaptersFactory.createBooleanBinaryExpressionAdapter(activitydiagramAdaptee.createBooleanBinaryExpression(), null) ;
  }
  
  @Override
  public Offer createOffer() {
    return adaptersFactory.createOfferAdapter(activitydiagramAdaptee.createOffer(), null) ;
  }
  
  @Override
  public Trace createTrace() {
    return adaptersFactory.createTraceAdapter(activitydiagramAdaptee.createTrace(), null) ;
  }
  
  @Override
  public InputValue createInputValue() {
    return adaptersFactory.createInputValueAdapter(activitydiagramAdaptee.createInputValue(), null) ;
  }
  
  @Override
  public Input createInput() {
    return adaptersFactory.createInputAdapter(activitydiagramAdaptee.createInput(), null) ;
  }
  
  @Override
  public ControlToken createControlToken() {
    return adaptersFactory.createControlTokenAdapter(activitydiagramAdaptee.createControlToken(), null) ;
  }
  
  @Override
  public ForkedToken createForkedToken() {
    return adaptersFactory.createForkedTokenAdapter(activitydiagramAdaptee.createForkedToken(), null) ;
  }
  
  @Override
  public Context createContext() {
    return adaptersFactory.createContextAdapter(activitydiagramAdaptee.createContext(), null) ;
  }
  
  @Override
  public EPackage getEPackage() {
    return getActivitydiagramPackage();
  }
  
  public ActivitydiagramPackage getActivitydiagramPackage() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE;
  }
}
