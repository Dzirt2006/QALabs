package bddTheInternet.stepDefenitions;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import theInternet.pages.ContextMenuPage;

public class ContextMenu extends CucumberBaseHook {
	ContextMenuPage page;

	@Before()
	public void getDataFromProps() {
		beforeMethod();
	}

	@Given("I need to redirect to context menu page")
	public void i_need_to_redirect_to_context_menu_page() {
		page = new ContextMenuPage(BaseUrl, driver).navigateTo();
	}

	@When("I make a context click in box")
	public void i_make_a_context_click_in_box() {
		page.clickOnBox();
	}

	@Then("I validate the alert")
	public void i_validate_the_alert() {
		boolean actual = page.isAlert();
		Assert.assertTrue(actual);
	}

	@After
	public void afterScenario() {
		afterMethod();
	}

}
