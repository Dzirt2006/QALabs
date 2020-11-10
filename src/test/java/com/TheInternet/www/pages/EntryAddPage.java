package com.TheInternet.www.pages;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TheInternet.www.frameworks.BasePage;
import com.TheInternet.www.frameworks.ElementSearchers;

public class EntryAddPage extends BasePage implements ElementSearchers {
	String closeXPath = "//p[.='Close']";
	String clickable = "//a[@id='restart-ad']";

	public EntryAddPage(String url, WebDriver driver) {
		super(url, driver);
		// TODO Auto-generated constructor stub
	}

	String redirect = "/entry_ad";
	List<WebElement> windows;

	public EntryAddPage navigateTo() {
		super.navigateTo(redirect);
		return this;
	}

	public EntryAddPage refresh() {
		// TODO Auto-generated method stub
		super.refresh();
		return this;
	}

	public EntryAddPage closeModalWindow() {
		WebElement close = new WebDriverWait(driver, 3000)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(closeXPath)));
		close.click();
		return this;
	}

	public boolean modalIsVisible() {
		return new WebDriverWait(driver, 3000)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(closeXPath))).isDisplayed();
	}

	public EntryAddPage reenableModal() {
		elementByXpath(clickable, driver).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

}
