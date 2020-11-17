package frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IFrameManipulations {

	default void switchToIFrame(String iframeId, WebDriver driver) {
		driver.switchTo().frame(iframeId);
	}

	default void switchToIFrame(WebElement iframeElement, WebDriver driver) {
		driver.switchTo().frame(iframeElement);
	}

	default void switchBackToParent(WebDriver driver) {
		driver.switchTo().parentFrame();
		;
	}

	default void switchBackToMainParent(WebDriver driver) {
		driver.switchTo().defaultContent();
		;
	}

}
