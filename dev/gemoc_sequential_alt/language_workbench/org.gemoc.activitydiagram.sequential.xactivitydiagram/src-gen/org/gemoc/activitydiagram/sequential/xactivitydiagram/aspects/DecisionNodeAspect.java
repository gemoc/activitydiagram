package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode;
import com.google.common.base.Objects;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectProperties;

@Aspect(className = DecisionNode.class)
@SuppressWarnings("all")
public class DecisionNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final DecisionNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  @OverrideAspectMethod
  public static boolean hasOffers(final DecisionNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasOffers(_self_, _self);
	;
	return (boolean) result;
}
  
  private static void super_execute(final DecisionNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final DecisionNodeAspectDecisionNodeAspectProperties _self_, final DecisionNode _self) {
    ActivityEdge _incoming = _self.getIncoming();
    EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_incoming);
    ControlToken token = IterableExtensions.<ControlToken>head(_offeredTokens);
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    for (final ActivityEdge edge : _outgoing) {
      if (((edge instanceof ControlFlow) && (!Objects.equal(((ControlFlow) edge).getGuard(), null)))) {
        BooleanVariable _guard = ((ControlFlow) edge).getGuard();
        boolean _currentValue = BooleanVariableAspect.currentValue(_guard);
        if (_currentValue) {
          ActivityEdgeAspect.sendOffer(edge, token);
        }
      }
    }
  }
  
  private static boolean super_hasOffers(final DecisionNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(_self_, _self);
  }
  
  protected static boolean _privk3_hasOffers(final DecisionNodeAspectDecisionNodeAspectProperties _self_, final DecisionNode _self) {
    ActivityEdge _incoming = _self.getIncoming();
    EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_incoming);
    boolean _isEmpty = _offeredTokens.isEmpty();
    return (!_isEmpty);
  }
}
