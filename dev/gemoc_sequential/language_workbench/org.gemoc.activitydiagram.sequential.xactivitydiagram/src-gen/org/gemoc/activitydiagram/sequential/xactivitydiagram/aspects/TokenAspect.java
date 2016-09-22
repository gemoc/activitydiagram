package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectProperties;

@Aspect(className = Token.class)
@SuppressWarnings("all")
public class TokenAspect {
  public static Token transfer1(final Token _self, final ActivityNode holder) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_transfer1(_self_, _self,holder);;
    return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token)result;
  }
  
  public static void withdraw1(final Token _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectContext.getSelf(_self);
    _privk3_withdraw1(_self_, _self);;
  }
  
  public static boolean isWithdrawn(final Token _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isWithdrawn(_self_, _self);;
    return (boolean)result;
  }
  
  protected static Token _privk3_transfer1(final TokenAspectTokenAspectProperties _self_, final Token _self, final ActivityNode holder) {
    ActivityNode _holder = _self.getHolder();
    boolean _notEquals = (!Objects.equal(_holder, null));
    if (_notEquals) {
      TokenAspect.withdraw1(_self);
    }
    _self.setHolder(holder);
    return _self;
  }
  
  protected static void _privk3_withdraw1(final TokenAspectTokenAspectProperties _self_, final Token _self) {
    boolean _isWithdrawn = TokenAspect.isWithdrawn(_self);
    boolean _not = (!_isWithdrawn);
    if (_not) {
      ActivityNode _holder = _self.getHolder();
      ActivityNodeAspect.removeToken1(_holder, _self);
      _self.setHolder(null);
    }
  }
  
  protected static boolean _privk3_isWithdrawn(final TokenAspectTokenAspectProperties _self_, final Token _self) {
    ActivityNode _holder = _self.getHolder();
    return Objects.equal(_holder, null);
  }
}
