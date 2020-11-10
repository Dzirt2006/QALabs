package com.TheInternet.www.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.frameworks.BasePage;
import com.TheInternet.www.frameworks.ElementSearchers;
import com.TheInternet.www.frameworks.MouseActions;

public class DragNDropPage extends BasePage implements MouseActions, ElementSearchers {
	String direct = "/drag_and_drop";
	String idA = "column-a";
	String idB = "column-b";
	String aHeader = "//div[@id='column-a']/header";

	public DragNDropPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public DragNDropPage navigateTo() {
		super.navigateTo(direct);
		return this;
	}

	public DragNDropPage dragAToB() {
		System.out.println(getAHeader());
		WebElement a = elementById(idA, driver);
		WebElement b = elementById(idB, driver);
		dragNDrop(driver, b, a);
		System.out.println(getAHeader());
		return this;
	}

	public String getAHeader() {
		sleep(1000);
		return elementByXpath(aHeader, driver).getText();
	}

}
