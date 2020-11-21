package frameworks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface JSExecution {

	default Object jsExec(WebDriver driver, String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(script);
	}

	default Object jsExec(WebDriver driver, WebElement element, String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(script, element);
	}

	default Object jsExec(WebDriver driver, WebElement element1, WebElement element2, String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(script, element1, element2);
	}
}
