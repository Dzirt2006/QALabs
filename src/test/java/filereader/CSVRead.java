package filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import demoqa.Student;

public class CSVRead {

	@SuppressWarnings("deprecation")
	public List<?> csvRead(String path) {
//		// Hashmap to map CSV data to
//		// Bean attributes.
//		Map<String, String> mapping = new HashMap<String, String>();
//		mapping.put("name", "Name");
//		mapping.put("rollno", "RollNo");
//		mapping.put("department", "Department");
//		mapping.put("result", "Result");
//		mapping.put("cgpa", "Pointer");

		// HeaderColumnNameTranslateMappingStrategy
		// for Student class
//		HeaderColumnNameTranslateMappingStrategy<Student> strategy = new HeaderColumnNameTranslateMappingStrategy<Student>();
//		strategy.setType(Student.class);
//		strategy.setColumnMapping(mapping);

		String[] columns = new String[] { "lastFirst", "dob", "email", "houseNumber", "street", "state", "city",
				"postalCode", "mobile", "gender", "subjects", "hobby" };
		final ColumnPositionMappingStrategy<Student> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(Student.class);
		strategy.setColumnMapping(columns);

		// Create castobaen and csvreader object
		CSVReader csvReader = null;
		try {
			URL resource = getClass().getClassLoader().getResource(path);
			csvReader = new CSVReader(new FileReader(resource.getFile()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		CsvToBean csvToBean = new CsvToBean();

		// call the parse method of CsvToBean
		// pass strategy, csvReader to parse method
		List<Student> list = csvToBean.parse(strategy, csvReader);
		return list;
	}

}
