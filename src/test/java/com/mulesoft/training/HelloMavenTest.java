package com.mulesoft.training;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

	@Override
	protected String getConfigFile(){
		return "advancedtraining.xml";
	}
	
	@Test
	public void mavenFlowReturnsHelloMaven() throws Exception{
		runFlowAndExpect("mavenFlow", "Hello Maven");
	}
}
