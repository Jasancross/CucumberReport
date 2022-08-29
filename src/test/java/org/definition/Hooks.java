package org.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass1 {

	
	@Before
	
	public static void beforeScenario() {
		// TODO Auto-generated method stub
		 loadwebpage("https://www.facebook.com");
	}
	
	@After
	
	public static void Afterscenario(Scenario s) {
	
		if(s.isFailed()) {
			
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "a.png");
			driver.quit();
		}
	}
	
	
}
