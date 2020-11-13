package theInternet.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.ElementSearchers;
import frameworks.Table;

public class ChallengingDOMPage extends Table implements ElementSearchers {
	String urlDirect = "/challenging_dom";

	public ChallengingDOMPage(String url, WebDriver driver) {
		super(driver, url);

	}

	public ChallengingDOMPage navigateTo() {
		super.navigateTo(urlDirect);
		return this;
	}

	public boolean clickButton() {
		List<WebElement> buttons = elementsByXpath("//div[@class='example']/div/div/div[1]/a", driver);
		boolean res = false;
		buttons.get(2).click();
		res = true;
		return res;
	}

	public boolean getRowFromTable(int rowIndex) {
		WebElement table = elementByXpath("//table", driver);
		Map<String, ArrayList<String>> tableObject = getAllDataFromTheTable(table);
		String row = getRow(tableObject, rowIndex);
		System.out.println(row);
		return row != null;
	}

}
