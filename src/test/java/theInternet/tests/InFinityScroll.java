package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.InFinityScrollPage;

public class InFinityScroll extends TheInternetTestBase {

	@Test(invocationCount = 1)
	public void scrooling() {
		InFinityScrollPage page = new InFinityScrollPage(BaseUrl, driver).navigateTo();
		long expectedPageHeight = page.getFooter().getPageHeight();
		long currentPageHeight = page.scrollDown().scrollDown().getPageHeight();
		Assert.assertNotEquals(expectedPageHeight, currentPageHeight);
	}

}
