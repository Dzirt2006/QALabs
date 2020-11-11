package frameworks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ScroolActions {

	public default void scroolIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);    
		element.click();
	}
}
