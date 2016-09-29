package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import com.google.common.base.Objects;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
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
  
  public static ActivityNode holder(final Token _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_holder(_self_, _self);;
    return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)result;
  }
  
  public static void holder(final Token _self, final ActivityNode holder) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectContext.getSelf(_self);
    _privk3_holder(_self_, _self,holder);;
  }
  
  protected static Token _privk3_transfer1(final TokenAspectTokenAspectProperties _self_, final Token _self, final ActivityNode holder) {
    ActivityNode _holder = TokenAspect.holder(_self);
    boolean _notEquals = (!Objects.equal(_holder, null));
    if (_notEquals) {
      TokenAspect.withdraw1(_self);
    }
    TokenAspect.holder(_self, holder);
    return _self;
  }
  
  protected static void _privk3_withdraw1(final TokenAspectTokenAspectProperties _self_, final Token _self) {
    boolean _isWithdrawn = TokenAspect.isWithdrawn(_self);
    boolean _not = (!_isWithdrawn);
    if (_not) {
      ActivityNode _holder = TokenAspect.holder(_self);
      ActivityNodeAspect.removeToken1(_holder, _self);
      TokenAspect.holder(_self, null);
    }
  }
  
  protected static boolean _privk3_isWithdrawn(final TokenAspectTokenAspectProperties _self_, final Token _self) {
    ActivityNode _holder = TokenAspect.holder(_self);
    return Objects.equal(_holder, null);
  }
  
  protected static ActivityNode _privk3_holder(final TokenAspectTokenAspectProperties _self_, final Token _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHolder") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.holder;
  }
  
  protected static void _privk3_holder(final TokenAspectTokenAspectProperties _self_, final Token _self, final ActivityNode holder) {
    _self_.holder = holder; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHolder")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, holder);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
