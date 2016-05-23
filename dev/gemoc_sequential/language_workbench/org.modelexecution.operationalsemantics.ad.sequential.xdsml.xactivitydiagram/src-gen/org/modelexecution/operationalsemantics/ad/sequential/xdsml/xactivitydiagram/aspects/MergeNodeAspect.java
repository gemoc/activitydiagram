package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Token;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Trace;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties;

@Aspect(className = MergeNode.class)
@SuppressWarnings("all")
public class MergeNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final MergeNode _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspect._privk3_execute(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static boolean hasOffers1(final MergeNode _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspect._privk3_hasOffers1(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode)_self);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect.hasOffers1((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static void super_execute(final MergeNode _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final MergeNodeAspectMergeNodeAspectProperties _self_, final MergeNode _self, final Context c) {
    Trace _output = c.getOutput();
    EList<ActivityNode> _executedNodes = _output.getExecutedNodes();
    _executedNodes.add(_self);
    EList<Token> _takeOfferdTokens1 = ActivityNodeAspect.takeOfferdTokens1(_self);
    ActivityNodeAspect.sendOffers1(_self, _takeOfferdTokens1);
  }
  
  protected static boolean _privk3_hasOffers1(final MergeNodeAspectMergeNodeAspectProperties _self_, final MergeNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Function1<ActivityEdge, Boolean> _function = (ActivityEdge edge) -> {
      return Boolean.valueOf(ActivityEdgeAspect.hasOffer1(edge));
    };
    return IterableExtensions.<ActivityEdge>exists(_incoming, _function);
  }
}
