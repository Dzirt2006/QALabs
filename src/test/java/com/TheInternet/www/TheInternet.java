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
		String optionForSelect = "Option 2";
		String currentOption = new DropdownListPage(driver, BaseUrl).navigateTo().selectOptionByText(optionForSelect)
				.getSelectedOption();
		Assert.assertEquals(currentOption, optionForSelect);
	}

	@Test
	public void addElements() {
		String addElementXPath = "//div[@id='content']//button[.='Add Element']";
		String urlDirect = "/add_remove_elements/";
		String deleteButtconClassName = "added-manually";
		int clicks = 10;
		int elementCount = new AddElements(driver, BaseUrl).navigateTo()
				.clickButton(clicks).elementsCount();
		System.out.println(elementCount);
		Assert.assertEquals(elementCount, clicks);
	}

	@Test
	public void removeElements() {
		String urlDirect = "/add_remove_elements/";
		String addElementXPath = "//div[@id='content']//button[.='Add Element']";
		String deleteButtonClicks = "//div[@id='elements']/button[1]";
		String deleteButtonCount = "added-manually";

		int addClicks = 10;
		int deleteClicks = 8;
		int elementCount = new AddRemoveElements(driver, BaseUrl).navigateTo()
				.clickButton( addClicks).clickDeleteButton(deleteClicks)
				.elementsCount();
		Assert.assertEquals(elementCount, addClicks - deleteClicks);

	}
	
	@Test
	public void inputNumber() {
		int number=10;
		int currentNum= new InputPage(driver,BaseUrl).navigateTo().selectElement()
				.setInputData(number).getDataFromInputField();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
