
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.BasePage;
import utils.Constants;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setUP() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }


    @AfterEach
    public void closeBrowser() {
        BasePage basePage = new BasePage(driver);
        basePage.waitInSeconds(4);
        driver.close();
    }
}
