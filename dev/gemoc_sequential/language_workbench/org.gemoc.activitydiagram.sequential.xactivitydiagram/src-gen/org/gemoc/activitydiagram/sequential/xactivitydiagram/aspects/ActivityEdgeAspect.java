package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspect;

@Aspect(className = ActivityEdge.class)
@SuppressWarnings("all")
public class ActivityEdgeAspect extends NamedElementAspect {
  public static void sendOffer(final ActivityEdge _self, final EList<Token> tokens) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_sendOffer(_self_, _self,tokens);;
  }
  
  public static EList<Token> takeOfferedTokens(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_takeOfferedTokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static boolean hasOffer(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasOffer(_self_, _self);
	;
	return (boolean) result;
}
  
  @Containment
  public static EList<Offer> offers(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_offers(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void offers(final ActivityEdge _self, final EList<Offer> offers) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_offers(_self_, _self,offers);;
  }
  
  protected static void _privk3_sendOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<Token> tokens) {
    final Offer offer = ActivitydiagramFactory.eINSTANCE.createOffer();
    ActivityEdgeAspect.offers(_self).add(offer);
    final Consumer<Token> _function = (Token token) -> {
      OfferAspect.offeredTokens(offer).add(token);
    };
    tokens.forEach(_function);
  }
  
  protected static EList<Token> _privk3_takeOfferedTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    final BasicEList<Token> tokens = new BasicEList<Token>();
    final Consumer<Offer> _function = (Offer o) -> {
      tokens.addAll(OfferAspect.offeredTokens(o));
    };
    ActivityEdgeAspect.offers(_self).forEach(_function);
    ActivityEdgeAspect.offers(_self).clear();
    return tokens;
  }
  
  protected static boolean _privk3_hasOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    final Function1<Offer, Boolean> _function = (Offer o1) -> {
      return Boolean.valueOf(OfferAspect.hasTokens(o1));
    };
    return IterableExtensions.<Offer>exists(ActivityEdgeAspect.offers(_self), _function);
  }
  
  protected static EList<Offer> _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOffers") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.offers;
  }
  
  protected static void _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<Offer> offers) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOffers")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, offers);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.offers = offers;
    }
  }
}
