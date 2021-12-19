import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    WebDriver DRIVER;

    public BasePage(WebDriver DRIVER){
        this.DRIVER = DRIVER;
    }

    public WebElement find(By LOCATOR){
        return DRIVER.findElement(LOCATOR);
    }

    public List<WebElement> findAll(By LOCATOR) {
        return DRIVER.findElements(LOCATOR);
    }

    public void click(By LOCATOR){
        find(LOCATOR).click();
    }

    public void type(By LOCATOR, String TEXT){
        find(LOCATOR).sendKeys(TEXT);
    }

    public Boolean isDisplayed(By LOCATOR){
        return find(LOCATOR).isDisplayed();
    }

}
