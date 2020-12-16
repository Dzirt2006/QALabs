package bddTheInternet.stepDefenitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import theInternet.pages.AddRemoveElementsPage;


public class AddRemove extends CucumberBaseHook {

    AddRemoveElementsPage page;

    @Before()
    public void getDataFromProps() {
        beforeMethod();
    }


    @Given("I am on home page")
    public void i_am_on_home_page() {
        page = new AddRemoveElementsPage(driver, BaseUrl);
    }


    @When("I click add button {int}")
    public void i_click_add_button(Integer int1) {
        page.clickButton(int1);
    }

    @When("delete button {int}")
    public void delete_button(Integer int1) {
        page.clickDeleteButton(int1);
    }

    @And("I need to redirect to add\\/remove page")
    public void iNeedToRedirectToAddRemovePage() {
        page.navigateTo();
    }


    @After
    public void afterScenario() {
        afterMethod();
    }


    @Then("I validate amount of click buttons {string} and {string}")
    public void iValidateAmountOfClickButtonsAnd(String arg0, String arg1) {
        int finalVal = Integer.parseInt(arg0) - Integer.parseInt(arg1);
        int actual = page.elementsCount();
        Assert.assertEquals(actual, finalVal);
    }
}
