package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.FileUploadPage;

public class FileUpload extends TheInternetTestBase {

	@Test(invocationCount = 1)
	public void fileUpload() {
		boolean actual = new FileUploadPage(BaseUrl, driver).navigateTo().chooseFile().uploadFile().checkForUpload();
		Assert.assertEquals(actual, true);
	}

}
