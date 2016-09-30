package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import com.google.common.base.Objects;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectProperties;

@Aspect(className = Token.class)
@SuppressWarnings("all")
public class TokenAspect {
  public static boolean isWithdrawn(final Token _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspectTokenAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isWithdrawn(_self_, _self);;
    return (boolean)result;
  }
  
  protected static boolean _privk3_isWithdrawn(final TokenAspectTokenAspectProperties _self_, final Token _self) {
    EObject _eContainer = _self.eContainer();
    return Objects.equal(_eContainer, null);
  }
}
