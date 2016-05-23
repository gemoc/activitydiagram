package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Offer;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspect;

@Aspect(className = ActivityEdge.class)
@SuppressWarnings("all")
public class ActivityEdgeAspect extends NamedElementAspect {
  public static void sendOffer1(final ActivityEdge _self, final EList<Token> tokens) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_sendOffer1(_self_, _self,tokens);;
  }
  
  public static EList<Token> takeOfferedTokens1(final ActivityEdge _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_takeOfferedTokens1(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Token>)result;
  }
  
  public static boolean hasOffer1(final ActivityEdge _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_hasOffer1(_self_, _self);;
    return (boolean)result;
  }
  
  protected static void _privk3_sendOffer1(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<Token> tokens) {
    final Offer offer = ActivitydiagramFactory.eINSTANCE.createOffer();
    final Consumer<Token> _function = (Token token) -> {
      EList<Token> _offeredTokens = offer.getOfferedTokens();
      _offeredTokens.add(token);
    };
    tokens.forEach(_function);
    EList<Offer> _offers = _self.getOffers();
    _offers.add(offer);
  }
  
  protected static EList<Token> _privk3_takeOfferedTokens1(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    final BasicEList<Token> tokens = new BasicEList<Token>();
    EList<Offer> _offers = _self.getOffers();
    final Consumer<Offer> _function = (Offer o) -> {
      EList<Token> _offeredTokens = o.getOfferedTokens();
      tokens.addAll(_offeredTokens);
    };
    _offers.forEach(_function);
    EList<Offer> _offers_1 = _self.getOffers();
    _offers_1.clear();
    return tokens;
  }
  
  protected static boolean _privk3_hasOffer1(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    EList<Offer> _offers = _self.getOffers();
    final Function1<Offer, Boolean> _function = (Offer o1) -> {
      return Boolean.valueOf(OfferAspect.hasTokens1(o1));
    };
    return IterableExtensions.<Offer>exists(_offers, _function);
  }
}
