package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface Waiters {
	default void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	default WebElement waitVisibility(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
}
