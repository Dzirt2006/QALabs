package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.JQueryUIMenuPage;

public class JQueryUIMenu extends TheInternetTestBase {

	@Test(invocationCount = 1)
	public void jquerymenu() {
		boolean actual = new JQueryUIMenuPage(BaseUrl, driver).navigateTo().mouseOverMenu().mouseOverDownload()
				.downloadExcel().checkDownload();

		Assert.assertEquals(actual, true);
	}

}
