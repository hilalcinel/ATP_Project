import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{

    By shippingOptionLocator = new By.ByCssSelector("span.page-heading  product-listing");
    By productNameLocator = new By.ByCssSelector("span.product-name");

    public ProductPage(WebDriver DRIVER) {

        super(DRIVER);
    }

    public boolean isOnProductPage() {

        return isDisplayed(shippingOptionLocator);
    }

    public void selectProducts(int i) {

        getAllProduct().get(i).click();
    }

    private List<WebElement> getAllProduct(){

        return findAll(productNameLocator);
    }

}
