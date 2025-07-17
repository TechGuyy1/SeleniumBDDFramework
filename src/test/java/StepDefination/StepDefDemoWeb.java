package StepDefination;

import PageObjects.DashboardPage;
import basepackage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.testng.Assert;

public class StepDefDemoWeb extends BaseClass {
    DashboardPage dashboardPage;

    @Given("User navigate to the demoweb shop")
    public void navigateToTheDemoWebshop(){
        openBrowser();
        driver.get("https://demowebshop.tricentis.com/login");
        dashboardPage= new DashboardPage(driver);
    }
    @Then("Verify that register option is displayed")
    public void verify_that_register_option_is_displayed() {
        Assert.assertTrue(dashboardPage.getRegisterButton().isDisplayed());

    }
    @When("User clicks on the register button, registration page displayed")
    public void user_clicks_on_the_register_button_registration_page_displayed() {
        dashboardPage.clickOnRegisterButton();
        Assert.assertTrue(dashboardPage.registrationPage());

    }
    @After

    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }


}
