package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.KeyPressers;

public class KeyPressesPage extends BasePage implements ElementSearchers, KeyPressers {
	String url = "/key_presses";
	String resultId = "result";

	public KeyPressesPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public KeyPressesPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public String getResult() {
		return elementById(resultId, driver).getText();
	}
	
	public KeyPressesPage enterPress() {
		pressEnter();
		return this;
	}

}
