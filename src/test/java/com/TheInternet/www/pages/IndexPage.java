package com.TheInternet.www.pages;

import org.openqa.selenium.WebDriver;

import com.TheInternet.www.frameworks.BasePage;

public class IndexPage extends BasePage{

	public IndexPage(WebDriver driver,String url) {
		super(url,driver);
	}

	public IndexPage navigate() {
		super.navigateTo("");
		return this;
	}
}
