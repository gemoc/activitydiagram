package org.modelexecution.operationalsemantics.ad.sequential.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagramMT;

@SuppressWarnings("all")
public class ActivityDiagram implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static ActivityDiagram load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    ActivityDiagram mm = new ActivityDiagram();
    mm.setResource(res);
    return mm ;
  }
  
  public ActivityDiagramMT toActivityDiagramMT() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramAdapter adaptee = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
