package demoqa.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import filereader.DataProvider;
import filereader.Student;
import frameworks.loadingConfig.TestLoadManager;

public class TestBaseDemoqa {
	public WebDriver driver;
	protected String BaseUrl;
	List<Student> studentsList;
	// if file name is empty all data will be taken from db, also it will open
	// necessary file automatically, just send it to method
//	String fileName;
//	String fileName = "Student.csv";
	String fileName = "Student.xml";

	@BeforeClass
	public void beforeClass() {
		TestLoadManager manager = new TestLoadManager();
		manager.loadConfigurations("configDemoqa.properties");
		if (fileName != null) {
			studentsList = new DataProvider().getStudentsFromFile(fileName);
		} else {
			String connectionString = "jdbc:mysql://localhost/" + manager.dbName + "?user=" + manager.username
					+ "&password=" + manager.password + "&useUnicode=true&characterEncoding=UTF-8";
			studentsList = new DataProvider().getStudentsFromDB(connectionString, manager.query);
		}
	}

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
