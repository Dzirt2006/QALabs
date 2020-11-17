package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.IFrameManipulations;

public class IFrame extends BasePage implements IFrameManipulations, ElementSearchers {
	String direction = "/iframe";
	WebElement iframeInput;

	public IFrame(String url, WebDriver driver) {
		super(url, driver);
	}

	public IFrame navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	@FindBy(id = "mce_0_ifr")
	WebElement iframe;

	public IFrame switchToFrame() {
		waitVisibility(driver,
				"//div[@role='alertdialog']//div[@role='group']//div[@role='button']/button[@role='presentation']")
						.click();
		switchToIFrame("mce_0_ifr", driver);
		return this;
	}

//	@FindBy(how = How.XPATH, xpath = "//body[@id='tinymce']/p[.='l;']")
//	WebElement iframeInput;

	public IFrame sendString(String phrase) {
		iframeInput = elementByXpath("//body[@id='tinymce']/p", driver);
//		iframeInput.click(); 
//		iframeInput.clear(); after clear value will be  null 
		iframeInput.sendKeys(phrase);

		return this;
	}

	public String getString() {
		if (iframeInput == null) {
			iframeInput = elementByXpath("//body[@id='tinymce']/p", driver);
		}
		return iframeInput.getText();
	}

}
