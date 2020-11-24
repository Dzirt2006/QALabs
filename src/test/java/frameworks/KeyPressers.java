package frameworks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public interface KeyPressers {

	default void pressEnter() {
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	default void pressCtrlA() {
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_A);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
