package com.TheInternet.www.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TheInternet.www.pages.TablePage;

public class Tables extends TheInternetTestBase {
	@Test
	public void inputNumber() {
		int number = 10;
		String row0 = new TablePage(driver, BaseUrl).navigateTo().getTable().getAllDataFromTheTable().getRow(0);
		String sorted = new TablePage(driver, BaseUrl).navigateTo().getTable().clickOnHeader().getAllDataFromTheTable()
				.getRow(0);

		Assert.assertNotEquals(row0, sorted);

	}
}
