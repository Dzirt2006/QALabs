package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.BasicAuthPage;

public class BasicAuth extends TheInternetTestBase {

	@Test
	public void auth() {
		boolean isLoggedIn = new BasicAuthPage(BaseUrl, driver).navigateTo().login().isLogedIn();
		Assert.assertEquals(isLoggedIn, true);
	}
}
