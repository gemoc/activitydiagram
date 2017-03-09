package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectProperties;

@Aspect(className = OpaqueAction.class)
@SuppressWarnings("all")
public class OpaqueActionAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final OpaqueAction _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final OpaqueAction _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final OpaqueActionAspectOpaqueActionAspectProperties _self_, final OpaqueAction _self) {
    EList<Expression> _expressions = _self.getExpressions();
    final Consumer<Expression> _function = (Expression e) -> {
      ExpressionAspect.execute(e);
    };
    _expressions.forEach(_function);
    EList<Token> _takeOfferdTokens1 = ActivityNodeAspect.takeOfferdTokens1(_self);
    ActivityNodeAspect.sendOffers1(_self, _takeOfferdTokens1);
  }
}
