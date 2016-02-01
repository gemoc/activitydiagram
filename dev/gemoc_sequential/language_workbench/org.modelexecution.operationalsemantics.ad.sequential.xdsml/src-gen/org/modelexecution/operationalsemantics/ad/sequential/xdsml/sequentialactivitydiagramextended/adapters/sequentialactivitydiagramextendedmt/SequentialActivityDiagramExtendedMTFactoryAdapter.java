package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityFinalNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanBinaryExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanUnaryExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.BooleanVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Context;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ControlFlow;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ControlToken;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.DecisionNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ForkNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ForkedToken;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.InitialNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Input;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.InputValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.IntegerCalculationExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.IntegerComparisonExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.IntegerValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.IntegerVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.JoinNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.MergeNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Offer;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.OpaqueAction;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Token;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Trace;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Value;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Variable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.XtendRecordingCommand;

@SuppressWarnings("all")
public class SequentialActivityDiagramExtendedMTFactoryAdapter extends EFactoryImpl implements ActivitydiagramFactory {
  private SequentialActivityDiagramExtendedMTAdaptersFactory adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance();
  
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.ActivitydiagramFactory activitydiagramAdaptee = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.ActivitydiagramFactory.eINSTANCE;
  
  @Override
  public Activity createActivity() {
    return adaptersFactory.createActivityAdapter(activitydiagramAdaptee.createActivity(), null) ;
  }
  
  @Override
  public ActivityNode createActivityNode() {
    return adaptersFactory.createActivityNodeAdapter(activitydiagramAdaptee.createActivityNode(), null) ;
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
  public Variable createVariable() {
    return adaptersFactory.createVariableAdapter(activitydiagramAdaptee.createVariable(), null) ;
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
  public Value createValue() {
    return adaptersFactory.createValueAdapter(activitydiagramAdaptee.createValue(), null) ;
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
  public Token createToken() {
    return adaptersFactory.createTokenAdapter(activitydiagramAdaptee.createToken(), null) ;
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
  public XtendRecordingCommand createXtendRecordingCommand() {
    return adaptersFactory.createXtendRecordingCommandAdapter(activitydiagramAdaptee.createXtendRecordingCommand(), null) ;
  }
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.null createnull() {
    return adaptersFactory.createnullAdapter(activitydiagramAdaptee.createnull(), null) ;
  }
  
  @Override
  public EPackage getEPackage() {
    return getActivitydiagramPackage();
  }
  
  public ActivitydiagramPackage getActivitydiagramPackage() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.eINSTANCE;
  }
}
