package frameworks;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

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
		mouseMover(600, 100);
	}

	default void moveMouseOnPage(WebDriver driver) {
		mouseMover(600, 600);
	}

	default void mouseMover(int x, int y) {
		Robot robot;
		try {
			robot = new Robot();
			robot.mouseMove(x, y);
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

		// Secondly, get x and y offset for to object
		int xOffset = to.getLocation().getX();
		int yOffset = to.getLocation().getY();

		// Find the xOffset and yOffset difference to find x and y offset needed in
		// which from object required to dragged and dropped
		xOffset = (xOffset - xOffset1);
		yOffset = (yOffset - yOffset1)+180;
//		new Actions(driver).dragAndDropBy(from, xOffset, yOffset + 100).build().perform();
//		new Actions(driver).dragAndDrop(from, to).build().perform();
		Actions actions = new Actions(driver);
        int xAxis = (int) (10.0 * Math.random());
        int yAxis = (int) (10.0 * Math.random());

        actions.dragAndDropBy(from, xAxis, yAxis).build().perform();
//        actions.dragAndDropBy(to, xAxis, yAxis).build().perform();
//        actions.dragAndDropBy(to, xAxis, yAxis).build().perform();
//		new Actions(driver).clickAndHold(from).moveByOffset(xOffset, yOffset + 100).release().build().perform();

		// mouse release doen't work in chrome
//		Actions builder = new Actions(driver);
//		Action dragAndDrop = builder.clickAndHold(from).moveByOffset(xOffset, yOffset + 100).click().release(from)
//				.build();
//		dragAndDrop.perform();

//		Robot robot = null;
//		try {
//			robot = new Robot();
//		} catch (AWTException e) {
//			e.printStackTrace();
//		}
//		System.out.println(xOffset1 + " to: " + xOffset + " y:  " + yOffset1 + " to: " + yOffset);
//
//		robot.mouseMove(xOffset1,yOffset);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseMove( xOffset,yOffset);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		
//		PointerInfo a = MouseInfo.getPointerInfo();
//		Point b = a.getLocation();
//		int x = (int) b.getX();
//		int y = (int) b.getY();
//		System.out.print("Y: "+y );
//		System.out.print("X: "+x);
	}

}
