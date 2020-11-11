package theInternet.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import frameworks.AlertBox;
import frameworks.ElementSearchers;

public class JSAlertsPage extends AlertBox implements ElementSearchers {
	String url = "/javascript_alerts";
	Alert alert;

	public JSAlertsPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public JSAlertsPage clickOnJSAlerts() {
		elementByXpath("//button[.='Click for JS Alert']", driver).click();
		return this;
	}

	public JSAlertsPage clickOnJSConfirm() {
		elementByXpath("//button[.='Click for JS Confirm']", driver).click();
		return this;
	}

	public JSAlertsPage clickOnJSPrompt() {
		elementByXpath("//button[.='Click for JS Prompt']", driver).click();
		return this;
	}

	public String checkResult() {
		return elementById("result", driver).getText();
	}

	public JSAlertsPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public JSAlertsPage pickAlert() {
		alert = super.switchToAlert();
		return this;
	}

	public JSAlertsPage acceptAlert() {
		super.acceptAlert(alert);
		return this;
	}

	public JSAlertsPage cancelAlert() {
		super.cancelAlert(alert);
		return this;
	}

	public JSAlertsPage sendPrompt(String prompt) {
		super.sendPrompt(alert, prompt);
		return this;
	}

}
