package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.activitydiagrammt;

import activitydiagram.ActivitydiagramFactory;
import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.activitydiagram.sequential.ActivityDiagramMT;

@SuppressWarnings("all")
public class XActivityDiagramAdapter extends ResourceAdapter implements ActivityDiagramMT {
  public XActivityDiagramAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ActivitydiagramFactory getActivitydiagramFactory() {
    return new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.ActivitydiagramFactoryAdapter();
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
