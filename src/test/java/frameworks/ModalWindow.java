package frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class ModalWindow extends BasePage implements ElementSearchers {

	public ModalWindow(String url, WebDriver driver) {
		super(url, driver);
	}

	public abstract ModalWindow navigateTo();

	public void closeModalWindow(String closeXPath) {
		WebElement close = waitVisibilityXPath(driver, closeXPath);
		close.click();
	}

	public boolean modalIsVisible(String closeXPath) {
		return waitVisibilityXPath(driver, closeXPath).isDisplayed();
	}

	public void reenableModal(String clickable) {

		WebElement activate = waitForClickable(driver, elementByXpath(clickable, driver));
		if (activate.isEnabled()) {
			activate.click();
		} else {
			activate.click();
		}
	}

}
