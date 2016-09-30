package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputAspectInputAspectProperties;

@SuppressWarnings("all")
public class InputAspectInputAspectContext {
  public final static InputAspectInputAspectContext INSTANCE = new InputAspectInputAspectContext();
  
  public static InputAspectInputAspectProperties getSelf(final Input _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputAspectInputAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Input, InputAspectInputAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputAspectInputAspectProperties>();
  
  public Map<Input, InputAspectInputAspectProperties> getMap() {
    return map;
  }
}
