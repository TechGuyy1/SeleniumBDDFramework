package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
WebDriver driver;
    public DashboardPage(WebDriver driver){
        this.driver=driver;
    }
    By register= By.xpath("//a[@class='ico-register']");
    By login=By.xpath("//*[@href='/login']");
    By registrationPage=By.xpath("//div[@class='page registration-page']");
    //div[@class='page registration-page']
    //class="page registration-page"
    public WebElement getRegisterButton(){
        System.out.println("Register Button:"+ driver.findElement(register).getText());
       return driver.findElement(register);

    }

    public void getLoginButton(){
        driver.findElement(login);

    }
    public void clickOnRegisterButton(){
        driver.findElement(register).click();
    }
    public boolean registrationPage(){
 driver.findElement(registrationPage);
        return true;
    }

}
