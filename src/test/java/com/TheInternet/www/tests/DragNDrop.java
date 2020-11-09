package com.TheInternet.www.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TheInternet.www.pages.DragNDropPage;

public class DragNDrop extends TheInternetTestBase {

	@Test
	public void checkbox() {
		DragNDropPage dnd = new DragNDropPage(BaseUrl, driver);
		String aHeader = dnd.navigateTo().getAHeader();
		String bHeader = dnd.dragAToB().dragAToB().getAHeader();

		Assert.assertNotEquals(aHeader, bHeader);
	}
}
