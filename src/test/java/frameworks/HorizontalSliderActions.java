package frameworks;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface HorizontalSliderActions {

	default void changeSliderValue(WebElement slider) {
		int xOffset = slider.getLocation().getX();
		int yOffset = slider.getLocation().getY();
		Robot robot;
		try {
			robot = new Robot();
			robot.mouseMove(xOffset, yOffset);
			slider.click();
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	default float sliderValue(WebElement slider, WebDriver driver) {
		String script = "return arguments[0].value";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = (String) js.executeScript(script, slider);
		return Float.parseFloat(value);
	}

}
