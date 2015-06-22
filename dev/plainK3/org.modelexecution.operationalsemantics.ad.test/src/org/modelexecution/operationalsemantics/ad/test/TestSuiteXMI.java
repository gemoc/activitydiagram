package org.modelexecution.operationalsemantics.ad.test;

import activitydiagram.Activity;
import activitydiagram.Input;

public class TestSuiteXMI extends TestSuite {

	private static final String XTEXT_MODEL_DIR = "model/";
	private static final String XMI_MODEL_DIR = "model/xmi/";

	@Override
	protected Activity getActivity(String modelPath) {
		return super.getActivity(modelPath.replace(".ad", ".xmi").replace(
				XTEXT_MODEL_DIR, XMI_MODEL_DIR));
	}

	@Override
	protected Input getInput(String inputPath) {
		String inputPathXMI = null;
		if (inputPath != null) {
			inputPathXMI = inputPath.replace(".adinput", "_input.xmi").replace(
					XTEXT_MODEL_DIR, XMI_MODEL_DIR);
		}
		return super.getInput(inputPathXMI);
	}
}
