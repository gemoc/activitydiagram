package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode;
import com.google.common.base.Objects;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties;

@Aspect(className = MergeNode.class)
@SuppressWarnings("all")
public class MergeNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static boolean hasOffers(final MergeNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasOffers(_self_, _self);
	;
	return (boolean) result;
}
  
  @OverrideAspectMethod
  public static void execute(final MergeNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static boolean super_hasOffers(final MergeNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(_self_, _self);
  }
  
  protected static boolean _privk3_hasOffers(final MergeNodeAspectMergeNodeAspectProperties _self_, final MergeNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Function1<ActivityEdge, Boolean> _function = (ActivityEdge e) -> {
      EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(e);
      boolean _isEmpty = _offeredTokens.isEmpty();
      return Boolean.valueOf((!_isEmpty));
    };
    return IterableExtensions.<ActivityEdge>exists(_incoming, _function);
  }
  
  private static void super_execute(final MergeNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final MergeNodeAspectMergeNodeAspectProperties _self_, final MergeNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Function1<ActivityEdge, Boolean> _function = (ActivityEdge e) -> {
      EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(e);
      boolean _isEmpty = _offeredTokens.isEmpty();
      return Boolean.valueOf((!_isEmpty));
    };
    ActivityEdge incoming = IterableExtensions.<ActivityEdge>findFirst(_incoming, _function);
    boolean _notEquals = (!Objects.equal(incoming, null));
    if (_notEquals) {
      EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(incoming);
      ControlToken token = IterableExtensions.<ControlToken>head(_offeredTokens);
      ActivityNodeAspect.addToken(_self, token);
      ActivityEdge _outgoing = _self.getOutgoing();
      EList<ControlToken> _offeredTokens_1 = ActivityEdgeAspect.offeredTokens(_outgoing);
      _offeredTokens_1.add(token);
    }
  }
}
