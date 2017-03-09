package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import com.google.common.base.Objects;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ControlTokenAspectControlTokenAspectProperties;

@Aspect(className = ControlToken.class)
@SuppressWarnings("all")
public class ControlTokenAspect {
  public static boolean isWithdrawn(final ControlToken _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ControlTokenAspectControlTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ControlTokenAspectControlTokenAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isWithdrawn(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_isWithdrawn(final ControlTokenAspectControlTokenAspectProperties _self_, final ControlToken _self) {
    EObject _eContainer = _self.eContainer();
    return Objects.equal(_eContainer, null);
  }
}
