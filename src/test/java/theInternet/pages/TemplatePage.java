package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.BasePage;

public class TemplatePage extends BasePage {
	String direction = "";

	public TemplatePage(String url, WebDriver driver) {
		super(url, driver);
	}

	public TemplatePage navigateTo(String url) {
		super.navigateTo(direction);
		return this;
	}

}
