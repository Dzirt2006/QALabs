package com.TheInternet.www.frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.TheInternet.www.pages.BasePage;

public class DropDownManipulations extends BasePage implements ElementSearchers {
	
	

	public DropDownManipulations(WebDriver driver, String url) {
		super(url, driver);
	}

	public DropDownManipulations navigateTo(String url) {
		super.navigateTo(url);
		return this;
	}

	public DropDownManipulations selectOptionByText(String selection, String id) {
		new Select(elementById(id, super.driver)).selectByVisibleText(selection);
		return this;
	}

	public String getSelectedOption(String id) {
		return new Select(elementById(id, super.driver)).getFirstSelectedOption().getText();
	}

}
