package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.HorizontalSliderActions;

public class HorizontalSliderPage extends BasePage implements ElementSearchers, HorizontalSliderActions {
	String direction = "/horizontal_slider";
	String sliderXPath = "//div[@id='content']//input";
	String valueSpanXPath = "//div[@id='content']//span";
	WebElement slider;

	public HorizontalSliderPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public HorizontalSliderPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public HorizontalSliderPage selectSlider() {
		slider = elementByXpath(sliderXPath, driver);
		return this;
	}

	public HorizontalSliderPage moveSliderOnCenter() {
		changeSliderValue(slider);
		return this;
	}

	public float getSliderValue() {
		return sliderValue(slider, driver);
	}

	public float getSliderSpanValue() {
		return Float.parseFloat(elementByXpath(valueSpanXPath, driver).getText());
	}
}
