package demoqa;

import java.util.List;

import org.testng.annotations.Test;

import filereader.CSVRead;

public class NewTest {
	@Test
	public void f() {
		List<Student> list = new CSVRead().csvRead("Student.csv");

		for (Student element : list) {

			System.out.println("YOHOO " + element.getFirstName() + " " + element.getLastName() + " "
					+ element.getEmail() + " " + element.getHobby()+" "+element.city);
		}
	}
}
