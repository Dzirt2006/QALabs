package theInternet.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

import frameworks.ElementSearchers;
import frameworks.JSErrorsHandling;
import frameworks.WindowHandler;

public class SlowResoursePage extends WindowHandler implements JSErrorsHandling, ElementSearchers {
	String direction = "/slow";

	public SlowResoursePage(String url, WebDriver driver) {
		super(url, driver);
	}

	public SlowResoursePage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public int isAnyErrors() {
		// we can add here the waiter
		List<String> listOfErrors = getError(driver);
		int countErrors = 0;
		for (String entry : listOfErrors) {
			System.out.println(entry);
			countErrors++;
		}
		return countErrors;
	}

}
