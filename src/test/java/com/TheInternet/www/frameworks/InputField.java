package com.TheInternet.www.frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.pages.BasePage;

public abstract class InputField extends BasePage implements ElementSearchers {

	public InputField(WebDriver driver, String url) {
		super(url, driver);
	}

	public abstract InputField navigateTo();

	public void setText(WebElement mappedElement, String expectedInput) {
		mappedElement.sendKeys(expectedInput);
	}

	public WebElement selectElement(String xpath) {
		WebElement mappedElement = elementByXpath(xpath, driver);
		return mappedElement;
	}

	public void setInputData(WebElement mappedElement, int number) {
		mappedElement.sendKeys(number + "");
	}

	public void setInputData(WebElement mappedElement, String phrase) {
		mappedElement.sendKeys(phrase);
	}

	public String getDataFromInputField(WebElement mappedElement) {
		return mappedElement.getAttribute("value");
	}

}
