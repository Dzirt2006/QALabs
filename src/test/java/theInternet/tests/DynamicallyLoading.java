package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.DynamicallyLoadedPage;

public class DynamicallyLoading extends TheInternetTestBase {

	@Test(invocationCount = 1)
	public void dynamicLoad1() {
		boolean result = new DynamicallyLoadedPage(BaseUrl, driver).navigateTo().goToExample1().exampleStart()
				.getExampleResult();
		Assert.assertEquals(result, true);
	}

	@Test(invocationCount = 1)
	public void dynamicLoad2() {
		boolean result = new DynamicallyLoadedPage(BaseUrl, driver).navigateTo().goToExample2().exampleStart()
				.getExampleResult();
		Assert.assertEquals(result, true);
	}

}
