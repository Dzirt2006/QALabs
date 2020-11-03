package com.my_shopper.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class GoogleAuth implements Actionable {
	private String password;
	private String email;
	WebDriverWait wait = new WebDriverWait(driver, 10);
	String baseUrl = "https://my-shopper.herokuapp.com/";
	String authUrl;

	@Test
	public void f() {
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(authUrl)));
		Assert.assertEquals(getUrl(), "https://my-shopper.herokuapp.com/home#");
	}

	@BeforeMethod
	public void beforeMethod() {
		password = secret.getPassword();
		email = secret.getEmail();
		connect(baseUrl);	
		webEleByXPath("//div[@id='root']//form[@action='/auth/']//button[@type='submit']").click();
		login();
	}

	@AfterMethod
	public void afterMethod() {
		disconnect();
	}

	public void login() {
		// enter email
		WebElement email = webEleById("identifierId");
		email.sendKeys(this.email);
		webEleById("identifierNext").click();
		// enter password
		WebElement password = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html//div[@id='password']//input[@name='password']")));
		password.sendKeys(this.password);
		authUrl = getUrl();
		webEleById("passwordNext").click();
	}

}
