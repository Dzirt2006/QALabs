package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import theInternet.pages.JSAlertsPage;

public class JSAlerts extends TheInternetTestBase {
	private JSAlertsPage page;

	@Test
	public void jsAlerts() {
		String expected = "You successfuly clicked an alert";
		String result = page.clickOnJSAlerts().pickAlert().acceptAlert().checkResult();
		System.out.println(expected.length() + " " + result.length());
		Assert.assertEquals(result, expected);
	}

	@Test
	public void jsConfirm() {
		String expected = "You clicked: Ok";
		String result = page.clickOnJSConfirm().pickAlert().acceptAlert().checkResult();

		Assert.assertEquals(result, expected);
	}

	@Test
	public void jsPrompt() {
		String prompt = "Hello World!";
		String expected = "You entered: " + prompt;
		String result = page.clickOnJSPrompt().pickAlert().sendPrompt(prompt).acceptAlert().checkResult();

		Assert.assertEquals(result, expected);
	}

	@BeforeMethod
	public void before() {
		page = new JSAlertsPage(BaseUrl, driver).navigateTo();
	}
}
