package com.TheInternet.www.frameworks;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.pages.BasePage;

public abstract class Table extends BasePage implements ElementSearchers {

	public Table(WebDriver driver, String url) {
		super(url, driver);
	}

	protected abstract Table navigateTo();

	protected Map<String, ArrayList<String>> getAllDataFromTheTable(WebElement table) {
		Map<String, ArrayList<String>> tableObject = new HashMap<String, ArrayList<String>>();
		String[] headerData = getDataFromTheHeader(table, "th");
		List<WebElement> bodyElement = getTBody(table);
		Iterator<WebElement> iterator = bodyElement.iterator();
		int index = 0;
		while (iterator.hasNext()) {
			String tableTr = iterator.next().getText();
			// re do it later
			if (index == headerData.length) {
				index = 0;
			}
			String key = headerData[index];
			if (tableObject.get(key) != null) {
				ArrayList<String> innerList = tableObject.get(key);
				innerList.add(tableTr);
			} else {
				ArrayList<String> innerList = new ArrayList<String>();
				innerList.add(tableTr);
				tableObject.put(key, innerList);
			}
			index++;
		}
		return tableObject;
	}

	protected WebElement getTableElementById(String id) {
		return elementById(id, driver);
	}

	protected List<WebElement> getHeader(WebElement element) {
		String headerTag = "th";
		return elementsByTag(headerTag, element);
	}

	protected String[] getDataFromTheHeader(WebElement element, String tag) {
		List<WebElement> elements = new ArrayList<>(this.elementsByTag(tag, element));
		String[] finalData = new String[elements.size()];
		Iterator<WebElement> iterator = elements.iterator();
		int counter = 0;
		while (iterator.hasNext()) {
			finalData[counter] = iterator.next().getText();
			counter++;
		}
		return finalData;
	}

	protected List<WebElement> getTBody(WebElement table) {
		String tagname = "tbody";
		String tabInTBody = "td";
		WebElement tbody = elementByTag(tagname, table);
		return elementsByTag(tabInTBody, tbody);
	}

	protected String getRow(Map<String, ArrayList<String>> map, int index) {
		String result = "";
		for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
			result += entry.getKey() + ": " + entry.getValue().get(index) + " ";
		}

		return result.trim();
	}

	protected void clickOnHeader(WebElement table, String headerText) {
		String xpath = "//span[.='" + headerText + "']";
		elementByXpath(xpath, table).click();
	}

}
