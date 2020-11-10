package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.IndexPage;

public class IndexPageTitle extends TheInternetTestBase {

	@Test
	public void title() {
		String title = "The Internet";
		String currentTitle = new IndexPage(driver, BaseUrl).navigate().getTitle();
		Assert.assertEquals(currentTitle, title);
	}
}
