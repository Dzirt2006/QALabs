package com.TheInternet.www.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TheInternet.www.pages.EntryAddPage;

public class EntryAdd extends TheInternetTestBase {

	@Test
	public void home() {

		boolean windowIsVisible = new EntryAddPage(BaseUrl, driver).navigateTo().closeModalWindow().reenableModal()
				.refresh().modalIsVisible();
		Assert.assertEquals(windowIsVisible, true);
	}

}