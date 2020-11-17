package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.NestedFramePage;

public class NestedFrames extends TheInternetTestBase {

	@Test(invocationCount = 1)
	public void iFrame() {
		int expected = 4;
		int actual = new NestedFramePage(BaseUrl, driver).navigateTo().selectAllFrames().getToTalFramesAmount();
		Assert.assertEquals(actual, expected);
	}
}
