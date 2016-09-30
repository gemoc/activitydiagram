package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectProperties;

@SuppressWarnings("all")
public class OfferAspectOfferAspectContext {
  public final static OfferAspectOfferAspectContext INSTANCE = new OfferAspectOfferAspectContext();
  
  public static OfferAspectOfferAspectProperties getSelf(final Offer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Offer, OfferAspectOfferAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectProperties>();
  
  public Map<Offer, OfferAspectOfferAspectProperties> getMap() {
    return map;
  }
}
