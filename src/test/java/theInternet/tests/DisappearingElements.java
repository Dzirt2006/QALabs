package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.DisappearingElementsPage;

public class DisappearingElements extends TheInternetTestBase {

	@Test
	public void portfolio() {
		DisappearingElementsPage dep = new DisappearingElementsPage(BaseUrl, driver);
		int buttonCount = dep.navigateTo().getAmountOfButtons();
		int buttonsAfterRefresh = dep.refreshUntilAppear(buttonCount).getAmountOfButtons();
		// checked many times -bug, sometimes it disappearing/reappearing on each page
		// load, sometimes not.
		Assert.assertNotEquals(buttonCount, buttonsAfterRefresh);
	}
}
