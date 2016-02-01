package org.modelexecution.operationalsemantics.ad.sequential.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramMT;

@SuppressWarnings("all")
public class SequentialActivityDiagram implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static SequentialActivityDiagram load(final String uri) {
    ResourceSet rs = new ResourceSetImpl() ;
    Resource res = rs.getResource(URI.createURI(uri), true) ;
    SequentialActivityDiagram mm = new SequentialActivityDiagram() ;
    mm.setResource(res) ;
    return mm ;
  }
  
  public SequentialActivityDiagramMT toSequentialActivityDiagramMT() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramAdapter adaptee = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}
