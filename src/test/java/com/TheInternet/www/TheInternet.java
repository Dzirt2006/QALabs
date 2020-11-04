package com.TheInternet.www;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TheInternet {
	private WebDriver driver;
	private String BaseUrl = "http://the-internet.herokuapp.com/";

	@Test
	public void title() {
		String title = "The Internet";
		String currentTitle = new IndexPage(driver, BaseUrl).navigate().getTitle();
		Assert.assertEquals(currentTitle, title);
	}

	@Test
	public void dropdown() {
		String dropdownId = "dropdown";
		String urlDirect = "/dropdown";
		String optionForSelect = "Option 2";
		String currentOption = new DropDownManipulations(driver, BaseUrl).navigateTo(urlDirect)
				.selectOptionByText(optionForSelect, dropdownId).getSelectedOption(dropdownId);
		Assert.assertEquals(currentOption, optionForSelect);
	}

	@Test
	public void addRemoveElements() {
		String addElementXPath = "//div[@id='content']//button[.='Add Element']";
		String urlDirect = "/add_remove_elements/";
		String deleteButtconClassName = "added-manually";
		int clicks = 10;
		int elementCount = new AddRemoveElements(driver, BaseUrl).navigateTo(urlDirect)
				.clickButton(addElementXPath, clicks).elementsCount(deleteButtconClassName);
		Assert.assertEquals(elementCount, clicks);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
//		driver.close();
	}

}
