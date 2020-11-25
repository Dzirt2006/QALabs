package demoqa.pages;

import org.openqa.selenium.WebDriver;

import filereader.CSVRead;
import filereader.Student;

public class CSVPage extends MainForm {

	public CSVPage(String url, WebDriver driver) {
		super(url, driver);
		// TODO Auto-generated constructor stub
	}

	public CSVPage navigateTo() {
		super.navigateTo("");
		return this;
	}

	public CSVPage getDataFromCSV() {
		super.list = new CSVRead().csvRead("Student.csv");
		
		return this;
	}

}