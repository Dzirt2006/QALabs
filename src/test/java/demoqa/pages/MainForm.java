package demoqa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import demoqa.Student;
import filereader.CSVRead;
import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.KeyPressers;

public class MainForm extends BasePage implements ElementSearchers, KeyPressers {
	List<Student> list = null;

	public MainForm(String url, WebDriver driver) {
		super(url, driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "subjectsInput")
	private WebElement subjectsInput;

	@FindBy(id = "firstName")
	private WebElement firstName;

	@FindBy(how = How.ID, using = "lastName")
	private WebElement lastName;

	@FindBy(how = How.ID, using = "userEmail")
	private WebElement email;

	@FindBy(how = How.ID, using = "userNumber")
	private WebElement userNumber;

	@FindBy(how = How.ID, using = "currentAddress")
	private WebElement currentAddress;

	@FindBy(how = How.ID, using = "dateOfBirthInput")
	private WebElement dateOfBirthInput;

	@FindBy(how = How.XPATH, using = "//*[@id='state']/div/div[1]/div[1]")
	private WebElement state;

	public MainForm fillUpForm(int studentIndex) {
		Student student = list.get(studentIndex);
//		fillName(student.firstName, student.lastName);
//		fillEmail(student.email);
//		fillGender(student.gender);
//		fillNumber(student.mobile);
		fillDoB(student.dob);
//		fillSubject(student.subjects);
//		fillAddress(student.street + " " + student.houseNumber);
//		fillState(student.state);

		return this;
	}

	private void fillGender(String gender) {
		switch (gender) {
		case "M":
			elementByXpath("//*[@id='genterWrapper']/div[2]/div[1]/label", driver).click();
			break;
		case "F":
			elementByXpath("//*[@id='genterWrapper']/div[2]/div[2]/label", driver).click();
			break;
		case "O":
			elementByXpath("//*[@id='genterWrapper']/div[2]/div[3]/label", driver).click();
			break;
		default:
			break;
		}
	}

	private void fillName(String firstN, String lastN) {
		firstName.sendKeys(firstN);
		lastName.sendKeys(lastN);
	}

	private void fillEmail(String email) {
		this.email.sendKeys(email);
	}

	private void fillAddress(String address) {
		this.currentAddress.sendKeys(address);
	}

	private void fillNumber(String number) {
		this.userNumber.sendKeys(number);
	}

	private void fillDoB(String dob) {
		this.dateOfBirthInput.click();
		pressCtrlA();
		this.dateOfBirthInput.sendKeys(dob);
		pressEnter();
	}

	private void fillState(String state) {
		waitVisibility(this.state, driver).click();
		this.state.sendKeys(state);
		implisitWait(driver, 500);
//		pressEnter();
	}

	private void fillSubject(String[] subject) {
		for (String sbjct : subject) {
			this.subjectsInput.sendKeys(sbjct);
			implisitWait(driver, 500);
			pressEnter();
		}
	}

}
