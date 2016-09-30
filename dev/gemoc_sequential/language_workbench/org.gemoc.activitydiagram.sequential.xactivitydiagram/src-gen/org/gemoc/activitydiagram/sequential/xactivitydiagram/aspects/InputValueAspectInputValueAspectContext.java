package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectProperties;

@SuppressWarnings("all")
public class InputValueAspectInputValueAspectContext {
  public final static InputValueAspectInputValueAspectContext INSTANCE = new InputValueAspectInputValueAspectContext();
  
  public static InputValueAspectInputValueAspectProperties getSelf(final InputValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InputValue, InputValueAspectInputValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectProperties>();
  
  public Map<InputValue, InputValueAspectInputValueAspectProperties> getMap() {
    return map;
  }
}
