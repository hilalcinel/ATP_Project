import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSummaryPage extends BasePage {

    By addToCartButtonLocator = By.id("quantity_wanted");

    public ProductSummaryPage(WebDriver DRIVER) {

        super(DRIVER);
    }

    public boolean isOnProductSummaryPage() {

        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {

        click(addToCartButtonLocator);
    }
}
