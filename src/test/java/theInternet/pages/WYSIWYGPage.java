package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.IFrameManipulations;

public class WYSIWYGPage extends BasePage implements IFrameManipulations, ElementSearchers {
	String direction = "/tinymce";
	WebElement editor;

	public WYSIWYGPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public WYSIWYGPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	private void switchToeditor() {
		if (editor == null) {
			editor = waitVisibilityId(driver, "mce_0_ifr");
		}
		switchToIFrame(editor, driver);
		waitVisibilityId(driver, "tinymce").isSelected();// without click on inpt field bottom parameter wouldn't be
		// changed
	}

	public WYSIWYGPage typePStrong() {
		String script = "tinymce.activeEditor.selection.setContent('<strong>Some contents</strong>');";
		jsExec(driver, script);
		switchToeditor();
		return this;
	}

	public boolean checkPStrong() {
		String pXpath = "//div[@class='mce-container-body mce-stack-layout']/div[4]/div/div[1]/div[1]";
		String parametr = "//div[@class='mce-container-body mce-stack-layout']/div[4]/div/div[1]/div[3]";
		return checkElement(pXpath).equals("p") && checkElement(parametr).equals("strong");
	}

	private String checkElement(String xpath) {
		return elementByXpath(xpath, driver).getText();
	}
}
