import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebEnter {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "/home/alex/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://my-shopper.herokuapp.com/";
		driver.get(baseUrl);
		
		
		driver.findElement(By.xpath("//div[@id='root']//form[@action='/auth/']//button[@type='submit']")).click();
		
//		driver.quit();
	}

}
