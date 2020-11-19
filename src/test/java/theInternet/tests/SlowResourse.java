package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.SlowResoursePage;

public class SlowResourse extends TheInternetTestBase {
	@Test
	public void slowRes() {
		int errors = new SlowResoursePage(BaseUrl, driver).navigateTo().isAnyErrors();
		Assert.assertNotEquals(errors, 0);
	}
}
