package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.InputPage;

public class InputNumber extends TheInternetTestBase {
	@Test
	public void inputNumber() {
		int number = 10;
		int currentNum = new InputPage(driver, BaseUrl).navigateTo().selectElement().setInputData(number)
				.getDataFromInputField();
		Assert.assertNotEquals(currentNum, number);
	}
}
