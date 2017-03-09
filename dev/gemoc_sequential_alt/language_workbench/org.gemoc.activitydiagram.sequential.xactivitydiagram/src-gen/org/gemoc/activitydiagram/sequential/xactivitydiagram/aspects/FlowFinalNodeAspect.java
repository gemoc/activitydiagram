package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FinalNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FlowFinalNodeAspectFlowFinalNodeAspectProperties;

@Aspect(className = FlowFinalNode.class)
@SuppressWarnings("all")
public class FlowFinalNodeAspect extends FinalNodeAspect {
  @OverrideAspectMethod
  public static void execute(final FlowFinalNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FlowFinalNodeAspectFlowFinalNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FlowFinalNodeAspectFlowFinalNodeAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final FlowFinalNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FinalNodeAspectFinalNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FinalNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final FlowFinalNodeAspectFlowFinalNodeAspectProperties _self_, final FlowFinalNode _self) {
    ActivityEdge _incoming = _self.getIncoming();
    EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_incoming);
    final ControlToken token = IterableExtensions.<ControlToken>head(_offeredTokens);
    ActivityNodeAspect.addToken(_self, token);
  }
}
