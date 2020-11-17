package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrame extends TheInternetTestBase {

	@Test(invocationCount = 1)
	public void iFrame() {
		String expected = "Hey Ho!";
		String actual = new theInternet.pages.IFrame(BaseUrl, driver).navigateTo().switchToFrame().sendString(expected)
				.getString();
		Assert.assertEquals(actual, expected + "Your content goes here.");
	}
}
