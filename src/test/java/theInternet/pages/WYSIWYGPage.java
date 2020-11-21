package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.BasePage;
import frameworks.ElementSearchers;

public class WYSIWYGPage extends BasePage implements ElementSearchers {
	String direction = "/tinymce";

	public WYSIWYGPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public WYSIWYGPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

}
