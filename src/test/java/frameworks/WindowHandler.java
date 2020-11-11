package frameworks;

import org.openqa.selenium.WebDriver;

public class WindowHandler extends BasePage {

	public WindowHandler(String url, WebDriver driver) {
		super(url, driver);
	}

	public String getCurrentWHandler() {
		return driver.getWindowHandle();
	}

	public WindowHandler switchToNextWindow() {
		for (String winHandle : driver.getWindowHandles()) {
			// switch focus of WebDriver to the next found window handle (newly opened
			// window)
			driver.switchTo().window(winHandle);
		}
		return this;
	}

	public WindowHandler closeCurrentW() {
		driver.close();
		return this;
	}

	public WindowHandler switchToW(String window) {
		driver.switchTo().window(window); // switch back to the original window
		return this;
	}

}
