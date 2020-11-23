package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import frameworks.FailListener;
import theInternet.pages.HoverPage;


public class Hover extends TheInternetTestBase {

	@Test(invocationCount = 1)
	public void iFrame() {
		String expected = "name: user1";
		String actual = new HoverPage(BaseUrl, driver).navigateTo().hoverOnFirstUser().getHoverText();
		Assert.assertEquals(actual, expected);
	}
}
