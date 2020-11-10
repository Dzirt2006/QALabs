package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.ExitIntentPage;

public class ExitIntent extends TheInternetTestBase {

	@Test
	public void moveMouseOut() {
		// don't touch the mouse during the test
		boolean currentOption = new ExitIntentPage(BaseUrl, driver).navigateTo().moveMouseOut().modalIsVisible();
		Assert.assertEquals(currentOption, true);
	}
}
