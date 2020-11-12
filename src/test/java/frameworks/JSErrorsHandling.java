package frameworks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public interface JSErrorsHandling {
	default List<String> getError(WebDriver driver) {
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		List<String> listOfErrors = new ArrayList<String>();
		for (LogEntry entry : logEntries) {
			listOfErrors.add(entry.getMessage());
		}
		return listOfErrors;
	}
}
