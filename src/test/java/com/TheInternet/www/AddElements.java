package com.TheInternet.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class AddElements extends ElementsManipulation {
	
	String addElementXPath = "//div[@id='content']//button[.='Add Element']";
	String urlDirect = "/add_remove_elements/";
	String deleteButtconClassName = "added-manually";
	

	public AddElements(WebDriver driver, String url) {
		super(driver, url);
	}

	public AddElements navigateTo() {
		super.navigateTo(this.urlDirect);
		return this;
	}


	public AddElements clickButton(int clicks) {
		WebElement button = this.elementByXpath(this.addElementXPath, driver);
		super.click(button, clicks);
		return this;
	}
////polish it
//	public AddElements clickDeleteButton(int clicks) {
//		for (int i = 0; i < clicks; i++) {
//			try {
//				WebElement button = this.elementByXpath(elementByXpath, driver);
//				button.click();
//			} catch (Exception e) {
//
//			}
//		}
//		return this;
//	}

	public int elementsCount() {
		return this.elementsByClass(this.deleteButtconClassName, driver).size();
	}

}
