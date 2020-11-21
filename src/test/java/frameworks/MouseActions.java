package frameworks;

import java.awt.AWTException;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public interface MouseActions extends JSExecution {
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

	default void mouseMoverToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
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
		String script = "function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
				+ "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
				+ "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
				+ "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
				+ "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
				+ "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
				+ "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
				+ "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
				+ "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
				+ "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
				+ "var dropEvent = createEvent('drop');\n"
				+ "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
				+ "var dragEndEvent = createEvent('dragend');\n"
				+ "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
				+ "var source = arguments[0];\n" + "var destination = arguments[1];\n"
				+ "simulateHTML5DragAndDrop(source,destination);";
		jsExec(driver, from, to, script);
	}

}
