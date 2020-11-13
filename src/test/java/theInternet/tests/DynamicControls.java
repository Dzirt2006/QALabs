package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.DynamicControlsPage;

public class DynamicControls extends TheInternetTestBase {

	@Test(invocationCount = 1)
	public void dynamicControl() {
		boolean actual = new DynamicControlsPage(BaseUrl, driver).navigateTo().clickAddRemove().clickAddRemove()
				.clickEnable().getAsyncElementsStatus();
		Assert.assertEquals(actual, true);
	}
}
