package theInternet.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import frameworks.Screenshot;
import frameworks.loadingConfig.TestLoadManager;

public class TheInternetTestBase {
	public WebDriver driver;
	protected String BaseUrl;// = "http://the-internet.herokuapp.com/";

	@BeforeMethod
	public void beforeMethod(ITestContext context) {
		TestLoadManager manager = new TestLoadManager();
		manager.loadConfigurations("configTheInternet.properties");
		driver = manager.driver;
		BaseUrl = manager.baseUrl;
		context.setAttribute("driver", driver);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		driver.close();
	}

}
