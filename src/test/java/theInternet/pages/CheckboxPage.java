package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.CheckboxManipulations;

public class CheckboxPage extends CheckboxManipulations {
	String urlDirect = "/checkboxes";
	String checkbox1 = "checkbox 1";

	public CheckboxPage(WebDriver driver, String url) {
		super(driver, url);
	}

	public CheckboxPage navigateTo() {
		super.navigateTo(urlDirect);
		return this;
	}

	public boolean getCheckedByText() {
		super.getCheckedByText(checkbox1);
		return false;
	}

	public CheckboxPage clickByTextBelow() {
		super.clickByTextBelow(checkbox1);
		return this;
	}

}
