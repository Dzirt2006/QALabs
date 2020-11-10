package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.NotificationMessagePage;

public class NotificationMessage extends TheInternetTestBase {
	@Test
	public void notificationCheck() {
		String notificationMessage = new NotificationMessagePage(BaseUrl, driver).navigateTo().generateNotification()
				.getNoteificationText();
//return has to be "Action successful" || "Action unsuccessful, please try again" not null
		Assert.assertNotEquals(notificationMessage, null);
	}
}
