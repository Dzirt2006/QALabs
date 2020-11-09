package com.TheInternet.www.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.frameworks.ElementSearchers;

public class DisappearingElementsPage extends BasePage implements ElementSearchers {
	String redirect = "/disappearing_elements";
	List<WebElement> buttons;
	String xpath = "//ul/li/a";

	public DisappearingElementsPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public DisappearingElementsPage navigateTo() {
		super.navigateTo(redirect);
		return this;
	}

	public DisappearingElementsPage getAllButtons() {
		buttons = elementsByXpath(xpath, driver);
		return this;
	}

	public DisappearingElementsPage clickOn(String text) {
		System.out.println(buttons);
		Iterator<WebElement> iterator = buttons.iterator();
		while (iterator.hasNext()) {
			WebElement element = iterator.next();
			String eleText=element.getText();
			System.out.println(eleText);
			if (element.getText() == text) {
				element.click();
			}
		}
		return this;
	}

}
