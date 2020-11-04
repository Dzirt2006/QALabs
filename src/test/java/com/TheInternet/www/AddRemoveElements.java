package com.TheInternet.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class AddRemoveElements extends ElementsManipulation {

	public AddRemoveElements(WebDriver driver, String url) {
		super(driver, url);
	}

	public AddRemoveElements navigateTo(String url) {
		super.navigateTo(url);
		return this;
	}

//	public WebElement getButton() {
//		return this.elementByXpath(addElementXPath, driver);
//	}
//	
//	/**
//	 * connect function above and below
//	 */
//
//	public AddRemoveElements click(WebElement button, int times) {
//		super.click(button, 10);
//		return this;
//	}

	public AddRemoveElements clickButton(String addElementXPath, int clicks) {
		WebElement button = this.elementByXpath(addElementXPath, driver);
		super.click(button, clicks);
		return this;
	}

	public int elementsCount(String deleteButtconClassName) {
		return this.elementsByClass(deleteButtconClassName, driver).size();
	}

}
