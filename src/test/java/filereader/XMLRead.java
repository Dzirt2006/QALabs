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

	public Semester parseToPOJO(String path) {
		URL resource = getClass().getClassLoader().getResource(path);
		File inputFile = new File(resource.getFile());
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Semester.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			return (Semester) jaxbUnmarshaller.unmarshal(inputFile);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

}
