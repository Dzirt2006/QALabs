package com.TheInternet.www;

import org.openqa.selenium.WebDriver;

class IndexPage extends BasePage{

	public IndexPage(WebDriver driver,String url) {
		super(url,driver);
	}

	public IndexPage navigate() {
		super.navigateTo("");
		return this;
	}
}
