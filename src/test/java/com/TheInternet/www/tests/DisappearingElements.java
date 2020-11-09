package com.TheInternet.www.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TheInternet.www.pages.DisappearingElementsPage;

public class DisappearingElements extends TheInternetTestBase {

//	@Test
//	public void home() {
//		String home = "Home";
//		String url = new DisappearingElementsPage(BaseUrl, driver).navigateTo().getAllButtons().clickOn(home).getUrl();
////		Assert.assertEquals(url, BaseUrl);
//	}

	@Test
	public void portfolio() {
		DisappearingElementsPage dep = new DisappearingElementsPage(BaseUrl, driver);
		int buttonCount = dep.navigateTo().getAmountOfButtons();
		int buttonsAfterRefresh = dep.refresh().getAmountOfButtons();

		Assert.assertNotEquals(buttonCount, buttonsAfterRefresh);
	}
}
