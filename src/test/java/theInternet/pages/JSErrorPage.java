package theInternet.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

import frameworks.BasePage;
import frameworks.JSErrorsHandling;
import frameworks.Waiters;

public class JSErrorPage extends BasePage implements JSErrorsHandling, Waiters {
	String url = "/javascript_error";

	public JSErrorPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public JSErrorPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public int isAnyErrors() {
		List<String> listOfErrors = getError(driver);
		int countErrors = 0;
		for (String entry : listOfErrors) {
			System.out.println(entry);
			countErrors++;
		}
		return countErrors;
	}

}
