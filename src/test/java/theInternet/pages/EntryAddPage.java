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
	}

	String redirect = "/entry_ad";
	List<WebElement> windows;

	public EntryAddPage navigateTo() {
		super.navigateTo(redirect);
		return this;
	}

	public EntryAddPage refresh() {
		super.refresh();
		while (!modalIsVisible()) {
			super.refresh();
		}
		return this;
	}

	public EntryAddPage closeModalWindow() {
		super.closeModalWindow(closeXPath);
		return this;
	}

	public boolean modalIsVisible() {
		return super.modalIsVisible(closeXPath);
	}

	public EntryAddPage reenableModal() {
		super.reenableModal(clickable);
		return this;
	}

}
