package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.BasePage;
import frameworks.ElementSearchers;

public class LoginPage extends BasePage implements ElementSearchers {

	String direction = "/login";
	String userId = "username";
	String passwordId = "password";
	String buttonXPath = "//form[@id='login']/button[@class='radius']";

	public LoginPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public LoginPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public LoginPage enterAndSubmitData(String user, String password) {
		elementById(userId, driver).sendKeys(user);
		elementById(passwordId, driver).sendKeys(password);
		elementByXpath(buttonXPath, driver).click();
//		implisitWait(driver,1000)
		return this;
	}

}
