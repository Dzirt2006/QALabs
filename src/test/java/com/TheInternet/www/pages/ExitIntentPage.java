package com.TheInternet.www.pages;

import org.openqa.selenium.WebDriver;

import com.TheInternet.www.frameworks.BasePage;
import com.TheInternet.www.frameworks.ElementSearchers;
import com.TheInternet.www.frameworks.MouseActions;

public class ExitIntentPage extends BasePage implements ElementSearchers,MouseActions {
	
	String allImages = "//div[@id='content']//img";
//	String allText = ""; //$x("//div[@id='content']")[1].childNodes
	String urlDirect = "/exit_intent";

	public ExitIntentPage(String url, WebDriver driver) {
		super(url, driver);
		// TODO Auto-generated constructor stub
	}

	public ExitIntentPage navigateTo() {
		// TODO Auto-generated method stub
		super.navigateTo(urlDirect);
		return this;
	}
	
	
	public ExitIntentPage moveMouseOut() {
		moveMouseToVeiwportPane(driver);
		return this;
	}
	
	public 
	
	
	

}
