package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.FileDownloader;

public class ChromeDownload extends TheInternetTestBase {

	@Test
	public void chrome() {
		// why download logo? because logo always on the page even after restart server,
		// it's a base file;
		boolean loadStatus = new FileDownloader(BaseUrl, driver).navigateTo().downloadLogo().checkDownload();
		Assert.assertEquals(loadStatus, true);
	}

}
