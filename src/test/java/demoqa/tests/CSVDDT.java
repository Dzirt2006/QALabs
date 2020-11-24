package demoqa.tests;

import org.testng.annotations.Test;

import demoqa.pages.CSVPage;

public class CSVDDT extends TestBaseDemoqa {
	
	
	@Test
	public void csv() {
		CSVPage page=new CSVPage(BaseUrl, driver).navigateTo().getDataFromCSV();
		page.fillUpForm(0);
	}
}
