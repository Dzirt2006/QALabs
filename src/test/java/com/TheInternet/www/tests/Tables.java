package com.TheInternet.www.tests;

import org.testng.annotations.Test;

import com.TheInternet.www.pages.TablePage;

public class Tables extends TheInternetTestBase {
	@Test
	public void inputNumber() {
		int number = 10;
		String row0=new TablePage(driver, BaseUrl).navigateTo().getAllDataFromTheTable().getRow(0);
		System.out.println(row0);
	}
}


