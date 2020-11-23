package frameworks;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FailListener extends Screenshot implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		ITestContext context = result.getTestContext();
		WebDriver driver = (WebDriver) context.getAttribute("driver");
		Screenshot.makeScreenshot(context, driver);
		System.out.println("Failure detected... screeenshot saved");
	}

}
