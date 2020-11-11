package theInternet.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.ShadowRootManipulation;

public class ShadowDomPage extends BasePage implements ShadowRootManipulation, ElementSearchers {
	String direction = "/shadowdom";
	String paragrafsTag = "my-paragraph";
	List<WebElement> paragrafs;
	String tagToText = "slot";

	public ShadowDomPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public ShadowDomPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public ShadowDomPage getParagrafs() {
		paragrafs = elementsByTag(paragrafsTag, driver);
		return this;
	}

	// script $x("//my-paragraph")[0].shadowRoot.children[1].children[0].textContent
	public String getTextFromParagraf(int paragrafIndex) {
		if (paragrafIndex >= paragrafs.size())
			throw new IndexOutOfBoundsException();
		WebElement ele = expandShadowRoot(driver, paragrafs.get(paragrafIndex));
		return elementByTag(tagToText, ele).getText();
	}

}
