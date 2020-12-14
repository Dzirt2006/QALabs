package theInternet.tests.bdd;

import frameworks.loadingConfig.TestLoadManager;
import org.openqa.selenium.WebDriver;


public class CucumberBaseHook {
    public WebDriver driver;
    protected String BaseUrl;// = "http://the-internet.herokuapp.com/";


    public void beforeMethod() {
        TestLoadManager manager = new TestLoadManager();
        manager.loadConfigurations("configTheInternet.properties");
        driver = manager.driver;
        BaseUrl = manager.baseUrl;
    }


    public void afterMethod() {
        driver.close();
    }

}
