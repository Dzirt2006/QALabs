package frameworks;

import org.openqa.selenium.WebDriver;

public interface PageLoad extends JSExecution {

	default int pageAPILoadingAmount(WebDriver driver) {
		String script = "return $.active";
		return (Integer) jsExec(driver, script);
	}

	default boolean pagePoaded(WebDriver driver) {
		String script = "return $ && $.active===0";
		return (boolean) jsExec(driver, script);
	}

}
