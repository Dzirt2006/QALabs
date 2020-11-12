package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.JSErrorPage;

public class JSError extends TheInternetTestBase {

	@Test
	public void jsError() {
		int expected = 2;
		// why 2:
		// 1. http://the-internet.herokuapp.com/javascript_error 6:51 Uncaught TypeError:
		// Cannot read property 'xyz' of undefined
		// 2. http://the-internet.herokuapp.com/favicon.ico - Failed to load resource: the
		// server responded with a status of 404 (Not Found)
		int errors = new JSErrorPage(BaseUrl, driver).navigateTo().isAnyErrors();
		Assert.assertEquals(errors, expected);
	}

}
