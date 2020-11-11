package theInternet.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import frameworks.BasePage;
import frameworks.ElementSearchers;

public class RedirectionPage extends BasePage implements ElementSearchers {
	String direction = "/redirector";
	String redirectTriggerId = "redirect";
	List<WebElement> codes;
	String mainPageUrl;

	public RedirectionPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public RedirectionPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public RedirectionPage redirect() {
		mainPageUrl = super.getUrl();
		elementById(redirectTriggerId, driver).click();
		return this;
	}

	public boolean isRedirected() {
		System.out.println(mainPageUrl + "\n" + super.getUrl());
		return mainPageUrl.equals(super.getUrl());
	}

	//in case if we want to check all redirects
	public RedirectionPage getListofStatusCodes() {
		codes=elementsByTag("li", driver);
		return this;
	}
	
	public RedirectionPage redirectByCode(String code) {
		Iterator<WebElement> iter=codes.iterator();
		while(iter.hasNext()) {
		}
		return this;
	}

}
