package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.melange.annotation.Containment;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect;

@Aspect(className = ActivityNode.class)
@SuppressWarnings("all")
public class ActivityNodeAspect extends NamedElementAspect {
  @OverrideAspectMethod
  @Step
  public static void execute(final ActivityNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_,
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_,
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityFinalNodeAspect.execute(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_,
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_,
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_,
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "ActivityNode", "execute");
		} else {
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  @Step
  public static void terminate(final ActivityNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_terminate(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "ActivityNode", "terminate");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static boolean isReady(final ActivityNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isReady(_self_, _self);
	;
	return (boolean) result;
}
  
  @Step
  public static void sendOffers(final ActivityNode _self, final EList<Token> tokens) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspect.sendOffers((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode)_self,tokens);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_sendOffers(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)_self,tokens);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"ActivityNode","sendOffers");
    					} else {
    						command.execute();
    					}
    					;
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @Step
  public static EList<Token> takeOfferdTokens(final ActivityNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	Object result = null;
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			addToResult(_privk3_takeOfferdTokens(_self_, _self));
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "ActivityNode", "takeOfferdTokens");
	} else {
		command.execute();
	}
	result = command.getResult();
	;
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Step
  public static void addTokens(final ActivityNode _self, final EList<Token> tokens) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_addTokens(_self_, _self,tokens);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"ActivityNode","addTokens");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static boolean hasOffers(final ActivityNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_,
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspect
				.hasOffers((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspect
				.hasOffers((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  @Step
  public static void removeToken1(final ActivityNode _self, final Token token) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_removeToken1(_self_, _self, token);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "ActivityNode", "removeToken1");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Containment
  public static EList<Token> heldTokens(final ActivityNode _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_heldTokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void heldTokens(final ActivityNode _self, final EList<Token> heldTokens) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_heldTokens(_self_, _self,heldTokens);;
  }
  
  private static void super_execute(final ActivityNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
  }
  
  protected static void _privk3_terminate(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    _self.setRunning(false);
  }
  
  protected static boolean _privk3_isReady(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    return _self.isRunning();
  }
  
  protected static void _privk3_sendOffers(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final EList<Token> tokens) {
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    for (final ActivityEdge edge : _outgoing) {
      ActivityEdgeAspect.sendOffer(edge, tokens);
    }
  }
  
  protected static EList<Token> _privk3_takeOfferdTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    final BasicEList<Token> allTokens = new BasicEList<Token>();
    EList<ActivityEdge> _incoming = _self.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      {
        final EList<Token> tokens = ActivityEdgeAspect.takeOfferedTokens(edge);
        for (final Token token : tokens) {
          ActivityNodeAspect.heldTokens(_self).add(token);
        }
        allTokens.addAll(tokens);
      }
    }
    return allTokens;
  }
  
  protected static void _privk3_addTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final EList<Token> tokens) {
    for (final Token token : tokens) {
      ActivityNodeAspect.heldTokens(_self).add(token);
    }
  }
  
  protected static boolean _privk3_hasOffers(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    boolean hasOffer = true;
    EList<ActivityEdge> _incoming = _self.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      boolean _hasOffer = ActivityEdgeAspect.hasOffer(edge);
      boolean _not = (!_hasOffer);
      if (_not) {
        hasOffer = false;
      }
    }
    return hasOffer;
  }
  
  protected static void _privk3_removeToken1(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final Token token) {
    ActivityNodeAspect.heldTokens(_self).remove(token);
  }
  
  protected static EList<Token> _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHeldTokens") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.heldTokens;
  }
  
  protected static void _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final EList<Token> heldTokens) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHeldTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, heldTokens);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.heldTokens = heldTokens;
    }
  }
}
