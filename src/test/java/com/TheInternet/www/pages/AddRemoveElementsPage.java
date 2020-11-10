package com.TheInternet.www.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.frameworks.ElementsManipulation;

public class AddRemoveElementsPage extends ElementsManipulation {

	String urlDirect = "/add_remove_elements/";
	String addElementXPath = "//div[@id='content']//button[.='Add Element']";
	String deleteButtonClicks = "//div[@id='elements']/button[1]";
	String deleteButtonClassName = "added-manually";

	public AddRemoveElementsPage(WebDriver driver, String url) {
		super(driver, url);
	}

	public AddRemoveElementsPage navigateTo() {
		super.navigateTo(this.urlDirect);
		return this;
	}

	public AddRemoveElementsPage clickButton(int clicks) {
		WebElement button = this.elementByXpath(this.addElementXPath, driver);
		super.click(button, clicks);
		return this;
	}

//polish it
	public AddRemoveElementsPage clickDeleteButton(int clicks) {
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
		return elementsByClass(deleteButtonClassName, driver).size();
	}

}
