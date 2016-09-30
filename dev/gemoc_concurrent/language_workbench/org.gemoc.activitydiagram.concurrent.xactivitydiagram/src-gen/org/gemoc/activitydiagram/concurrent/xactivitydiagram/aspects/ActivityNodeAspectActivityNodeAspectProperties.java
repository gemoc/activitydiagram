package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ActivityNodeAspectActivityNodeAspectProperties {
  public EList<Token> heldTokens = new BasicEList<Token>();
  
  public Boolean running;
}
