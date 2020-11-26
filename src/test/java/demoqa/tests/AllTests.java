package demoqa.tests;



import org.testng.annotations.Test;

import demoqa.pages.Page;
import filereader.Student;

public class AllTests extends TestBaseDemoqa {
	@Test
	public void firstStudent() {
		Student student = studentsList.get(0);
		new Page(BaseUrl, driver, student).navigateTo().fillUpForm();
	}
	
	@Test
	public void secondStudent() {
		Student student = studentsList.get(1);
		new Page(BaseUrl, driver, student).navigateTo().fillUpForm();
	}
	
	@Test
	public void thirdStudent() {
		Student student = studentsList.get(2);
		new Page(BaseUrl, driver, student).navigateTo().fillUpForm();
	}
}
