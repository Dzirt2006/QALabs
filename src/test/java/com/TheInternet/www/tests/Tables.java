package com.TheInternet.www.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TheInternet.www.pages.TablePage;

public class Tables extends TheInternetTestBase {
	@Test
	public void inputNumber() {
		TablePage tableP=new TablePage(driver, BaseUrl);
		String row0 = tableP.navigateTo().getTable().getAllDataFromTheTable().getRow(0);
		String sorted = tableP.clickOnHeader().getAllDataFromTheTable()
				.getRow(0);
		tableP.getCell();

		Assert.assertNotEquals(row0, sorted);

	}
}
