package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect;

@Aspect(className = Offer.class)
@SuppressWarnings("all")
public class OfferAspect {
  public static boolean hasTokens1(final Offer _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasTokens1(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void removeWithdrawnTokens1(final Offer _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectContext
			.getSelf(_self);
	_privk3_removeWithdrawnTokens1(_self_, _self);
	;
}
  
  public static EList<Token> offeredTokens(final Offer _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_offeredTokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static void offeredTokens(final Offer _self, final EList<Token> offeredTokens) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspectOfferAspectContext.getSelf(_self);
    _privk3_offeredTokens(_self_, _self,offeredTokens);;
  }
  
  protected static boolean _privk3_hasTokens1(final OfferAspectOfferAspectProperties _self_, final Offer _self) {
    OfferAspect.removeWithdrawnTokens1(_self);
    EList<Token> _offeredTokens = OfferAspect.offeredTokens(_self);
    int _size = _offeredTokens.size();
    return (_size > 0);
  }
  
  protected static void _privk3_removeWithdrawnTokens1(final OfferAspectOfferAspectProperties _self_, final Offer _self) {
    final BasicEList<Token> tokensToBeRemoved = new BasicEList<Token>();
    EList<Token> _offeredTokens = OfferAspect.offeredTokens(_self);
    final Consumer<Token> _function = (Token token) -> {
      boolean _isWithdrawn = TokenAspect.isWithdrawn(token);
      if (_isWithdrawn) {
        tokensToBeRemoved.add(token);
      }
    };
    _offeredTokens.forEach(_function);
    EList<Token> _offeredTokens_1 = OfferAspect.offeredTokens(_self);
    _offeredTokens_1.removeAll(tokensToBeRemoved);
  }
  
  protected static EList<Token> _privk3_offeredTokens(final OfferAspectOfferAspectProperties _self_, final Offer _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOfferedTokens") &&
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
    return _self_.offeredTokens;
  }
  
  protected static void _privk3_offeredTokens(final OfferAspectOfferAspectProperties _self_, final Offer _self, final EList<Token> offeredTokens) {
    _self_.offeredTokens = offeredTokens; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOfferedTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, offeredTokens);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
