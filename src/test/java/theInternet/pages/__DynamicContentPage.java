package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.BasePage;
import frameworks.ElementSearchers;

public class __DynamicContentPage extends BasePage implements ElementSearchers {

	String allImages = "//div[@id='content']//img";
//	String allText = ""; //$x("//div[@id='content']")[1].childNodes
	String urlDirect = "/dynamic_content";
	
	public __DynamicContentPage(String url, WebDriver driver) {
		super(url, driver);
		// TODO Auto-generated constructor stub
	}

	
	public __DynamicContentPage navigateTo(String url) {
		// TODO Auto-generated method stub
		 super.navigateTo(url);
		 return this;
	}
}
