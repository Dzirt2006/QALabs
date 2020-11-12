package theInternet.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import frameworks.loadingConfig.TestLoadManager;

public class TheInternetTestBase {
	protected WebDriver driver;
	protected String BaseUrl;// = "http://the-internet.herokuapp.com/";

	@BeforeMethod
	public void beforeMethod() {

		TestLoadManager manager = new TestLoadManager();
		manager.loadConfigurations();
		driver = manager.driver;
		BaseUrl = manager.baseUrl;
		System.out.println(BaseUrl);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
