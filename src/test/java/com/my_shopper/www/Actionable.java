package com.my_shopper.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Actionable extends Connectable {

	default WebElement webEleByXPath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	default WebElement webEleByCss(String cssSel) {
		return driver.findElement(By.cssSelector(cssSel));
	}

	default WebElement webEleById(String id) {
		return driver.findElement(By.id(id));
	}

	default String getUrl() {
		return driver.getCurrentUrl();
	}
	
	
}
