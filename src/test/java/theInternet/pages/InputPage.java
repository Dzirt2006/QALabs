package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.InputField;

public class InputPage extends InputField {
	private final String xpath = "/html//div[@id='content']//input[@type='number']";
	private final String url = "/inputs";
	private WebElement mappedElement;

	public InputPage(WebDriver driver, String url) {
		super(driver, url);
	}

	@Override
	public InputPage navigateTo() {
		super.navigateTo(this.url);
		return this;
	}

	public InputPage selectElement() {
		mappedElement = selectElement(this.xpath);
		return this;
	}

	public InputPage setInputData(int number) {
		super.setInputData(mappedElement, number);
		return this;
	}

	public int getDataFromInputField() {
		String result = super.getDataFromInputField(mappedElement);
		@SuppressWarnings("unused")
		int returnVal;
		try {
			returnVal = Integer.parseInt(result);
		} catch (NumberFormatException e) {
			System.err.println(e);
		}
		return returnVal = 0;

	}

}
