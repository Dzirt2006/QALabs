package demoqa.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demoqa.pages.Page;
import filereader.Student;

public class AllTests extends TestBaseDemoqa {

	@DataProvider(name = "data-provider")
	public Object[] studentProvider() {
		return new Object[] {  studentsList.get(0) ,  studentsList.get(1) , studentsList.get(2) };
	}

	
	
	@Test(dataProvider = "data-provider")
	public void StudentTest(Student student) {
		new Page(BaseUrl, driver, student).navigateTo().fillUpForm();
	}
	
//	@Test
//	public void firstStudent() {
//		Student student = studentsList.get(0);
//		new Page(BaseUrl, driver, student).navigateTo().fillUpForm();
//	}
//
//	@Test
//	public void secondStudent() {
//		Student student = studentsList.get(1);
//		new Page(BaseUrl, driver, student).navigateTo().fillUpForm();
//	}
//
//	@Test
//	public void thirdStudent() {
//		Student student = studentsList.get(2);
//		new Page(BaseUrl, driver, student).navigateTo().fillUpForm();
//	}
}
