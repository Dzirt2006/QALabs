package frameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertBox extends BasePage {

	public AlertBox(String url, WebDriver driver) {
		super(url, driver);
	}

	public Alert switchToAlert() {
		sleep(1000);
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public AlertBox acceptAlert(Alert alert) {
		alert.accept();
		return this;
	}

	public AlertBox cancelAlert(Alert alert) {
		alert.dismiss();
		return this;
	}

	public AlertBox sendPrompt(Alert alert, String prompt) {
		alert.sendKeys(prompt);
		return this;
	}
}
