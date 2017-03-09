package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkNodeAspectForkNodeAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspect;

@Aspect(className = ForkNode.class)
@SuppressWarnings("all")
public class ForkNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final ForkNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkNodeAspectForkNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkNodeAspectForkNodeAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final ForkNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ForkNodeAspectForkNodeAspectProperties _self_, final ForkNode _self) {
    EList<Token> tokens = ActivityNodeAspect.takeOfferdTokens1(_self);
    BasicEList<Token> forkedTokens = new BasicEList<Token>();
    for (final Token token : tokens) {
      {
        ForkedToken forkedToken = ActivitydiagramFactory.eINSTANCE.createForkedToken();
        ForkedTokenAspect.baseToken(forkedToken, token);
        EList<ActivityEdge> _outgoing = _self.getOutgoing();
        int _size = _outgoing.size();
        ForkedTokenAspect.remainingOffersCount(forkedToken, _size);
        forkedTokens.add(forkedToken);
      }
    }
    ActivityNodeAspect.addTokens1(_self, forkedTokens);
    ActivityNodeAspect.sendOffers1(_self, forkedTokens);
  }
}
