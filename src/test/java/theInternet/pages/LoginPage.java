package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import theInternet.tests.Login;
import theInternet.tests.TheInternetTestBase;

public class LoginPage extends BasePage implements ElementSearchers {

	String direction = "/login";
	String userId = "username";
	String passwordId = "password";
	String buttonXPath = "//form[@id='login']/button[@class='radius']";

	public LoginPage(String url, WebDriver driver) {
		super(url, driver);
		// TODO Auto-generated constructor stub
	}

	public LoginPage navigateTo() {
		// TODO Auto-generated method stub
		super.navigateTo(direction);
		return this;
	}

	public LoginPage enterAndSubmitData(String user, String password) {
		elementById(userId, driver).sendKeys(user);
		elementById(passwordId, driver).sendKeys(password);
		elementByXpath(buttonXPath, driver).click();
		sleep(1000);
		return this;
	}

}
