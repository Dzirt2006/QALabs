package com.TheInternet.www.tests;

import org.testng.annotations.Test;

import com.TheInternet.www.pages.InputPage;

public class InputNumber extends TheInternetTestBase {
	@Test
	public void inputNumber() {
		int number = 10;
		int currentNum = new InputPage(driver, BaseUrl).navigateTo().selectElement().setInputData(number)
				.getDataFromInputField();
	}
}
