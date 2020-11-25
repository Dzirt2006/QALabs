package demoqa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import frameworks.loadingConfig.TestLoadManager;

public class TestBaseDemoqa {
	public WebDriver driver;
	protected String BaseUrl;

	@BeforeMethod
	public void beforeMethod(ITestContext context) {
		TestLoadManager manager = new TestLoadManager();
		manager.loadConfigurations("configDemoqa.properties");
		driver = manager.driver;
		BaseUrl = manager.baseUrl;
		context.setAttribute("driver", driver);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		driver.close();
	}

}
