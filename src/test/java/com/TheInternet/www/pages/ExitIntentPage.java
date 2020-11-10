package com.TheInternet.www.pages;

import org.openqa.selenium.WebDriver;

import com.TheInternet.www.frameworks.ModalWindow;
import com.TheInternet.www.frameworks.MouseActions;

public class ExitIntentPage extends ModalWindow implements MouseActions {

	String closeXPath = "//p[.='Close']";
	String urlDirect = "/exit_intent";

	public ExitIntentPage(String url, WebDriver driver) {
		super(url, driver);
		// TODO Auto-generated constructor stub
	}

	public ExitIntentPage navigateTo() {
		// TODO Auto-generated method stub
		super.navigateTo(urlDirect);
		return this;
	}

	public ExitIntentPage moveMouseOnPage() {
		moveMouseOnPage(driver);
		return this;
	}

	public ExitIntentPage moveMouseOut() {
		sleep(3000);
		moveMouseToVeiwportPane(driver);
		return this;
	}

	public boolean modalIsVisible() {
		return super.modalIsVisible(closeXPath);
	}

}
