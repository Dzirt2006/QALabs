package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import frameworks.FailListener;
import theInternet.pages.DragNDropPage;

//@Listeners(FailListener.class)
public class DragNDrop extends TheInternetTestBase {

	@Test
	public void dragNdrop() {
		DragNDropPage dnd = new DragNDropPage(BaseUrl, driver);
		String aHeader = dnd.navigateTo().getAHeader();
		String bHeader = dnd.dragAToB().getAHeader();

		Assert.assertNotEquals(aHeader, bHeader);
	}
}
