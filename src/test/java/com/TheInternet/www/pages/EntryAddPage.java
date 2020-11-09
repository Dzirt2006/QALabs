package com.TheInternet.www.pages;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryAddPage extends BasePage {
	public EntryAddPage(String url, WebDriver driver) {
		super(url, driver);
		// TODO Auto-generated constructor stub
	}

	String redirect = "/entry_ad";
	List<WebElement> windows;

	public EntryAddPage navigateTo() {
		super.navigateTo(redirect);
		return this;
	}
	
	public EntryAddPage getAllWindows() {
		String originalWindowHandle = driver.getWindowHandle();
		System.out.println("original Window handles are: " + originalWindowHandle);
		System.out.println("Title of original Page:" + driver.getTitle());  
		java.util.Set<java.lang.String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		int count = windowHandles.size();
		//if (count > 1) {
		for (String window: windowHandles) {
		    if(!window.equals(originalWindowHandle)){
		        driver.switchTo().window(window);
		        String url = driver.getCurrentUrl();
		        System.out.println("current url is: " + url);        
		    }  
		    //to go back to original    
		    driver.switchTo().window(originalWindowHandle); 

		} 
		System.out.println(count);
		return this;
	}
	
}
