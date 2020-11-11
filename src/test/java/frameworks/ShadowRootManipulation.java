package frameworks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ShadowRootManipulation {

	public default WebElement expandShadowRoot(WebDriver driver, WebElement element) {
		String script = "return arguments[0].shadowRoot";
		WebElement expanded = (WebElement) ((JavascriptExecutor) driver).executeScript(script, element);
		return expanded;
	}
}
