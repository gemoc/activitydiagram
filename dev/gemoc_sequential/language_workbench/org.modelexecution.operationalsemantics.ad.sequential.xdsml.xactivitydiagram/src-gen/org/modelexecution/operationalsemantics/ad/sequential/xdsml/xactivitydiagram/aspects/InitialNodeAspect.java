package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ControlToken;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Token;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Trace;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties;

@Aspect(className = InitialNode.class)
@SuppressWarnings("all")
public class InitialNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final InitialNode _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.InitialNodeAspect._privk3_execute(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static boolean hasOffers1(final InitialNode _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.InitialNodeAspect._privk3_hasOffers1(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode)_self);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect.hasOffers1((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static void super_execute(final InitialNode _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self, final Context c) {
    ControlToken r = ActivitydiagramFactory.eINSTANCE.createControlToken();
    r.setHolder(_self);
    BasicEList<Token> list = new BasicEList<Token>();
    list.add(r);
    ActivityNodeAspect.sendOffers1(_self, list);
    Trace _output = c.getOutput();
    EList<ActivityNode> _executedNodes = _output.getExecutedNodes();
    _executedNodes.add(_self);
  }
  
  private static boolean super_hasOffers1(final InitialNode _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers1(_self_, _self);
  }
  
  protected static boolean _privk3_hasOffers1(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    return false;
  }
}
