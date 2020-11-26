package filereader;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBStudentQ extends DBConnector {
	String query;
	List<Student> list;
	{
		list = new ArrayList<>();
	}

	public DBStudentQ(String connectionString, String query) {
		super(connectionString);
		this.query = query;
	}

	public List<Student> getStudets() {
		ResultSet resultSet = super.query(query);
		try {
			while (resultSet.next()) {
				String fname = resultSet.getString("");
				String lName = resultSet.getString("");
				String gender = gender(resultSet.getBoolean("isMale"));
				String dob = dob(resultSet.getDate("birthdate"));
				String phone = resultSet.getString("phone");
				String address = resultSet.getString("address");
				String state = resultSet.getString("District");
				String city = resultSet.getString("Name");
				Student student = new Student(fname, lName, gender, dob, phone, address, state, city);
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	private String gender(boolean isMale) {
		if (isMale) {
			return "male";
		} else {
			return "female";
		}
	}

	private String dob(Date dob) {
		String pattern = "MM/dd/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(dob);
	}

}
