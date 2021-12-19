import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    By loginLocator = By.id("login_form");
    By signIn = new By.ByCssSelector("span.icon-lock left");

    public LoginPage(WebDriver DRIVER) {
        super(DRIVER);
    }

    public void selectLogin() {
        click(loginLocator);
    }

    public boolean isOnLoginPage() {
        return isDisplayed(loginLocator);
    }

    public TextAreas userBox() {
        return this.userBox();
    }

    public TextAreas passwordBox() {
        return this.passwordBox();
    }

    public void signIn() {
        click(signIn);
    }
}
