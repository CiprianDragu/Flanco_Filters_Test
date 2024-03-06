package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class HomePage extends BasePage {
    @FindBy(id = "searchingfield")
    WebElement clickForSearch;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void pressSearchField() {
        clickForSearch.sendKeys(Constants.OBJECT);

    }
}
