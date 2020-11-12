package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.Notifications;

public class NotificationMessagePage extends Notifications {
	String direction = "/notification_message_rendered";
	String noteId = "flash";
	String aXPath="//div[@id='content']//a";

	public NotificationMessagePage(String url, WebDriver driver) {
		super(url, driver);
	}

	@Override
	public NotificationMessagePage navigateTo() {
		super.navigateTo(direction);
		return this;
	}
	
	public NotificationMessagePage generateNotification() {
		elementByXpath(aXPath, driver).click();
		return this;
	}

	public String getNoteificationText() {
//		implisitWait(driver,1000);
		return super.getNoteificationText(noteId).trim();
	}
}
