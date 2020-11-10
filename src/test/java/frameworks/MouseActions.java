package frameworks;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public interface MouseActions {
	// right click
	default void contextClick(WebDriver driver, WebElement element) {
		new Actions(driver).contextClick(element).perform();
	}

	// double click
	default void doulbeClick(WebDriver driver, WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	default void moveMouseToVeiwportPane(WebDriver driver) {
		Robot robot;
		try {
			robot = new Robot();
			robot.mouseMove(600, 100);
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	default void moveMouseOnPage(WebDriver driver) {
		Robot robot;
		try {
			robot = new Robot();
			robot.mouseMove(600, 600);
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	// drag and drop
	default void dragNDrop(WebDriver driver, WebElement from, WebElement to) {
		// Here, getting x and y offset to drop source object on target object location
		// First, get x and y offset for from object
		int xOffset1 = from.getLocation().getX();
		int yOffset1 = from.getLocation().getY();

		System.out.println("xOffset1--->" + xOffset1 + " yOffset1--->" + yOffset1);

		// Secondly, get x and y offset for to object
		int xOffset = to.getLocation().getX();
		int yOffset = to.getLocation().getY();

		System.out.println("xOffset--->" + xOffset + " yOffset--->" + yOffset);

		// Find the xOffset and yOffset difference to find x and y offset needed in
		// which from object required to dragged and dropped
		xOffset = (xOffset - xOffset1);
//		yOffset = (yOffset - yOffset1) + 20;
//		new Actions(driver).dragAndDropBy(from, xOffset, yOffset + 100).build().perform();

//		new Actions(driver).dragAndDrop(from, to).build().perform();

		// mouse release doen't work in chrome
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(from).moveByOffset(xOffset, yOffset + 100).moveToElement(to).release()
				.build();
		dragAndDrop.perform();
	}

}
