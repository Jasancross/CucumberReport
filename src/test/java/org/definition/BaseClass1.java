package org.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	static WebDriver driver;	

	public static void loadwebpage(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static WebElement locators(String locator, String value) {
		switch (locator) {
		case "id":{
			WebElement findElement = driver.findElement(By.id(value));
			return findElement; }
		
		case "name":{
			WebElement findElement = driver.findElement(By.name(value));
			return findElement;
		}	
			default:
			WebElement findElement = driver.findElement(By.xpath(value));
			return findElement;
		}}
	public static void textbox(WebElement element, String textbox) {
		// TODO Auto-generated method stub
		element.sendKeys(textbox);
	}



}