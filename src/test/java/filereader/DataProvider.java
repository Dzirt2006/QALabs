package filereader;

import java.util.List;

public class DataProvider {
	public List<Student> getStudentsFromFile(String fileName) {
		switch (checkFile(fileName)) {
		case "xml":
			return new XMLToStudentPojo(fileName).getStudents();
		case "csv":
			return new CSVRead().csvRead(fileName);
		default:
			break;
		}
		return null;
	}

	private String checkFile(String fileName) {
		return fileName.substring(fileName.length() - 3);
	}
}
