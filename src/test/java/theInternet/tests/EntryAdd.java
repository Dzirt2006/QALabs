package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.EntryAddPage;

public class EntryAdd extends TheInternetTestBase {

	
	@Test(invocationCount = 1)
	public void home() {
		//sometimes failing, tried all possible wait(explicit,implicit,thread)
		boolean windowIsVisible = new EntryAddPage(BaseUrl, driver).navigateTo().closeModalWindow().reenableModal()
				.refresh().modalIsVisible();
		Assert.assertEquals(windowIsVisible, true);
	}

}