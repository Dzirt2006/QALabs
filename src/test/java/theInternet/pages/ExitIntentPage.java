package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.ModalWindow;
import frameworks.MouseActions;

public class ExitIntentPage extends ModalWindow implements MouseActions {

	String closeXPath = "//p[.='Close']";
	String urlDirect = "/exit_intent";

	public ExitIntentPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public ExitIntentPage navigateTo() {
		super.navigateTo(urlDirect);
		return this;
	}

	public ExitIntentPage moveMouseOnPage() {
		moveMouseOnPage(driver);
		return this;
	}

	public ExitIntentPage moveMouseOut() {
		implisitWait(driver,1000);
		moveMouseToVeiwportPane(driver);
		return this;
	}

	public boolean modalIsVisible() {
		return super.modalIsVisible(closeXPath);
	}

}
