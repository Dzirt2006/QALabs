package com.TheInternet.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class ElementsManipulation extends BasePage implements ElementSearchers {
//	rebuild it to interface

	public ElementsManipulation(WebDriver driver, String url) {
		super(url, driver);
	}

	public ElementsManipulation navigateTo(String url) {
		super.navigateTo(url);
		return this;
	}

	public ElementsManipulation click(WebElement element, int times) {
		for (int i = 0; i < times; i++) {
			try {
				element.click();
			} catch (Exception e) {

			}
		}
		return this;

	}

}
