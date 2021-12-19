import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage {

    TextAreas seachBox;
    By cartCountLocator = new By.ByCssSelector("span.ajax_cart_quantity");

    public HomePage(WebDriver DRIVER) {
        super(DRIVER);
        seachBox = new TextAreas(DRIVER);
    }

    public TextAreas seachBox() {
        return this.seachBox;
    }

    public boolean isProductCount() {

        return getCartCount() > 0;
    }

    public void goToCart() {

        click(cartCountLocator);
    }

    private int getCartCount(){
        String COUNT = find(cartCountLocator).getText();
        return Integer.parseInt(COUNT);
    }

}
