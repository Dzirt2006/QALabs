package bddTheInternet.stepDefenitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import theInternet.pages.BasicAuthPage;


public class BasicAuth extends CucumberBaseHook {

    BasicAuthPage page;

    @Before(order = 1)
    public void getDataFromProps() {
        beforeMethod();
    }

    @Before(order = 2)
    public void initialization() {
        page = new BasicAuthPage(BaseUrl, driver);
    }


    @Given("I am on the page")
    public void i_am_on_the_page() {
        page.navigateTo();
    }

    @When("I enter technical single {string} into user and password")
    public void i_enter_technical_single_into_user_and_password(String string) {
        page.login(string);
    }


    @Then("I validate the status of the outcome")
    public void i_validate_the_status_of_the_outcome() {
        Assert.assertTrue(page.isLogedIn());
    }

    @After
    public void afterScenario() {
        afterMethod();
    }
}
