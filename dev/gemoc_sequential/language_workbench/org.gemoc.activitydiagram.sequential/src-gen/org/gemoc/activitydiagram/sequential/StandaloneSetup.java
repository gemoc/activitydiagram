package org.gemoc.activitydiagram.sequential;

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
    	org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eNS_URI,
    	org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
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
    	"org.gemoc.activitydiagram.sequential.ActivityDiagram", "", "http://activitydiagram/1.0", "org.gemoc.activitydiagram.sequential.ActivityDiagramMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.activitydiagram.sequential.ActivityDiagram",
    	activityDiagram
    );
    MelangeRegistry.LanguageDescriptor xActivityDiagram = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.XActivityDiagram", "", "http://org.gemoc.activitydiagram.sequential.xactivitydiagram/activitydiagram/", "org.gemoc.activitydiagram.sequential.XActivityDiagramMT"
    );
    xActivityDiagram.addAdapter("org.gemoc.activitydiagram.sequential.ActivityDiagramMT", org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.activitydiagrammt.XActivityDiagramAdapter.class);
    xActivityDiagram.addAdapter("org.gemoc.activitydiagram.sequential.XActivityDiagramMT", org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.activitydiagram.sequential.XActivityDiagram",
    	xActivityDiagram
    );
    MelangeRegistry.ModelTypeDescriptor activityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.ActivityDiagramMT", "", "http://org.gemoc.activitydiagram.sequential.activitydiagrammt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.activitydiagram.sequential.ActivityDiagramMT",
    	activityDiagramMT
    );
    MelangeRegistry.ModelTypeDescriptor xActivityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.activitydiagram.sequential.XActivityDiagramMT", "", "http://org.gemoc.activitydiagram.sequential.xactivitydiagrammt/"
    );
    xActivityDiagramMT.addSuperType("org.gemoc.activitydiagram.sequential.ActivityDiagramMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.activitydiagram.sequential.XActivityDiagramMT",
    	xActivityDiagramMT
    );
  }
}
