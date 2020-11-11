package theInternet.tests;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import frameworks.ConfigurationParameters;
import frameworks.ConfigurationProvider;

public class TheInternetTestBase {
	protected WebDriver driver;
	protected String BaseUrl;// = "http://the-internet.herokuapp.com/";

	@BeforeMethod
	public void beforeMethod() {
//		driver = new ChromeDriver();
		loadConfigurations();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	private void loadConfigurations() {
		if (!isLinux()) {
			URL url = ClassLoader.getSystemResource("chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", url.getFile());
		}
		driver = new ChromeDriver();

		HashMap<String, String> configs = null;
		try {
			configs = new ConfigurationProvider().getDataFromTheFile("config.properties");
		} catch (IOException e) {
			throw new RuntimeException("Config file does not exist.");
		}

		this.BaseUrl = configs.get(ConfigurationParameters.Url);
	}

	public boolean isLinux() {
		String os = System.getProperty("os.name");
		return os.startsWith("Linux");
	}

}
