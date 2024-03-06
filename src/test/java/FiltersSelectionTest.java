import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ProductsPage;

public class FiltersSelectionTest extends BaseTest {
    @Test
    public void filtersTest() {
        HomePage homePage = new HomePage(driver);
        homePage.pressSearchField();
        homePage.pressEnterKey();
        homePage.waitInSeconds(4);
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.chooseFromCategory();
        productsPage.waitInSeconds(2);
        productsPage.selectPrice();
        productsPage.waitInSeconds(3);
        productsPage.selectBrand();
        productsPage.waitInSeconds(3);
        productsPage.selectUtilizationPurpose();
        productsPage.waitInSeconds(3);
        productsPage.selectProcessorType();
        productsPage.waitInSeconds(5);
        productsPage.selectCoresNumbers();
        productsPage.waitInSeconds(3);
        productsPage.listOfProducts();
        productsPage.waitInSeconds(2);
        productsPage.moveToFooterSpace();
        productsPage.waitInSeconds(3);
        productsPage.listOfLinks();
    }
}
