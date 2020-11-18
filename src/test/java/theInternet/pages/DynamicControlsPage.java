package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.BasePage;
import frameworks.ElementSearchers;

public class DynamicControlsPage extends BasePage implements ElementSearchers {
	String direction = "/dynamic_controls";

	public DynamicControlsPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public DynamicControlsPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public DynamicControlsPage clickAddRemove() {
		String checkBox = "//form[@id='checkbox-example']/button[@type='button']";
		WebElement checkBoxElement = elementByXpath(checkBox, driver);
		waitForClickable(driver, checkBoxElement).click();
		return this;
	}

	public DynamicControlsPage clickEnable() {
		String enable = "//form[@id='input-example']/button[@type='button']";
		elementByXpath(enable, driver).click();
		return this;
	}

	public boolean getAsyncElementsStatus() {
		String checkBox = "//input[@id='checkbox']";
		String texInpt = "//input[@type='text']";
		return waitVisibilityXPath(driver, checkBox).isDisplayed() && waitVisibilityXPath(driver, texInpt).isEnabled();
	}

}
