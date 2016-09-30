package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspectTraceAspectProperties;

@Aspect(className = Trace.class)
@SuppressWarnings("all")
public class TraceAspect {
  public static EList<ActivityNode> executedNodes(final Trace _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspectTraceAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspectTraceAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_executedNodes(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode>)result;
  }
  
  public static void executedNodes(final Trace _self, final EList<ActivityNode> executedNodes) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspectTraceAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspectTraceAspectContext.getSelf(_self);
    _privk3_executedNodes(_self_, _self,executedNodes);;
  }
  
  protected static EList<ActivityNode> _privk3_executedNodes(final TraceAspectTraceAspectProperties _self_, final Trace _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getExecutedNodes") &&
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
    return _self_.executedNodes;
  }
  
  protected static void _privk3_executedNodes(final TraceAspectTraceAspectProperties _self_, final Trace _self, final EList<ActivityNode> executedNodes) {
    _self_.executedNodes = executedNodes; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setExecutedNodes")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, executedNodes);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
