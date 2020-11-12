package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.LoginPage;

public class FormAuth extends TheInternetTestBase {

	@Test
	public void login() {
		String user = "tomsmith";
		String password = "SuperSecretPassword!";
		String redirectUrl = "/secure";

		String curerentUrl = new LoginPage(BaseUrl, driver).navigateTo().enterAndSubmitData(user, password).getUrl();

		Assert.assertEquals(curerentUrl, BaseUrl + redirectUrl);
	}

}
