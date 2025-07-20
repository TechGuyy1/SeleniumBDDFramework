package StepDefination;

import PageObjects.DashboardPage;
import basepackage.BaseClass;
import io.cucumber.java.en.And;
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
        dashboardPage.clickRegisterPageOption();
        Assert.assertTrue(dashboardPage.registrationPage());

    }

    @Then("Verify that login option is displayed")
    public void verify_that_login_option_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        dashboardPage.getLoginButton();
    }

    @When("User clicks on the login button, login page displayed")
    public void user_clicks_on_the_login_button_login_page_displayed() {
        // Write code here that turns the phrase above into concrete actions
        dashboardPage.clickLoginButton();
    }

    @Then("User select the gender and enters the first name, last name, email, password and confirm password {string},{string},{string} {string} {string}")
    public void userSelectTheGenderAndEntersTheFirstNameLastNameEmailPasswordAndConfirmPassword(String firstNm, String lastNm, String mail, String pass,String confirmPass) {
        dashboardPage.setRegistrationPage(firstNm, lastNm, mail, pass, confirmPass);
    }
    @Then("User clicks on register button")
    public void userClicksOnRegisterButton() {
        dashboardPage.clickOnRegisterButton();
    }

    @And("Verify success message for registration")
    public void verifySuccessMessageForRegistration() {
        dashboardPage.verifySuccessPopupDisplayed();
    }


    @After

    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }



}
