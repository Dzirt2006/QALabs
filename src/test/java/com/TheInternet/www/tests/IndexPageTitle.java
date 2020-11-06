package com.TheInternet.www.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TheInternet.www.pages.IndexPage;

public class IndexPageTitle extends TheInternetTestBase {

	@Test
	public void title() {
		String title = "The Internet";
		String currentTitle = new IndexPage(driver, BaseUrl).navigate().getTitle();
		Assert.assertEquals(currentTitle, title);
	}
}
