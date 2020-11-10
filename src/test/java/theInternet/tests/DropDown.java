package theInternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import theInternet.pages.DropdownListPage;

public class DropDown extends TheInternetTestBase {

	@Test
	public void dropdown() {
		String optionForSelect = "Option 2";
		String currentOption = new DropdownListPage(driver, BaseUrl).navigateTo().selectOptionByText(optionForSelect)
				.getSelectedOption();
		Assert.assertEquals(currentOption, optionForSelect);
	}
}
