package com.TheInternet.www.tests;

import org.testng.annotations.Test;

import com.TheInternet.www.pages.EntryAddPage;



public class EntryAdd extends TheInternetTestBase {

	@Test
	public void home() {
		new EntryAddPage(BaseUrl, driver).navigateTo().getAllWindows();
	}

}
