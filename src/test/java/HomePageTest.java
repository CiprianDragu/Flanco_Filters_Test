import org.junit.jupiter.api.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    @Test
    public void goToWebsite() {
    }

    @Test
    public void searchItemsInStore() {
        HomePage homePage = new HomePage(driver);
        homePage.pressSearchField();
        homePage.pressEnterKey();
    }
}
