package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Containment;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputAspectInputAspectProperties;

@Aspect(className = Input.class)
@SuppressWarnings("all")
public class InputAspect {
  @Containment
  public static EList<InputValue> inputValues(final Input _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputAspectInputAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputAspectInputAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_inputValues(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue>)result;
  }
  
  @Containment
  public static void inputValues(final Input _self, final EList<InputValue> inputValues) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputAspectInputAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputAspectInputAspectContext.getSelf(_self);
    _privk3_inputValues(_self_, _self,inputValues);;
  }
  
  protected static EList<InputValue> _privk3_inputValues(final InputAspectInputAspectProperties _self_, final Input _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInputValues") &&
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
    return _self_.inputValues;
  }
  
  protected static void _privk3_inputValues(final InputAspectInputAspectProperties _self_, final Input _self, final EList<InputValue> inputValues) {
    _self_.inputValues = inputValues; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInputValues")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, inputValues);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
