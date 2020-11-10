package frameworks;

import org.openqa.selenium.WebDriver;

public abstract class Notifications extends BasePage implements ElementSearchers {

	public Notifications(String url, WebDriver driver) {
		super(url, driver);
	}

	public abstract Notifications navigateTo();

	public String getNoteificationText(String id) {
		String text = "";
		try {
			return elementById(id, driver).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

}
