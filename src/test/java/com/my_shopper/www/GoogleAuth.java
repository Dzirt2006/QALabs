package com.my_shopper.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class GoogleAuth implements Connectable {
	private String password;
	private String email;
	String baseUrl = "https://my-shopper.herokuapp.com/";

	@BeforeMethod
	public void beforeMethod() {
		password = secret.getPassword();
		email = secret.getEmail();
		connect(baseUrl);
		driver.findElement(By.xpath("//div[@id='root']//form[@action='/auth/']//button[@type='submit']")).click();
		login();
	}

	@AfterMethod
	public void afterMethod() {
		disconnect();
	}

	public void login() {
		// enter email
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys(this.email);
		driver.findElement(By.id("identifierNext")).click();
		// enter password
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement password = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html//div[@id='password']//input[@name='password']")));
		password.sendKeys(this.password);
		driver.findElement(By.id("passwordNext")).click();
	}

}
