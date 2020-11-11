package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.ElementSearchers;
import frameworks.WindowHandler;

public class OpeningnWindowPage extends WindowHandler implements ElementSearchers {
	String direction = "/windows";
	String newWindowButton = "//div[@id='content']//a";
	String parentW;

	public OpeningnWindowPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public OpeningnWindowPage openNewW() {
		elementByXpath(newWindowButton, driver).click();
		return this;
	}

	public OpeningnWindowPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public OpeningnWindowPage getCurrentWindow() {
		parentW = super.getCurrentWHandler();
		return this;
	}

	public OpeningnWindowPage switchToNextWindow() {
		super.switchToNextWindow();
		return this;
	}

	public OpeningnWindowPage closeCurrentW() {
		super.closeCurrentW();
		return this;
	}

	public OpeningnWindowPage switchToParent() {
		driver.switchTo().window(parentW); // switch back to the original window
		return this;
	}

}
