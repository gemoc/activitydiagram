package org.modelexecution.operationalsemantics.ad.concurrent.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	activitydiagram.ActivitydiagramPackage.eNS_URI,
    	activitydiagram.ActivitydiagramPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor concurrentActivityDiagram = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.concurrent.xdsml.ConcurrentActivityDiagram", "", "http://activitydiagram/1.0", "org.modelexecution.operationalsemantics.ad.concurrent.xdsml.ConcurrentActivityDiagramMT"
    );
    concurrentActivityDiagram.addAdapter("org.modelexecution.operationalsemantics.ad.concurrent.xdsml.ConcurrentActivityDiagramMT", org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.modelexecution.operationalsemantics.ad.concurrent.xdsml.ConcurrentActivityDiagram",
    	concurrentActivityDiagram
    );
    MelangeRegistry.ModelTypeDescriptor concurrentActivityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.concurrent.xdsml.ConcurrentActivityDiagramMT", "", "http://concurrentactivitydiagrammt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.modelexecution.operationalsemantics.ad.concurrent.xdsml.ConcurrentActivityDiagramMT",
    	concurrentActivityDiagramMT
    );
  }
}
