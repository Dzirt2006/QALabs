package filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.net.URL;

import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

import demoqa.Student;

public class CSVRead {

	@SuppressWarnings("deprecation")
	public List<Student> csvRead(String path) {

		String[] columns = new String[] { "lastFirst", "dob", "email", "houseNumber", "street", "state", "city",
				"postalCode", "mobile", "gender", "subjects", "hobby" };
		final ColumnPositionMappingStrategy<Student> strategy = new ColumnPositionMappingStrategy<>();
		strategy.setType(Student.class);
		strategy.setColumnMapping(columns);

		CSVReader csvReader = null;
		try {
			URL resource = getClass().getClassLoader().getResource(path);
			csvReader = new CSVReader(new FileReader(resource.getFile()), CSVParser.DEFAULT_SEPARATOR,
					CSVParser.DEFAULT_QUOTE_CHARACTER, 1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		CsvToBean csvToBean = new CsvToBean();


		List<Student> list = csvToBean.parse(strategy, csvReader);
		return list;
	}


}
