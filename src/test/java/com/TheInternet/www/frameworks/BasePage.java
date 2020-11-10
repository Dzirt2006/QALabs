package com.TheInternet.www.frameworks;

import org.openqa.selenium.WebDriver;

public abstract class BasePage implements Waiters{
	protected WebDriver driver;
	private String baseUrl;

	public BasePage(String url, WebDriver driver) {
		this.driver = driver;
		this.baseUrl = url;
	}

	public BasePage navigateTo(String url) {
		driver.get(this.baseUrl + url);
//		driver.manage().window().maximize();
		return this;
	}

	public void disconnect() {
		driver.quit();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public BasePage refresh() {
		driver.navigate().refresh();
		return this;
	}

//	default String getSessionId(String uri) {
//		return HttpSessionId.getSessionId(uri);	
//	}

}
