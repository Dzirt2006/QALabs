package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import frameworks.DropDownManipulations;

public class DropdownListPage extends DropDownManipulations {

	String dropdownId = "dropdown";
	String urlDirect = "/dropdown";

	public DropdownListPage(WebDriver driver, String url) {
		super(driver, url);
	}

	public DropdownListPage selectOptionByText(String selection) {
		new Select(elementById(this.dropdownId, super.driver)).selectByVisibleText(selection);
		return this;
	}

	public String getSelectedOption() {
		return new Select(elementById(this.dropdownId, super.driver)).getFirstSelectedOption().getText();
	}

	public DropdownListPage navigateTo() {
		super.navigateTo(urlDirect);
		return this;
	}

}
