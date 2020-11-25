package filereader;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personAS")
public class Student {
	public String lastName, firstName, dob, email, houseNumber, street, state, city, postalCode, mobile, gender, hobby;

	public String[] subjects;

	public void setCity(String city) {
		this.city = city;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setLastFirst(String lastFirst) {
		String[] firstLast = lastFirst.split(",");
		this.firstName = firstLast[1];
		this.lastName = firstLast[0];
	}

	public void setMobile(String mobile) {
		String[] mobileArr = mobile.split("-");
		String concated = "";
		for (int i = 0; i < mobileArr.length; i++) {
			concated += mobileArr[i];
		}
		this.mobile = concated;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects.split(";");
	}

}