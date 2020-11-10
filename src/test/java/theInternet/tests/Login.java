package theInternet.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import theInternet.pages.LoginPage;

public class Login extends TheInternetTestBase {

	@Test
	public void login() {
		String user = "tomsmith";
		String password = "SuperSecretPassword!";
		String redirectUrl = "secure";

		String curerentUrl = new LoginPage(BaseUrl, driver).navigateTo()
				.enterAndSubmitData(user, password).getUrl();
		
		Assert.assertEquals(curerentUrl, BaseUrl+redirectUrl);
	}
	
	@Test
	public void loginFail() {
		
		//check for fail after add notification
//		Assert.assertEquals();
	}
	
	

}
