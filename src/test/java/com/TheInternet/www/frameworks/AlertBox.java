package com.TheInternet.www.frameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertBox extends BasePage {

	public AlertBox(String url, WebDriver driver) {
		super(url, driver);
	}

	public Alert switchToAlert() {
		sleep(1000);
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public void acceptAlert(Alert alert) {
		alert.accept();
	}

	public void cancelAlert(Alert alert) {
		alert.accept();
	}
}
