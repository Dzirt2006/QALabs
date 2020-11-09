package com.TheInternet.www.frameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.TheInternet.www.pages.BasePage;

public class AlertBox extends BasePage{

	
	public AlertBox(String url, WebDriver driver) {
		super(url, driver);
	}

	public Alert switchToAlert() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
