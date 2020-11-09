package com.TheInternet.www.frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public interface MouseActions {
	// right click
	default void contextClick(WebDriver driver, WebElement element) {
		new Actions(driver).contextClick(element).perform();
	}

	// double click
	default void doulbeClick(WebDriver driver, WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	// drag and drop
	default void dragNDrop(WebDriver driver, WebElement from, WebElement to) {
//		new Actions(driver).dragAndDrop(from, to).build().perform();
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(from).moveByOffset(1, 1).moveToElement(to).release(to).build();
		dragAndDrop.perform();

	}

}
