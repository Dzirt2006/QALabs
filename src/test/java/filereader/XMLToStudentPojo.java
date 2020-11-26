package filereader;

import java.util.ArrayList;
import java.util.List;

public class XMLToStudentPojo {
	private String fileName;
	List<Student> studentsList;

	{
		studentsList = new ArrayList<Student>();
	}

	public XMLToStudentPojo(String fileName) {
		this.fileName = fileName;
	}

	public List<Student> getStudents() {
		Semester semester = new XMLRead().parseToPOJO(fileName);
		parseToStudentArr(semester);
		System.out.println(studentsList.size());
		return studentsList;
	}

	private void parseToStudentArr(Semester semester) {
		Person[] persons = semester.getFall().getPerson();
		for (int i = 0; i < persons.length; i++) {
			Person person = persons[i];
//			System.out.println(person.getFName());
//			System.out.println(person.getLName());
//			System.out.println(person.getGender());
//			System.out.println(person.getDob().getDoB());
////			System.out.println(person.getHobbies().hobbiesClassValue.getHobby());
//			System.out.println(person.getAddress().getHouse());
//			System.out.println(person.getAddress().getStreet());
//			System.out.println(person.getAddress().getState());
//			System.out.println(person.getAddress().getCity());
//			System.out.println(person.getAddress().getPostalCode());
//			System.out.println(person.getSubjects().getSubject());
//			System.out.println(person.getContact());
////			for (int j = 0; j < person.getSubjects().getSubject().length; j++) {
////				System.out.println(person.getSubjects().getSubject()[i]);
//			}
			Student forList = new Student(person.getFName(), person.getLName(), person.getGender(),
					person.getDob().getDoB(), "mail@gmail.com", person.getAddress().getHouse(),
					person.getAddress().getStreet(), person.getAddress().getState(), person.getAddress().getCity(),
					person.getAddress().getPostalCode(), person.getContact(),person.getSubjects().getSubject());
			studentsList.add(forList);
		}
	}
}
