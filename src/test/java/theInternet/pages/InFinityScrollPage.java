package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.ScroolActions;

public class InFinityScrollPage extends BasePage implements ScroolActions, ElementSearchers {
	String url = "/infinite_scroll";
	WebElement footer;

	public InFinityScrollPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public InFinityScrollPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public InFinityScrollPage getFooter() {
		footer = elementByXpath("//*[@id=\"page-footer\"]/div/div", driver);
		return this;
	}

	public boolean footerIsDisplayed() {
		return footer.isEnabled();
	}

	public InFinityScrollPage scrollDown() {
		scrollingDown(driver);
		return this;
	}

}
