package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.BasePage;
import frameworks.ElementSearchers;

public class ForgotPasswordPage extends BasePage implements ElementSearchers {
	String direct = "/forgot_password";
	String emailDirect = "https://endtest.io/mailbox?email=vipors@endtest-mail.io";
	String email = "vipors@endtest-mail.io";
	// div[@id='big_container']//div[@class='email_item
	// extra_bottom_border']//p[@class='from_item']

	public ForgotPasswordPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public ForgotPasswordPage navigateTo() {
		super.navigateTo(direct);
		return this;
	}

	public ForgotPasswordPage navigateToEmail() {
		driver.get(emailDirect);
		super.refresh();
		return this;
	}

	public ForgotPasswordPage retrievePass() {
		elementById("email", driver).sendKeys(email);
		elementByXpath("//button[@id='form_submit']", driver).click();
		return this;
	}

	public String getEmail() {
		elementByXpath("//div[@id='big_container']/div[@class='email_list']/div[1]", driver).click();
		return waitVisibilityXPath(driver,
				"//div[@id='big_container']//div[@class='email_item extra_bottom_border']//p[@class='from_item']")
						.getText().substring(6);
	}

}
