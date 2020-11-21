package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.TablePage;
import theInternet.pages.WYSIWYGPage;

public class WYSIWYG extends TheInternetTestBase {
	@Test
	public void pIsStrong() {
		boolean actual = new WYSIWYGPage(BaseUrl, driver).navigateTo().typePStrong().checkPStrong();

		Assert.assertNotEquals(actual, true);

	}
}
