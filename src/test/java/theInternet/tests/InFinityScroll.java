package theInternet.tests;

import org.testng.annotations.Test;

import theInternet.pages.InFinityScrollPage;

public class InFinityScroll extends TheInternetTestBase {

	@Test
	public void scrooling() {
		boolean footerDisplayed = new InFinityScrollPage(BaseUrl, driver).navigateTo().getFooter().scrollDown()
				.footerIsDisplayed();
		System.out.println(footerDisplayed);
	}

}
