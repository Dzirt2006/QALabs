package com.TheInternet.www.frameworks;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.pages.BasePage;

public abstract class Table extends BasePage implements ElementSearchers {

	public Table(WebDriver driver, String url) {
		super(url, driver);
	}

	abstract InputField navigateTo();

	public Map<String, ArrayList<String>> getAllDataFromTheTable(WebElement table) {
		Map<String, ArrayList<String>> tableObject = new HashMap<String, ArrayList<String>>();

		return tableObject;
	}

	public WebElement getTableElementById(String id) {
		return elementById(id, driver);
	}

	public List<WebElement> getHeader(WebElement element) {
		String headerTag = "th";
		return elementsByTag(headerTag, element);
	}

	public String[] getDataFromTheHeader(WebElement element, String tag) {
		List<WebElement> elements = new ArrayList<>(this.elementsByTag(tag, element));
		String[] finalData = new String[elements.size()];
		Iterator<WebElement> iterator = elements.iterator();
		int counter=0;
		while(iterator.hasNext()) {
			finalData[counter]=iterator.next().getAttribute("value");
		}
		return finalData;
	}
}
