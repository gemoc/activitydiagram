package org.modelexecution.operationalsemantics.ad.sequential.xdsml;

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
    EPackage.Registry.INSTANCE.put(
    	org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eNS_URI,
    	org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor activityDiagram = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagram", "", "http://activitydiagram/1.0", "org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagramMT"
    );
    activityDiagram.addAdapter("org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagramMT", org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagram",
    	activityDiagram
    );
    MelangeRegistry.LanguageDescriptor xActivityDiagram = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.XActivityDiagram", "", "http://xactivitydiagram/activitydiagram/", "org.modelexecution.operationalsemantics.ad.sequential.xdsml.XActivityDiagramMT"
    );
    xActivityDiagram.addAdapter("org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagramMT", org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.XActivityDiagramAdapter.class);
    xActivityDiagram.addAdapter("org.modelexecution.operationalsemantics.ad.sequential.xdsml.XActivityDiagramMT", org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.XActivityDiagram",
    	xActivityDiagram
    );
    MelangeRegistry.ModelTypeDescriptor activityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagramMT", "", "http://activitydiagrammt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagramMT",
    	activityDiagramMT
    );
    MelangeRegistry.ModelTypeDescriptor xActivityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.XActivityDiagramMT", "", "http://xactivitydiagrammt/"
    );
    xActivityDiagramMT.addSuperType("org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagramMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.XActivityDiagramMT",
    	xActivityDiagramMT
    );
  }
}
