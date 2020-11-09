package com.TheInternet.www.pages;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.frameworks.ElementSearchers;

public class EntryAddPage extends BasePage implements ElementSearchers {
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

	public EntryAddPage getAllWindows() {
		
		return this;
	}

}
