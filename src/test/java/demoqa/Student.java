package demoqa;

public class Student {
	String lastName, firstName, dob, email, houseNumber, street, state, city, postalCode, mobile, gender, subjects,
			hobby;

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
		System.out.println(lastFirst);
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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
		this.subjects = subjects;
	}

}
