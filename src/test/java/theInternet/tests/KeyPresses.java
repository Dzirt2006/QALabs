package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.KeyPressesPage;

public class KeyPresses extends TheInternetTestBase {

	@Test
	public void keyPress() {
		String expected = "You entered: ENTER";
		String result = new KeyPressesPage(BaseUrl, driver).navigateTo().enterPress().getResult();

		Assert.assertEquals(result, expected);
	}
}
