package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.RedirectionPage;

public class Redirection extends TheInternetTestBase {
	@Test
	public void redirect() {
		boolean compareUrlResult = new RedirectionPage(BaseUrl, driver).navigateTo().redirect().isRedirected();
		Assert.assertEquals(compareUrlResult, false);
	}
}
