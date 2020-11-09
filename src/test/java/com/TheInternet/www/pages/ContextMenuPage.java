package com.TheInternet.www.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TheInternet.www.frameworks.AlertBox;
import com.TheInternet.www.frameworks.MouseActions;
import com.TheInternet.www.frameworks.ElementSearchers;

public class ContextMenuPage extends AlertBox implements MouseActions, ElementSearchers {
	String url = "/context_menu";
	String id = "hot-spot";

	public ContextMenuPage(String bUrl, WebDriver driver) {
		super(bUrl, driver);
	}

	public ContextMenuPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public ContextMenuPage clickOnBox() {
		WebElement box = elementById(id, driver);
		contextClick(driver, box);
		return this;
	}

	public boolean isAlert() {
		Alert alert = super.switchToAlert();
		return alert == null ? false : true;
	}

}
