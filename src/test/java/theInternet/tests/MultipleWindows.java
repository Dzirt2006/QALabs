package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.OpeningnWindowPage;

public class MultipleWindows extends TheInternetTestBase {

	@Test
	public void newWindow() {
		OpeningnWindowPage page = new OpeningnWindowPage(BaseUrl, driver).navigateTo();
		String newUrl = page.openNewW().getCurrentWindow().switchToNextWindow().getUrl();
		String parentUrl = page.closeCurrentW().switchToParent().getUrl();
//		System.out.println(newUrl + " " + firstUrl);
		Assert.assertNotEquals(newUrl, parentUrl);
	}
}
