package org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram;

import activitydiagram.Expression;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class ExpressionAdapter extends EObjectAdapter<Expression> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Expression {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ExpressionAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getExpression();
  }
}
