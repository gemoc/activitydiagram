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
  public static void sendOffer1(final ActivityEdge _self, final EList<Token> tokens) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_sendOffer1(_self_, _self,tokens);;
  }
  
  public static EList<Token> takeOfferedTokens1(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_takeOfferedTokens1(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static boolean hasOffer1(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasOffer1(_self_, _self);
	;
	return (boolean) result;
}
  
  private static EList<Offer> offersPool(final ActivityEdge _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_offersPool(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer>)result;
  }
  
  private static void offersPool(final ActivityEdge _self, final EList<Offer> offersPool) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_offersPool(_self_, _self,offersPool);;
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
  
  protected static void _privk3_sendOffer1(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<Token> tokens) {
    Offer _xifexpression = null;
    EList<Offer> _offersPool = ActivityEdgeAspect.offersPool(_self);
    boolean _isEmpty = _offersPool.isEmpty();
    if (_isEmpty) {
      _xifexpression = ActivitydiagramFactory.eINSTANCE.createOffer();
    } else {
      EList<Offer> _offersPool_1 = ActivityEdgeAspect.offersPool(_self);
      _xifexpression = _offersPool_1.remove(0);
    }
    final Offer offer = _xifexpression;
    EList<Offer> _offers = ActivityEdgeAspect.offers(_self);
    _offers.add(offer);
    final Consumer<Token> _function = (Token token) -> {
      EList<Token> _offeredTokens = OfferAspect.offeredTokens(offer);
      _offeredTokens.add(token);
    };
    tokens.forEach(_function);
  }
  
  protected static EList<Token> _privk3_takeOfferedTokens1(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    final BasicEList<Token> tokens = new BasicEList<Token>();
    EList<Offer> _offers = ActivityEdgeAspect.offers(_self);
    final Consumer<Offer> _function = (Offer o) -> {
      EList<Token> _offeredTokens = OfferAspect.offeredTokens(o);
      tokens.addAll(_offeredTokens);
      EList<Offer> _offersPool = ActivityEdgeAspect.offersPool(_self);
      _offersPool.add(o);
    };
    _offers.forEach(_function);
    EList<Offer> _offers_1 = ActivityEdgeAspect.offers(_self);
    _offers_1.clear();
    return tokens;
  }
  
  protected static boolean _privk3_hasOffer1(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    EList<Offer> _offers = ActivityEdgeAspect.offers(_self);
    final Function1<Offer, Boolean> _function = (Offer o1) -> {
      return Boolean.valueOf(OfferAspect.hasTokens1(o1));
    };
    return IterableExtensions.<Offer>exists(_offers, _function);
  }
  
  protected static EList<Offer> _privk3_offersPool(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOffersPool") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.offersPool;
  }
  
  protected static void _privk3_offersPool(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<Offer> offersPool) {
    _self_.offersPool = offersPool; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOffersPool")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, offersPool);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static EList<Offer> _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOffers") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.offers;
  }
  
  protected static void _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<Offer> offers) {
    _self_.offers = offers; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOffers")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, offers);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
