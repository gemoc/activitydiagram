package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import com.google.common.base.Objects;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspect;

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
  public static void sendOffers1(final DecisionNode _self, final EList<Token> tokens) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspect._privk3_sendOffers1(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode)_self,tokens);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.sendOffers1((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)_self,tokens);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final DecisionNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final DecisionNodeAspectDecisionNodeAspectProperties _self_, final DecisionNode _self) {
    EList<Token> _takeOfferdTokens1 = ActivityNodeAspect.takeOfferdTokens1(_self);
    DecisionNodeAspect.sendOffers1(_self, _takeOfferdTokens1);
  }
  
  private static void super_sendOffers1(final DecisionNode _self, final EList<Token> tokens) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_sendOffers1(_self_, _self,tokens);
  }
  
  protected static void _privk3_sendOffers1(final DecisionNodeAspectDecisionNodeAspectProperties _self_, final DecisionNode _self, final EList<Token> tokens) {
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    for (final ActivityEdge edge : _outgoing) {
      if (((edge instanceof ControlFlow) && (!Objects.equal(((ControlFlow) edge).getGuard(), null)))) {
        BooleanVariable _guard = ((ControlFlow) edge).getGuard();
        Value _currentValue = _guard.getCurrentValue();
        boolean _value = DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue));
        if (_value) {
          ActivityEdgeAspect.sendOffer1(edge, tokens);
        }
      }
    }
  }
}
