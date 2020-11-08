package com.TheInternet.www.pages;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.frameworks.Table;

public class TablePage extends Table {
	String url = "/tables";
	String tableId = "table1";
	String sortedColumn = "First Name";
	Map<String, ArrayList<String>> tableObject;
	WebElement table1;

	public TablePage(WebDriver driver, String url) {
		super(driver, url);
	}

	@Override
	public TablePage navigateTo() {
		super.navigateTo(this.url);
		return this;
	}

	public TablePage getTable() {
		table1 = getTableElementById(tableId);
		System.out.println(table1);
		return this;
	}

	public TablePage getAllDataFromTheTable() {
		tableObject = getAllDataFromTheTable(table1);
		return this;
	}

	public String getRow(int index) {
		return super.getRow(tableObject, index);
	}

	public TablePage clickOnHeader() {
		super.clickOnHeader(table1, sortedColumn);
		return this;
	}

}
