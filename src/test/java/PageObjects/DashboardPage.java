package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.Assert;


public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By register = By.xpath("//a[@class='ico-register']");
    By login = By.xpath("//*[@href='/login']");
    By registrationPage = By.xpath("//div[@class='page registration-page']");
    By gender = By.xpath("//input[@id = 'gender-female']");
    By firstName = By.xpath("//input[@id = 'FirstName']");
    By lastName = By.xpath("//input[@id = 'LastName']");
    By email = By.xpath("//input[@id = 'Email']");
    By pass = By.xpath("//input[@id = 'Password']");
    By confirmPassword = By.xpath("//input[@id = 'ConfirmPassword']");
    By registerButton = By.xpath("//input[@id = 'register-button']");
    By successMsg = By.xpath("//div[@class = 'result']");

    //div[@class='page registration-page']
    //class="page registration-page"
    public WebElement getRegisterButton() {
        System.out.println("Register Button:" + driver.findElement(register).getText());
        return driver.findElement(register);

    }

    public void getLoginButton() {
        String loginText = driver.findElement(login).getText();
        Assert.assertEquals(loginText, "Log in");

    }

    public void setRegistrationPage(String firstNm, String lastNm, String mail, String password, String confirmPass) {
        driver.findElement(gender).click();
        driver.findElement(firstName).sendKeys(firstNm);
        driver.findElement(lastName).sendKeys(lastNm);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(confirmPassword).sendKeys(confirmPass);
    }

        public void verifySuccessPopupDisplayed(){
        String actualText = driver.findElement(successMsg).getText();
        if(actualText.equalsIgnoreCase("Your registration completed"))
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }


    public void clickRegisterPageOption(){
        driver.findElement(register).click();
    }

    public void clickLoginButton(){
          driver.findElement(login).click();
          String loginButton = driver.findElement(login).getText();
          Assert.assertEquals(loginButton, "Log in");
    }



    public void clickOnRegisterButton(){
        driver.findElement(registerButton).click();
    }
    public boolean registrationPage(){
 driver.findElement(registrationPage);
        return true;
    }

}
