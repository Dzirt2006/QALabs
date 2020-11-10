package com.TheInternet.www.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TheInternet.www.pages.ExitIntentPage;

public class ExitIntent extends TheInternetTestBase {

	@Test
	public void moveMouseOut() {
		// don't touch the mouse during the test
		boolean currentOption = new ExitIntentPage(BaseUrl, driver).navigateTo().moveMouseOut().modalIsVisible();
		Assert.assertEquals(currentOption, true);
	}
}
