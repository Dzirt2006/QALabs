package demoqa.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import demoqa.tests.Student;
import filereader.CSVRead;
import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.KeyPressers;
import frameworks.ReactDropdown;
import frameworks.ReactMenu;

public class MainForm extends BasePage implements ElementSearchers, KeyPressers, ReactMenu {
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

	@FindBy(how = How.XPATH, using = "//*[@id='city']/div/div[1]/div[1]")
	private WebElement city;

	@FindBy(how = How.ID, using = "submit")
	private WebElement submit;

	public MainForm fillUpForm(int studentIndex) {
		Student student = list.get(studentIndex);
		fillName(student.firstName, student.lastName);
		fillEmail(student.email);
		fillGender(student.gender);
		fillNumber(student.mobile);
		fillDoB(student.dob);
		fillSubject(student.subjects);
		fillAddress(student.street + " " + student.houseNumber);
		fillHobby(student.hobby);
		fillState(student.state);
		fillCity(student.city);
		submit();
		return this;
	}

	private void submit() {
		submit.click();
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

	private void fillHobby(String hobby) {
		switch (hobby) {
		case "Sports":
			elementByXpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label", driver).click();
			break;
		case "Reading":
			elementByXpath("//*[@id='hobbiesWrapper']/div[2]/div[2]/label", driver).click();
			break;
		case "Music":
			elementByXpath("//*[@id='hobbiesWrapper']/div[2]/div[3]/label", driver).click();
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
		System.out.println(number);
		this.userNumber.sendKeys(number);
	}

	private void fillDoB(String dob) {
		this.dateOfBirthInput.click();
		pressCtrlA();
		this.dateOfBirthInput.sendKeys(dob);
		pressEnter();
	}

	private void fillState(String state) {
		fillMenu(state, this.state, driver);
	}

	private void fillCity(String city) {
		fillMenu(city, this.city, driver);
	}

	private void fillSubject(String[] subject) {
		for (String sbjct : subject) {
			this.subjectsInput.sendKeys(sbjct);
			implisitWait(driver, 500);
			pressEnter();
		}
	}

}
