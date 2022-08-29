package org.definition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGen {

	
	public static void ReportCreation(String json) {
		
		File file = new File("C:\\Users\\Jasan cross\\eclipse-workspace\\CucumberReport\\target");
		Configuration con = new Configuration(file, "Cucumber-Report");
		con.addClassifications("Project Name", "Facebook");
		con.addClassifications("Module", "Login");
		con.addClassifications("Sprint", "05");
		con.addClassifications("TCNo", "TC");
		
		List<String>li = new ArrayList();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
		
	}
}
