package demoqa.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demoqa.pages.Page;
import filereader.Student;

public class AllTests extends TestBaseDemoqa {

	@DataProvider(name = "data-provider")
	public Object[] studentProvider() {
		return new Object[] { studentsList.get(2), studentsList.get(1), studentsList.get(0) };
	}

	//When we're using db data 2 cases will fails because there is no cities/states that is match option on web page
	
	@Test(dataProvider = "data-provider")
	public void StudentTest(Student student) {
		String expected = student.firstName + " " + student.lastName;
		String actual = new Page(BaseUrl, driver, student).navigateTo().fillUpForm().checkInput();
		Assert.assertEquals(actual, expected);
	}

}
