package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspectTokenAspectProperties;

@SuppressWarnings("all")
public class TokenAspectTokenAspectContext {
  public final static TokenAspectTokenAspectContext INSTANCE = new TokenAspectTokenAspectContext();
  
  public static TokenAspectTokenAspectProperties getSelf(final Token _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspectTokenAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Token, TokenAspectTokenAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspectTokenAspectProperties>();
  
  public Map<Token, TokenAspectTokenAspectProperties> getMap() {
    return map;
  }
}
