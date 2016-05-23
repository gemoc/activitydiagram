package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Token;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.TokenAspect;

@Aspect(className = ActivityNode.class)
@SuppressWarnings("all")
public class ActivityNodeAspect extends NamedElementAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final ActivityNode _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.InitialNodeAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.DecisionNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.DecisionNodeAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.DecisionNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityFinalNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityFinalNodeAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityFinalNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ForkNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ForkNodeAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ForkNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.JoinNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.JoinNodeAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.JoinNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.OpaqueAction){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OpaqueActionAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.OpaqueAction)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode)_self,c);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"ActivityNode","execute");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @Step
  public static void terminate(final ActivityNode _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_terminate(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"ActivityNode","terminate");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static boolean isReady(final ActivityNode _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isReady(_self_, _self);;
    return (boolean)result;
  }
  
  @Step
  public static void sendOffers1(final ActivityNode _self, final EList<Token> tokens) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.DecisionNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.DecisionNodeAspect.sendOffers1((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.DecisionNode)_self,tokens);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect._privk3_sendOffers1(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode)_self,tokens);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"ActivityNode","sendOffers1");
    					} else {
    						command.execute();
    					}
    					;
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @Step
  public static EList<Token> takeOfferdTokens1(final ActivityNode _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    Object result = null;
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		addToResult(_privk3_takeOfferdTokens1(_self_, _self));
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"ActivityNode","takeOfferdTokens1");
    } else {
    	command.execute();
    }
    result = command.getResult();
    ;;
    return (org.eclipse.emf.common.util.EList<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Token>)result;
  }
  
  @Step
  public static void addTokens1(final ActivityNode _self, final EList<Token> tokens) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_addTokens1(_self_, _self,tokens);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"ActivityNode","addTokens1");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static boolean hasOffers1(final ActivityNode _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.InitialNodeAspect.hasOffers1((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode)_self);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspect.hasOffers1((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode)_self);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers1(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  @Step
  public static void removeToken1(final ActivityNode _self, final Token token) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_removeToken1(_self_, _self,token);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"ActivityNode","removeToken1");
    } else {
    	command.execute();
    }
    ;;
  }
  
  private static void super_execute(final ActivityNode _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final Context c) {
  }
  
  protected static void _privk3_terminate(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    _self.setRunning(false);
  }
  
  protected static boolean _privk3_isReady(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    return _self.isRunning();
  }
  
  protected static void _privk3_sendOffers1(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final EList<Token> tokens) {
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    for (final ActivityEdge edge : _outgoing) {
      ActivityEdgeAspect.sendOffer1(edge, tokens);
    }
  }
  
  protected static EList<Token> _privk3_takeOfferdTokens1(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    final BasicEList<Token> allTokens = new BasicEList<Token>();
    EList<ActivityEdge> _incoming = _self.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      {
        final EList<Token> tokens = ActivityEdgeAspect.takeOfferedTokens1(edge);
        for (final Token token : tokens) {
          {
            TokenAspect.withdraw1(token);
            token.setHolder(_self);
          }
        }
        allTokens.addAll(tokens);
      }
    }
    return allTokens;
  }
  
  protected static void _privk3_addTokens1(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final EList<Token> tokens) {
    for (final Token token : tokens) {
      {
        Token transferredToken = TokenAspect.transfer1(token, _self);
        EList<Token> _heldTokens = _self.getHeldTokens();
        _heldTokens.add(transferredToken);
      }
    }
  }
  
  protected static boolean _privk3_hasOffers1(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    boolean hasOffer = true;
    EList<ActivityEdge> _incoming = _self.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      boolean _hasOffer1 = ActivityEdgeAspect.hasOffer1(edge);
      boolean _not = (!_hasOffer1);
      if (_not) {
        hasOffer = false;
      }
    }
    return hasOffer;
  }
  
  protected static void _privk3_removeToken1(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final Token token) {
    EList<Token> _heldTokens = _self.getHeldTokens();
    _heldTokens.remove(token);
  }
}
