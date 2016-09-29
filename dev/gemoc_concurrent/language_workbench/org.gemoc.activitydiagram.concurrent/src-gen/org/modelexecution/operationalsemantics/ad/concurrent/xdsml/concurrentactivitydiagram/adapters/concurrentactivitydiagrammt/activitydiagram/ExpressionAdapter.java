package org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.activitydiagram;

import activitydiagram.Expression;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExpressionAdapter extends EObjectAdapter<Expression> implements org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Expression {
  private org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ExpressionAdapter() {
    super(org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void execute() {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ExpressionAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getExpression();
  }
}
