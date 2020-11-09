package com.TheInternet.www.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TheInternet.www.pages.ContextMenuPage;

public class ContexMenu extends TheInternetTestBase {

	@Test
	public void checkbox() {
		boolean alertStatus = new ContextMenuPage(BaseUrl, driver).navigateTo().clickOnBox().isAlert();
		Assert.assertEquals(alertStatus, true);
	}
}
