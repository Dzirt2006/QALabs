package frameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface Waiters {
	default void sleepThread(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	default void implisitWait(WebDriver driver, int ms) {
		driver.manage().timeouts().implicitlyWait(ms, TimeUnit.MILLISECONDS);
	}

	default WebElement waitVisibility(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	default WebElement waitForClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
