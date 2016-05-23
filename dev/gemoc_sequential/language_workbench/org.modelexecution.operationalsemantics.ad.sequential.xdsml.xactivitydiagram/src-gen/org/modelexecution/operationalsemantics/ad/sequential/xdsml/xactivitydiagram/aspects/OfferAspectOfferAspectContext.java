package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Offer;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspectOfferAspectProperties;

@SuppressWarnings("all")
public class OfferAspectOfferAspectContext {
  public final static OfferAspectOfferAspectContext INSTANCE = new OfferAspectOfferAspectContext();
  
  public static OfferAspectOfferAspectProperties getSelf(final Offer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspectOfferAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Offer, OfferAspectOfferAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Offer, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspectOfferAspectProperties>();
  
  public Map<Offer, OfferAspectOfferAspectProperties> getMap() {
    return map;
  }
}
