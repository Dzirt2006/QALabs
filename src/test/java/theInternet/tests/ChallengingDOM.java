package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import theInternet.pages.ChallengingDOMPage;

public class ChallengingDOM extends TheInternetTestBase {
	ChallengingDOMPage page;
	
	
	@Test(invocationCount = 1)
	public void clickButton() {
		boolean actual=page.clickButton();
		Assert.assertEquals(actual, true);
	}
	
	

	@Test(invocationCount = 1)
	public void tableCheck() {
		boolean actual=page.getRowFromTable(0);
		Assert.assertEquals(actual, true);
	}
	
	
	@BeforeMethod
	public void ini() {
		page=new ChallengingDOMPage(BaseUrl, driver).navigateTo();
	}

}
