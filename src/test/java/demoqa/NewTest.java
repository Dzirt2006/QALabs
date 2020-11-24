package demoqa;

import org.testng.annotations.Test;

import filereader.CSVRead;

public class NewTest {
	@Test
	public void f() {
		System.out.println(new CSVRead().csvRead("Student.csv"));
	}
}
