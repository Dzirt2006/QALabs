package theInternet.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.ModalWindow;

public class EntryAddPage extends ModalWindow {
	String closeXPath = "//p[.='Close']";
	String clickable = "//a[@id='restart-ad']";

	public EntryAddPage(String url, WebDriver driver) {
		super(url, driver);
		// TODO Auto-generated constructor stub
	}

	String redirect = "/entry_ad";
	List<WebElement> windows;

	public EntryAddPage navigateTo() {
		super.navigateTo(redirect);
		return this;
	}

	public EntryAddPage refresh() {
		// TODO Auto-generated method stub
		super.refresh();
		sleep(3000);
		return this;
	}

	public EntryAddPage closeModalWindow() {
		super.closeModalWindow(closeXPath);
//		WebElement close = waitVisibility(driver, closeXPath);
//		close.click();
		return this;
	}

	public boolean modalIsVisible() {
//		return waitVisibility(driver, closeXPath).isDisplayed();
		return super.modalIsVisible(closeXPath);
	}

	public EntryAddPage reenableModal() {
//		sleep(3000);
//		WebElement activate = elementByXpath(clickable, driver);
//		if (activate.isDisplayed() && activate.isEnabled()) {
//			activate.click();
//		} else {
//			sleep(1500);
//			activate.click();
//		}
		super.reenableModal(clickable);
		return this;
	}

}
