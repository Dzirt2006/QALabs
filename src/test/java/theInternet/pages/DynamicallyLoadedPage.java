package theInternet.pages;

import org.openqa.selenium.WebDriver;


import frameworks.BasePage;
import frameworks.ElementSearchers;

public class DynamicallyLoadedPage extends BasePage implements ElementSearchers {
	String urlDirect = "/dynamic_loading";

	public DynamicallyLoadedPage(String url, WebDriver driver) {
		super(url, driver);

	}

	public DynamicallyLoadedPage navigateTo() {
		super.navigateTo(urlDirect);
		return this;
	}

	public DynamicallyLoadedPage goToExample1() {
		elementByXpath("//div[@id='content']//a[@href='/dynamic_loading/1']", driver).click();
		return this;
	}

	public DynamicallyLoadedPage goToExample2() {
		elementByXpath("//div[@id='content']//a[@href='/dynamic_loading/1']", driver).click();
		return this;
	}

	public DynamicallyLoadedPage exampleStart() {
		elementByXpath("//div[@id='start']/button[.='Start']", driver).click();
		return this;
	}

	public boolean getExampleResult() {
		return waitVisibility(driver, "//div[@id='finish']/h4[.='Hello World!']").isDisplayed();
	}

}
