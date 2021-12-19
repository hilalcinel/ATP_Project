import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{

    By productNameLocator = By.id("total_product");

    public CartPage(WebDriver DRIVER) {
        super(DRIVER);
    }

    public boolean checkIfProductAdded() {
        return  getProducts().size() >0;
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }
}
