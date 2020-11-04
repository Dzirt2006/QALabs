package com.TheInternet.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.HttpSessionId;

public class BasePage {
	protected WebDriver driver;
	private String baseUrl;

	public BasePage(String url, WebDriver driver) {
		this.driver = driver;
		this.baseUrl = url;
	}

	public BasePage navigateTo(String url) {
		driver.get(this.baseUrl + url);
		return this;
	}

	public void disconnect() {
		driver.quit();
	}

	public String getTitle() {
		return driver.getTitle();
	}
//	default String getSessionId(String uri) {
//		return HttpSessionId.getSessionId(uri);	
//	}

}
