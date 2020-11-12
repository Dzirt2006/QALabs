package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.FileDownloader;

public class FileDownload extends TheInternetTestBase {

	@Test(invocationCount = 10)
	public void chrome() {

		boolean loadStatus = new FileDownloader(BaseUrl, driver).navigateTo().getListofAnchors()
				.downloadElement(0)
				.checkDownload();
		Assert.assertEquals(loadStatus, true);
	}

}
