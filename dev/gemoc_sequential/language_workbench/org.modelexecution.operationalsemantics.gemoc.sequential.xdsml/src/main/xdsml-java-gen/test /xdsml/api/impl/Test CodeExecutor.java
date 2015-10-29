/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, disable the generation in the BuildOptions of the project.xdsml */
package test .xdsml.api.impl;
import org.gemoc.executionengine.ccsljava.engine.dsa.executors.CodeExecutorDispatcher;
public class Test CodeExecutor extends CodeExecutorDispatcher 
		implements org.gemoc.gemoc_language_workbench.extensions.k3.dsa.api.IK3DSAExecutorClassLoader  {
	public Test CodeExecutor(){
	    // add K3 DSA specific executor
		addExecutor(new org.gemoc.gemoc_language_workbench.extensions.k3.dsa.impl.Kermeta3AspectsCodeExecutor(this,
			"org.modelexecution.operationalsemantics.gemoc.sequential.dynamic"));
		// fall back executor : search classic java method
		addExecutor(new org.gemoc.executionengine.ccsljava.engine.dsa.executors.JavaCodeExecutor());
	}
	public String getDSAProjectName(){
		//TODO please implement
		return "";
	}
   @Override
	public Class<?> getClassForName(String className) throws ClassNotFoundException {
		return Class.forName(className);
	}
	@Override
	public java.io.InputStream getResourceAsStream(String resourceName) {
		//this.getClass().getResourceAsStream(resourceName);
		return Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName);
	}
}