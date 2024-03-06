package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),' Fara Sistem de Operare')]")
    WebElement clickOperationSystem;
    @FindBy(xpath = "(//span[@class='price'])[53]")
    WebElement clickPrice;
    @FindBy(xpath = "//span[contains(text(),'Lenovo')]")
    WebElement clickBrand;
    @FindBy(xpath = "//span[contains(text(),'Home')]")
    WebElement clickUtilization;
    @FindBy(xpath = "//span[contains(text(),'Ryzen 5')]")
    WebElement processorType;
    @FindBy(xpath = "//span[contains(text(),'6')]")
    WebElement coresNumbers;
    @FindBy(xpath = " (//div[@class='footer-wrapper'])[1]")
    WebElement gotoFooter;


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void chooseFromCategory() {
        clickOperationSystem.click();
    }

    public void selectPrice() {
        clickPrice.click();
    }

    public void selectBrand() {
        clickBrand.click();
    }

    public void selectUtilizationPurpose() {
        clickUtilization.click();
    }

    public void selectProcessorType() {
        processorType.click();
    }

    public void selectCoresNumbers() {
        coresNumbers.click();
    }

    public void listOfProducts() {
        List<WebElement> products = driver.findElements(By.xpath("//button[contains(text(),'Adauga in cos')]"));
        int size = products.size();
        System.out.println("You Have " + size + " Laptops in your list" + " to choose from ");

    }

    public void moveToFooterSpace() {
        scrollToElement(gotoFooter);

    }


    public void listOfLinks() {
        List<WebElement> links = driver.findElements(By.xpath("//li[@class='item-footer']"));
        int size = links.size();
        System.out.println("In footer space you have a total of " + size + " links to check");
    }
}

