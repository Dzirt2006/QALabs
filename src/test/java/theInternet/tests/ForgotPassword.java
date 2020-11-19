package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import theInternet.pages.ForgotPasswordPage;

public class ForgotPassword extends TheInternetTestBase {

	@Test(invocationCount = 1)
	public void retrievePass() {
		String expected="no-reply@the-internet.herokuapp.com";
		String actual = new ForgotPasswordPage(BaseUrl, driver).navigateTo().retrievePass().navigateToEmail().getEmail();
		Assert.assertEquals(actual, expected);
	}
}
