package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Offer;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspectOfferAspectProperties;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.TokenAspect;

@Aspect(className = Offer.class)
@SuppressWarnings("all")
public class OfferAspect {
  public static boolean hasTokens1(final Offer _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspectOfferAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspectOfferAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_hasTokens1(_self_, _self);;
    return (boolean)result;
  }
  
  public static void removeWithdrawnTokens1(final Offer _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspectOfferAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspectOfferAspectContext.getSelf(_self);
    _privk3_removeWithdrawnTokens1(_self_, _self);;
  }
  
  protected static boolean _privk3_hasTokens1(final OfferAspectOfferAspectProperties _self_, final Offer _self) {
    OfferAspect.removeWithdrawnTokens1(_self);
    EList<Token> _offeredTokens = _self.getOfferedTokens();
    int _size = _offeredTokens.size();
    return (_size > 0);
  }
  
  protected static void _privk3_removeWithdrawnTokens1(final OfferAspectOfferAspectProperties _self_, final Offer _self) {
    final ArrayList<Token> tokensToBeRemoved = new ArrayList<Token>();
    EList<Token> _offeredTokens = _self.getOfferedTokens();
    final Consumer<Token> _function = (Token token) -> {
      boolean _isWithdrawn = TokenAspect.isWithdrawn(token);
      if (_isWithdrawn) {
        tokensToBeRemoved.add(token);
      }
    };
    _offeredTokens.forEach(_function);
    EList<Token> _offeredTokens_1 = _self.getOfferedTokens();
    _offeredTokens_1.removeAll(tokensToBeRemoved);
  }
}
