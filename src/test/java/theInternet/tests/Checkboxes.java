package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.CheckboxPage;

public class Checkboxes extends TheInternetTestBase {

	@Test
	public void checkbox() {
		boolean preCondition = new CheckboxPage(driver, BaseUrl).navigateTo().getCheckedByText();
		boolean postCondition = new CheckboxPage(driver, BaseUrl).navigateTo().clickByTextBelow().clickByTextBelow()
				.getCheckedByText();

		Assert.assertEquals(preCondition, postCondition);
	}
}
