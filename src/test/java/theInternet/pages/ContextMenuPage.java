package theInternet.pages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.AlertBox;
import frameworks.ElementSearchers;
import frameworks.MouseActions;

public class ContextMenuPage extends AlertBox implements MouseActions, ElementSearchers {
	String url = "/context_menu";
	String id = "hot-spot";

	public ContextMenuPage(String bUrl, WebDriver driver) {
		super(bUrl, driver);
	}

	public ContextMenuPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public ContextMenuPage clickOnBox() {
		WebElement box = elementById(id, driver);
		contextClick(driver, box);
		return this;
	}

	public boolean isAlert() {
		Alert alert = super.switchToAlert();
		alert.accept();
		return alert == null ? false : true;
	}

}
