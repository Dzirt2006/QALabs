package theInternet.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import frameworks.Screenshot;
import frameworks.loadingConfig.TestLoadManager;

public class TheInternetTestBase extends Screenshot{
	protected WebDriver driver;
	protected String BaseUrl;// = "http://the-internet.herokuapp.com/";

	@BeforeMethod
	public void beforeMethod() {

		TestLoadManager manager = new TestLoadManager();
		manager.loadConfigurations();
		driver = manager.driver;
		BaseUrl = manager.baseUrl;
	}

	@AfterMethod
	public void afterMethod(ITestContext iTestContext) {
		Screenshot.makeScreenshot(iTestContext, driver);
		driver.close();
	}

}
