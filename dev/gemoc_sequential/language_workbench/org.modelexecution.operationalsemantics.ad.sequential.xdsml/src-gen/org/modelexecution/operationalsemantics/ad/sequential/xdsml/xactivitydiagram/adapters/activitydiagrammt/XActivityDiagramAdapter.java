package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagramMT;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramFactory;

@SuppressWarnings("all")
public class XActivityDiagramAdapter extends ResourceAdapter implements ActivityDiagramMT {
  public XActivityDiagramAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ActivitydiagramFactory getActivitydiagramFactory() {
    return new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.ActivitydiagramFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getActivitydiagramFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
