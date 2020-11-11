package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.ShadowDomPage;

public class ShadowDom extends TheInternetTestBase {
	@Test
	public void shadowDOM() {
		ShadowDomPage page = new ShadowDomPage(BaseUrl, driver).navigateTo().getParagrafs();
		String firstParagraph = null, secondParagraph = null;

		try {
			firstParagraph = page.getTextFromParagraf(10);
			secondParagraph = page.getTextFromParagraf(1);
		} catch (IndexOutOfBoundsException e) {
			System.err.print("Too hight index.");
		}

		Assert.assertEquals(firstParagraph, secondParagraph);
	}
}
