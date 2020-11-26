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

	public List<Student> getStudentsFromDB(String connectionString, String query) {

		return new DBStudentQ(connectionString, query).connectDb().getStudets();
	}

	private String checkFile(String fileName) {
		return fileName.substring(fileName.length() - 3);
	}
}
