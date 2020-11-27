package demoqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import filereader.Student;
import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.KeyPressers;
import frameworks.ReactMenu;
import frameworks.Table;

public abstract class MainForm extends BasePage implements ElementSearchers, KeyPressers, ReactMenu {

	Student student;

	public MainForm(String url, WebDriver driver, Student student) {
		super(url, driver);
		this.student = student;
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

	public MainForm fillUpForm() {
		System.out.println(student.street + " " + student.houseNumber + " " + student.state + " " + student.city);
		fillName(student.firstName, student.lastName);
		fillEmail(student.email);
		fillDoB(student.dob);
		fillGender(student.gender);
		fillNumber(student.mobile);
		fillAddress(student.street + " " + student.houseNumber);
		fillState(student.state);
		fillCity(student.city);
		fillSubject(student.subjects);
		fillHobby(student.hobby);
		submit();
		return this;
	}

	public String checkInput() {
		String tableXpath = "//table//td[.='Student Name']";
		WebElement element = waitVisibilityXPath(driver, tableXpath);
		String script = "return arguments[0].nextElementSibling.innerText";
		return (String) jsExec(driver, element, script);
	}

	private void submit() {
		submit.click();
	}

	private void fillGender(String gender) {
		switch (gender) {
		case "male":
			waitForClickableByXpath(driver, "//*[@id='genterWrapper']/div[2]/div[1]/label").click();
			break;
		case "female":
			waitForClickableByXpath(driver, "//*[@id='genterWrapper']/div[2]/div[2]/label").click();
			break;
		default:
			waitForClickableByXpath(driver, "//*[@id='genterWrapper']/div[2]/div[3]/label").click();
			break;
		}
		sleepThread(500);
	}

	private void fillHobby(String hobby) {
		System.out.println(hobby);
		if (hobby != null) {
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
		waitForClickable(driver, this.dateOfBirthInput).click();
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
		if (subject != null) {
			for (String sbjct : subject) {
				this.subjectsInput.sendKeys(sbjct);
				implisitWait(driver, 500);
				this.subjectsInput.sendKeys(Keys.TAB);
			}
		}
	}

}
