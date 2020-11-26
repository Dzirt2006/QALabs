package frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ReactMenu extends Waiters, ElementSearchers {

	default void fillMenu(String textValue, WebElement menuArea, WebDriver driver) {
		String buttonXPath = "//*[text() = '" + textValue + "']";
		waitVisibility(menuArea, driver).click();
		waitVisibilityXPath(driver, buttonXPath).click();
//		elementByXpath(buttonXPath, menuArea).click();
	}
}
