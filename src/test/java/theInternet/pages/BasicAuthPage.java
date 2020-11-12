package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.BasePage;
import frameworks.ElementSearchers;


public class BasicAuthPage extends BasePage implements ElementSearchers {
	String direct = "/basic_auth";
	String baseUrl;
	String user = "admin";
	String password = "admin";
	String xpathToComplete = "//div[@id='content']//p";

	public BasicAuthPage(String url, WebDriver driver) {
		super(url, driver);
		baseUrl = url.substring(7);
	}

	public BasicAuthPage navigateTo() {
		super.navigateTo(direct);
		return this;
	}

	public BasicAuthPage login() {
		driver.get("http://" + user + ":" + password + "@" + baseUrl + direct);
		return this;
	}

	public boolean isLogedIn() {
		try {
			elementByXpath(xpathToComplete, driver);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
