package org.gemoc.activitydiagram.concurrent.k3dsa.utils

import activitydiagram.Input
import org.eclipse.xtext.resource.XtextResourceSet
import activitydiagram.InputValue
import java.util.List
import java.util.ArrayList
import org.eclipse.emf.common.util.URI
import java.io.File

class Util {
	public static final Object LINE_BREAK = System.getProperty("line.separator");

	public static final  def Input getInput(String inputPath) {
		var Input input = null;
		if (inputPath != null) {
			var XtextResourceSet resourceSet ;resourceSet = new XtextResourceSet();
			var resource = resourceSet.getResource(createFileURI(inputPath), true);
			var eObject = resource.getContents().get(0);
			if (eObject instanceof Input) {
				input = eObject as Input;
			}
		}
		return input;
	}
	
	public static final	def List<InputValue> getInputValues(String inputPath) {
		var inputValues = new ArrayList<InputValue>();
		var input = Util.getInput(inputPath);
		if (input != null) {
			inputValues.addAll(input.getInputValues());
		}
		return inputValues;
	}
	
	public static final  def URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}
	public static final  def File createFile(String path) {
		return new File(path);
	}
}