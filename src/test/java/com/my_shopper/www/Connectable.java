package com.my_shopper.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.HttpSessionId;

public interface Connectable {
	WebDriver driver=new ChromeDriver();
	
	default void connect(String url) {
		driver.get(url);
	}
	
	
	default void disconnect() {
		driver.quit();
	}

	 default String getSessionId(String uri) {
	        return HttpSessionId.getSessionId(uri);
	    }
	
}
