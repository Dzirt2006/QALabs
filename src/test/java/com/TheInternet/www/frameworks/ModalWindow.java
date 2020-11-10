package com.TheInternet.www.frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.pages.EntryAddPage;

public abstract class ModalWindow extends BasePage implements ElementSearchers {

	public ModalWindow(String url, WebDriver driver) {
		super(url, driver);
		// TODO Auto-generated constructor stub
	}

	public abstract ModalWindow navigateTo();

	public void closeModalWindow(String closeXPath) {
		WebElement close = waitVisibility(driver, closeXPath);
		close.click();
	}

	public boolean modalIsVisible(String closeXPath) {
		return waitVisibility(driver, closeXPath).isDisplayed();
	}

	public void reenableModal(String clickable) {
		sleep(3000);
		WebElement activate = elementByXpath(clickable, driver);
		if (activate.isDisplayed() && activate.isEnabled()) {
			activate.click();
		} else {
			sleep(1500);
			activate.click();
		}
	}

}
