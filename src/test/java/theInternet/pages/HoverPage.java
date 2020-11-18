package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import frameworks.BasePage;
import frameworks.ElementSearchers;

import frameworks.MouseActions;

public class HoverPage extends BasePage implements MouseActions, ElementSearchers {
	String direction = "/hovers";
	String userXpath = "//div[@id='content']/div/div[1]";
	String hoverXpath = "//*[@id=\"content\"]/div/div[1]/div/h5";

	public HoverPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public HoverPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

//	@FindBy(how = How.XPATH, xpath = "//div[@id='content']/div/div[1]")
//	WebElement user1;;

	public HoverPage hoverOnFirstUser() {
		WebElement user1 = waitVisibilityXPath(driver, userXpath);
		mouseMoverToElement(driver, user1);
		return this;
	}

//	@FindBy(how = How.XPATH, xpath = "//*[@id=\"content\"]/div/div[1]/div/h5")
//	WebElement user1Hover;

	public String getHoverText() {
		return waitVisibilityXPath(driver, hoverXpath).getText();
	}

}
