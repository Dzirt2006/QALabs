package com.TheInternet.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class AddRemoveElements extends ElementsManipulation{

	String urlDirect = "/add_remove_elements/";
	String addElementXPath = "//div[@id='content']//button[.='Add Element']";
	String deleteButtonClicks = "//div[@id='elements']/button[1]";
	String deleteButtonClassName = "added-manually";
	

	public AddRemoveElements(WebDriver driver, String url) {
		super(driver, url);
	}

	public AddRemoveElements navigateTo() {
		super.navigateTo(this.urlDirect);
		return this;
	}


	public AddRemoveElements clickButton(int clicks) {
		WebElement button = this.elementByXpath(this.addElementXPath, driver);
		super.click(button, clicks);
		return this;
	}
//polish it
	public AddRemoveElements clickDeleteButton(int clicks) {
		for (int i = 0; i < clicks; i++) {
			try {
				WebElement button = this.elementByXpath(this.deleteButtonClicks, driver);
				button.click();
			} catch (Exception e) {

			}
		}
		return this;
	}

	public int elementsCount() {
		return this.elementsByClass(this.deleteButtonClassName, driver).size();
	}


}
