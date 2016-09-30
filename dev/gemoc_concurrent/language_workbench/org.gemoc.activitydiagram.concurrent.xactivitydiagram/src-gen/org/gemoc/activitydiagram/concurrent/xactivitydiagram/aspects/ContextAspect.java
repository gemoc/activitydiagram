package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InputValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties;

@Aspect(className = Context.class)
@SuppressWarnings("all")
public class ContextAspect {
  public static Trace output(final Context _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_output(_self_, _self);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace)result;
  }
  
  public static void output(final Context _self, final Trace output) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    _privk3_output(_self_, _self,output);;
  }
  
  public static Activity activity(final Context _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_activity(_self_, _self);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Activity)result;
  }
  
  public static void activity(final Context _self, final Activity activity) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    _privk3_activity(_self_, _self,activity);;
  }
  
  public static Context parent(final Context _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_parent(_self_, _self);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context)result;
  }
  
  public static void parent(final Context _self, final Context parent) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    _privk3_parent(_self_, _self,parent);;
  }
  
  public static EList<InputValue> inputValues(final Context _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_inputValues(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InputValue>)result;
  }
  
  public static void inputValues(final Context _self, final EList<InputValue> inputValues) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    _privk3_inputValues(_self_, _self,inputValues);;
  }
  
  public static JoinNode node(final Context _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_node(_self_, _self);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.JoinNode)result;
  }
  
  public static void node(final Context _self, final JoinNode node) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectContext.getSelf(_self);
    _privk3_node(_self_, _self,node);;
  }
  
  protected static Trace _privk3_output(final ContextAspectContextAspectProperties _self_, final Context _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOutput") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.output;
  }
  
  protected static void _privk3_output(final ContextAspectContextAspectProperties _self_, final Context _self, final Trace output) {
    _self_.output = output; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOutput")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, output);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static Activity _privk3_activity(final ContextAspectContextAspectProperties _self_, final Context _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getActivity") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Activity) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.activity;
  }
  
  protected static void _privk3_activity(final ContextAspectContextAspectProperties _self_, final Context _self, final Activity activity) {
    _self_.activity = activity; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setActivity")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, activity);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static Context _privk3_parent(final ContextAspectContextAspectProperties _self_, final Context _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getParent") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.parent;
  }
  
  protected static void _privk3_parent(final ContextAspectContextAspectProperties _self_, final Context _self, final Context parent) {
    _self_.parent = parent; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setParent")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, parent);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static EList<InputValue> _privk3_inputValues(final ContextAspectContextAspectProperties _self_, final Context _self) {
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
  
  protected static void _privk3_inputValues(final ContextAspectContextAspectProperties _self_, final Context _self, final EList<InputValue> inputValues) {
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
  
  protected static JoinNode _privk3_node(final ContextAspectContextAspectProperties _self_, final Context _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getNode") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.JoinNode) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.node;
  }
  
  protected static void _privk3_node(final ContextAspectContextAspectProperties _self_, final Context _self, final JoinNode node) {
    _self_.node = node; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setNode")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, node);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
