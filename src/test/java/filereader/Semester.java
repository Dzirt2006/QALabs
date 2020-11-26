package filereader;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

//Semester.java
@XmlRootElement(name = "semester")
public class Semester {
	private Fall fall;

	public Fall getFall() {
		return fall;
	}

	@XmlElement(name = "fall")
	public void setFall(Fall value) {
		this.fall = value;
	}
}

//Fall.java
//@XmlRootElement(name = "fall")
class Fall {
	private Person[] person;

	@XmlElement(name = "person")
	public Person[] getPerson() {
		return person;
	}

	public void setPerson(Person[] value) {
		this.person = value;
	}
}

//Person.java

class Person {

	private String fName;

	private String lName;

	private Dob dob;

	private String gender;

	private String contact;
//	private ContactUnion contact;

	private Subjects subjects;

	private HobbiesUnion hobbies;

	private Address address;

	@XmlElement(name = "f_name")
	public String getFName() {
		return fName;
	}

	public void setFName(String value) {
		this.fName = value;
	}

	@XmlElement(name = "l_name")
	public String getLName() {
		return lName;
	}

	public void setLName(String value) {
		this.lName = value;
	}

	public Dob getDob() {
		return dob;
	}

	public void setDob(Dob value) {
		this.dob = value;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String value) {
		this.gender = value;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String value) {
		this.contact = value;
	}

//	public ContactUnion getContact() {
//		return contact;
//	}
//
//	public void setContact(ContactUnion value) {
//		this.contact = value;
//	}

	public Subjects getSubjects() {
		return subjects;
	}

	public void setSubjects(Subjects value) {
		this.subjects = value;
	}

	public HobbiesUnion getHobbies() {
		return hobbies;
	}

	public void setHobbies(HobbiesUnion value) {
		this.hobbies = value;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address value) {
		this.address = value;
	}

	@Override
	public String toString() {
		System.out.println(fName + " " + lName + " " + gender + " " + " " + subjects.getSubject().length + " "
				+ address.getAdress() + " " + hobbies.stringValue + " " + dob.getDoB() 
				+ " " + contact);
//				+ contact.contactElementValue.getType());
		return super.toString();
	}
}

class Address {
	private String house;
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String type;

	public String getHouse() {
		return house;
	}

	public void setHouse(String value) {
		this.house = value;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String value) {
		this.street = value;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String value) {
		this.city = value;
	}

	public String getState() {
		return state;
	}

	public void setState(String value) {
		this.state = value;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String value) {
		this.postalCode = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String value) {
		this.type = value;
	}

	public String getAdress() {
		return house + " " + street + " " + state + " " + city;
	}
}

//ContactUnion.java

class ContactUnion {
	public ContactElement[] contactElementArrayValue;
	public ContactElement contactElementValue;
}

class ContactElement {
	private String type;
	private String text;

	public String getType() {
		return type;
	}

	@XmlAttribute(name = "type")
	public void setType(String value) {
		this.type = value;
	}

	@XmlValue
	public String getText() {
		return text;
	}

	public void setText(String value) {
		this.text = value;
	}
}

class Dob {
	private String month;
	private String day;
	private String year;

	public String getMonth() {
		return month;
	}

	@XmlAttribute(name = "month")
	public void setMonth(String value) {
		this.month = value;
	}

	public String getDay() {
		return day;
	}

	@XmlAttribute(name = "day")
	public void setDay(String value) {
		this.day = value;
	}

	public String getYear() {
		return year;
	}

	@XmlAttribute(name = "year")
	public void setYear(String value) {
		this.year = value;
	}

	public String getDoB() {
		return month + " " + day + " " + year;
	}
}
@XmlRootElement(name="hobbies")
class HobbiesUnion {
	public HobbiesClass hobbiesClassValue;
	public String stringValue;
}

//HobbiesClass.java
class HobbiesClass {
	private String hobby;

	public String getHobby() {
		return hobby;
	}
	@XmlElement(name = "hobby")
	public void setHobby(String value) {
		this.hobby = value;
	}
}

//Subjects.java

class Subjects {
	private String[] subject;

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] value) {
		this.subject = value;
	}
}
