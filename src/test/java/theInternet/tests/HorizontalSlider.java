package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.HorizontalSliderPage;

public class HorizontalSlider extends TheInternetTestBase {

	@Test
	public void slider() {
		HorizontalSliderPage page = new HorizontalSliderPage(BaseUrl, driver);
		float sliderValue = page.navigateTo().selectSlider().moveSliderOnCenter().getSliderValue();
		float spanSliderValue = page.getSliderSpanValue();
		Assert.assertEquals(sliderValue, spanSliderValue);
	}

}
