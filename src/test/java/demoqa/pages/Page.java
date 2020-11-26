package demoqa.pages;

import org.openqa.selenium.WebDriver;

import filereader.Student;

public class Page extends MainForm {

	public Page(String url, WebDriver driver, Student student) {
		super(url, driver, student);
	}

	public Page navigateTo() {
		super.navigateTo("");
		return this;
	}
}
