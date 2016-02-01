package org.modelexecution.operationalsemantics.ad.sequential.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramExtendedMT;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramMT;

@SuppressWarnings("all")
public class SequentialActivityDiagramExtended implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static SequentialActivityDiagramExtended load(final String uri) {
    ResourceSet rs = new ResourceSetImpl() ;
    Resource res = rs.getResource(URI.createURI(uri), true) ;
    SequentialActivityDiagramExtended mm = new SequentialActivityDiagramExtended() ;
    mm.setResource(res) ;
    return mm ;
  }
  
  public SequentialActivityDiagramMT toSequentialActivityDiagramMT() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramExtendedAdapter adaptee = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramExtendedAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
  
  public SequentialActivityDiagramExtendedMT toSequentialActivityDiagramExtendedMT() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedAdapter adaptee = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}
