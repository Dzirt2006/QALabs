package frameworks.loadingConfig;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class TestLoadManager {
	public WebDriver driver;
	public String baseUrl;
	private String driverName;

	public void loadConfigurations() {
		HashMap<String, String> configs = null;
		try {
			configs = new ConfigurationProvider().getDataFromTheFile("config.properties");
		} catch (IOException e) {
			throw new RuntimeException("Config file does not exist.");
		}
		baseUrl = configs.get(ConfigurationParameters.Url);
		driverName = configs.get(ConfigurationParameters.Driver);
		driver = new DriverManager(driverName).getDriver();
	}

}
