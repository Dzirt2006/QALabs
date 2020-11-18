package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.ChromeDownloader;
import frameworks.ElementSearchers;
import frameworks.MouseActions;

public class JQueryUIMenuPage extends ChromeDownloader implements MouseActions, ElementSearchers {
	String direction = "/jqueryui/menu";
	String menuId = "ui-id-2";
	String downloadId = "ui-id-4";
	String excelId = "ui-id-8";
	WebElement menu;
	WebElement download;
	WebElement excelFile;

	public JQueryUIMenuPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public JQueryUIMenuPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

//	@FindBy(how=How.ID,id="ui-id-2")

	public JQueryUIMenuPage mouseOverMenu() {
		menu = elementById(menuId, driver);
		mouseMoverToElement(driver, menu);
		return this;
	}

	public JQueryUIMenuPage mouseOverDownload() {
		download = waitVisibilityId(driver, downloadId);
		mouseMoverToElement(driver, download);
		return this;
	}

	public JQueryUIMenuPage downloadExcel() {
		waitVisibilityId(driver, excelId).click();
		return this;
	}

	public boolean checkDownload() {
		return fileLoaded();
	}

}
