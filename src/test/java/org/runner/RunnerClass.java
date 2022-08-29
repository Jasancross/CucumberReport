package org.runner;

import org.definition.ReportGen;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Jasan cross\\eclipse-workspace\\CucumberReport\\src\\test\\resources\\facebook.feature",
glue="org.definition",
plugin="json:C:\\Users\\Jasan cross\\eclipse-workspace\\CucumberReport\\target\\ReportGen.json")




public class RunnerClass {
	
	@AfterClass
	
	public static void report() {
		// TODO Auto-generated method stub
		ReportGen.ReportCreation("C:\\Users\\Jasan cross\\eclipse-workspace\\CucumberReport\\target\\ReportGen.json");
	}

}
