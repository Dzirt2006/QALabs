package com.TheInternet.www.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TheInternetTestBase {
	protected WebDriver driver;
	protected String BaseUrl = "http://the-internet.herokuapp.com/";

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
