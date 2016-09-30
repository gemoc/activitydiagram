package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ForkNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Value;
import com.google.common.base.Objects;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Offer;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Containment;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.NamedElementAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.OfferAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = ActivityEdge.class)
@SuppressWarnings("all")
public class ActivityEdgeAspect extends NamedElementAspect {
  public static void sendOffer(final ActivityEdge _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_sendOffer(_self_, _self);;
  }
  
  public static void clearOffer(final ActivityEdge _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_clearOffer(_self_, _self);;
  }
  
  public static void takeOfferedTokens(final ActivityEdge _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_takeOfferedTokens(_self_, _self);;
  }
  
  public static void transferTokens(final ActivityEdge _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_transferTokens(_self_, _self);;
  }
  
  public static boolean evaluateGuard(final ActivityEdge _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_evaluateGuard(_self_, _self);;
    return (boolean)result;
  }
  
  @Containment
  public static EList<Offer> offers(final ActivityEdge _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_offers(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Offer>)result;
  }
  
  @Containment
  public static void offers(final ActivityEdge _self, final EList<Offer> offers) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_offers(_self_, _self,offers);;
  }
  
  protected static void _privk3_sendOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    final Offer offer = ActivitydiagramFactory.eINSTANCE.createOffer();
    ActivityNode _source = _self.getSource();
    if ((_source instanceof ForkNode)) {
      ActivityNode _source_1 = _self.getSource();
      EList<ActivityEdge> _outgoing = _source_1.getOutgoing();
      int indexOfSelf = _outgoing.indexOf(_self);
      EList<Token> _offeredTokens = OfferAspect.offeredTokens(offer);
      ActivityNode _source_2 = _self.getSource();
      EList<Token> _heldTokens = ActivityNodeAspect.heldTokens(_source_2);
      Token _get = _heldTokens.get(indexOfSelf);
      _offeredTokens.add(_get);
    } else {
      EList<Token> _offeredTokens_1 = OfferAspect.offeredTokens(offer);
      ActivityNode _source_3 = _self.getSource();
      EList<Token> _heldTokens_1 = ActivityNodeAspect.heldTokens(_source_3);
      ActivityNode _source_4 = _self.getSource();
      EList<Token> _heldTokens_2 = ActivityNodeAspect.heldTokens(_source_4);
      int _size = _heldTokens_2.size();
      int _minus = (_size - 1);
      Token _get_1 = _heldTokens_1.get(_minus);
      _offeredTokens_1.add(_get_1);
    }
    EList<Offer> _offers = ActivityEdgeAspect.offers(_self);
    _offers.add(offer);
  }
  
  protected static void _privk3_clearOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    EList<Offer> _offers = ActivityEdgeAspect.offers(_self);
    _offers.clear();
  }
  
  protected static void _privk3_takeOfferedTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    final EList<Token> tokens = new BasicEList<Token>();
    EList<Offer> _offers = ActivityEdgeAspect.offers(_self);
    EList<Offer> _offers_1 = ActivityEdgeAspect.offers(_self);
    int _size = _offers_1.size();
    int _minus = (_size - 1);
    Offer _get = _offers.get(_minus);
    EList<Token> _offeredTokens = OfferAspect.offeredTokens(_get);
    tokens.addAll(_offeredTokens);
    EList<Offer> _offers_2 = ActivityEdgeAspect.offers(_self);
    EList<Offer> _offers_3 = ActivityEdgeAspect.offers(_self);
    int _size_1 = _offers_3.size();
    int _minus_1 = (_size_1 - 1);
    _offers_2.remove(_minus_1);
    ActivityNode _source = _self.getSource();
    EList<Token> _heldTokens = ActivityNodeAspect.heldTokens(_source);
    int _size_2 = _heldTokens.size();
    boolean _greaterThan = (_size_2 > 0);
    if (_greaterThan) {
      ActivityNode _source_1 = _self.getSource();
      if ((_source_1 instanceof ForkNode)) {
        ActivityNode _source_2 = _self.getSource();
        EList<Token> _heldTokens_1 = ActivityNodeAspect.heldTokens(_source_2);
        Token _get_1 = tokens.get(0);
        int indexOfToken0 = _heldTokens_1.indexOf(_get_1);
        ActivityNode _source_3 = _self.getSource();
        EList<Token> _heldTokens_2 = ActivityNodeAspect.heldTokens(_source_3);
        _heldTokens_2.remove(indexOfToken0);
      } else {
        ActivityNode _source_4 = _self.getSource();
        EList<Token> _heldTokens_3 = ActivityNodeAspect.heldTokens(_source_4);
        ActivityNode _source_5 = _self.getSource();
        EList<Token> _heldTokens_4 = ActivityNodeAspect.heldTokens(_source_5);
        int _size_3 = _heldTokens_4.size();
        int _minus_2 = (_size_3 - 1);
        _heldTokens_3.remove(_minus_2);
      }
    }
    ActivityNode _target = _self.getTarget();
    ActivityNodeAspect.addTokens(_target, tokens);
    return;
  }
  
  protected static void _privk3_transferTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    ActivityEdgeAspect.sendOffer(_self);
    ActivityEdgeAspect.takeOfferedTokens(_self);
    return;
  }
  
  protected static boolean _privk3_evaluateGuard(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    boolean _and = false;
    if (!(_self instanceof ControlFlow)) {
      _and = false;
    } else {
      BooleanVariable _guard = ((ControlFlow) _self).getGuard();
      boolean _notEquals = (!Objects.equal(_guard, null));
      _and = _notEquals;
    }
    boolean _not = (!_and);
    if (_not) {
      return true;
    }
    BooleanVariable _guard_1 = ((ControlFlow) _self).getGuard();
    BooleanVariableAspect.execute(_guard_1);
    BooleanVariable _guard_2 = ((ControlFlow) _self).getGuard();
    Value _currentValue = VariableAspect.currentValue(_guard_2);
    return ((BooleanValue) _currentValue).isValue();
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
