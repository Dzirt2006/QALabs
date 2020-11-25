package filereader;

import java.io.File;
import java.net.URL;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLRead {

	public HashMap<String, String> xmlRead(String path, String[] columns) {
		HashMap<String, String> list = null;
		try {
			URL resource = getClass().getClassLoader().getResource(path);
			File inputFile = new File(resource.getFile());

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("person");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
//					list = contextRunner(eElement, columns);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private Student contextRunner(Element element, String[] headers) {
		HashMap<String, String> student = new HashMap<>();
		Student stud = new Student();
		for (String header : headers) {
			if (element.getElementsByTagName(header).item(0) != null) {
//				String[] atributes = new String[] { "month", "day", "year" };
//				if (element.getElementsByTagName(header).item(0).hasAttributes()) {
//					for (String atribute : atributes) {
//						if (element.getAttribute(atribute) != null) {
//							student.put(atribute, element.getAttribute(atribute));
//						}
//					}
//				} else {
				student.put(header, element.getElementsByTagName(header).item(0).getTextContent().trim());
//				}
			}
		}

		return stud;
	}

	public void parseToPOJO(String path) {
		URL resource = getClass().getClassLoader().getResource(path);
		File inputFile = new File(resource.getFile());
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Semester.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Semester customer = (Semester) jaxbUnmarshaller.unmarshal(inputFile);
			customer.getFall().getPerson()[1].toString();
//			System.out.println(customer.getFall().getPerson()[0]);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
