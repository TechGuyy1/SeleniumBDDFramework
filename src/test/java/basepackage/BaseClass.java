package basepackage;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseClass {
    public static WebDriver driver;

    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @After

    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}