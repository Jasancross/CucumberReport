package org.definition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass1{

	@Given("To login the facebook url")
	public void to_login_the_facebook_url() {
	  
	}

	@When("To validate the {string} and {string}")
	public void to_validate_the_and(String username, String password) {
	   WebElement user = locators("id", "email");
	   textbox(user,username);
	   WebElement pass = locators("id", "pass");
	   textbox(pass, password);
	}

	@And("To login the webpage")
	public void to_login_the_webpage() {
	    WebElement login = locators("name","login");
	    Assert.assertTrue(true);
	    login.click();
	}

	@Then("To validate the webpage with report")
	public void to_validate_the_webpage_with_report() {
	  String title = driver.getTitle();
	  System.out.println(title);
	}



}
