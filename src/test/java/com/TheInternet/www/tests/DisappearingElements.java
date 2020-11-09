package com.TheInternet.www.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TheInternet.www.pages.DisappearingElementsPage;

public class DisappearingElements extends TheInternetTestBase {

	@Test
	public void home() {
		String home = "Home";
		String url = new DisappearingElementsPage(BaseUrl, driver).navigateTo().getAllButtons().clickOn(home).getUrl();
//		Assert.assertEquals(url, BaseUrl);
	}

//	@Test
//	public void portfolio() {
//		String portfolio = "Portfolio";
//
//		Assert.assertEquals(alertStatus, true);
//	}
//
//	@Test
//	public void contact() {
//		String contacUs = "Contact Us";
//
//		Assert.assertEquals(alertStatus, true);
//	}
//
//	@Test
//	public void about() {
//
//		String about = "About";
//		Assert.assertEquals(alertStatus, true);
//	}

}
