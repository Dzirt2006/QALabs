package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import frameworks.FailListener;
import theInternet.pages.AddRemoveElementsPage;
//@Listeners(FailListener.class)
public class AddRemove extends TheInternetTestBase {

	@Test
	public void addElements() {
		int clicks = 10;
		int elementCount = new AddRemoveElementsPage(driver, BaseUrl).navigateTo().clickButton(clicks).elementsCount();
		Assert.assertEquals(elementCount, clicks);
	}

	@Test
	public void addremoveElements() {
		int addClicks = 10;
		int deleteClicks = 8;
		int elementCount = new AddRemoveElementsPage(driver, BaseUrl).navigateTo().clickButton(addClicks)
				.clickDeleteButton(deleteClicks).elementsCount();
		Assert.assertEquals(elementCount, addClicks - deleteClicks);

	}

}
