package filereader;

import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		String[] columns = new String[] { "l_name", "f_name", "dob", "email", "houseNumber", "street", "house", "state",
				"city", "postalCode", "contact", "gender", "subjects", "hobby" };
//		System.out.println(new XMLRead().xmlRead("Student.xml", columns));
		new XMLRead().parseToPOJO("Student.xml");

	}
}
