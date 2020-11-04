package com.TheInternet.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

interface ElementSearchers {
	default WebElement elementByXpath(String xpath, WebDriver driver) {
		return driver.findElement(By.xpath(xpath));
	}

	default WebElement elementByCss(String cssSel, WebDriver driver) {
		return driver.findElement(By.cssSelector(cssSel));
	}

	default WebElement elementById(String id, WebDriver driver) {
		return driver.findElement(By.id(id));
	}
	
	default WebElement elementByClass(String className, WebDriver driver) {
		return driver.findElement(By.className(className));
	}

	default List<WebElement> elementsByXpath(String xpath, WebDriver driver) {
		return driver.findElements(By.xpath(xpath));
	}

	default List<WebElement> elementsByCss(String cssSel, WebDriver driver) {
		return driver.findElements(By.cssSelector(cssSel));
	}

	default List<WebElement> elementsById(String id, WebDriver driver) {
		return driver.findElements(By.id(id));
	}
	default List<WebElement> elementsByClass(String className, WebDriver driver) {
		return driver.findElements(By.className(className));
	}

	default String getUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
}
