package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.MouseActions;

public class DragNDropPage extends BasePage implements MouseActions, ElementSearchers {
	String direct = "/drag_and_drop";
	String idA = "column-a";
	String idB = "column-b";
	String aHeader = "//div[@id='column-a']/header";

	public DragNDropPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public DragNDropPage navigateTo() {
		super.navigateTo(direct);
		return this;
	}

	public DragNDropPage dragAToB() {
		System.out.println(getAHeader());
		WebElement a = waitVisibilityId(driver, idA);
		WebElement b = waitVisibilityId(driver, idB);
		dragNDrop(driver, b, a);
		System.out.println(getAHeader());
		return this;
	}

	public String getAHeader() {
		return elementByXpath(aHeader, driver).getText();
	}

}
