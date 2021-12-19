import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

    By registerLocator = By.id("noSlide");
    By registerLocator2 = new By.ByCssSelector("span.icon-chevron-right right");

    public RegisterPage(WebDriver DRIVER) {
        super(DRIVER);
    }

    public boolean isOnRegisterPage() {

        return isDisplayed(registerLocator);
    }

    public void selectRegister() {
        click(registerLocator);
    }

    public TextAreas emailBox() {

        return this.emailBox();
    }

    public TextAreas radioButton() {

        return this.radioButton();
    }

    public TextAreas firstNameBox() {
        return this.firstNameBox();
    }

    public  TextAreas loginButton() {
        return this.loginButton();
    }

    public  TextAreas lastNameBox() {
        return this.lastNameBox();
    }

    public TextAreas addressNameBox() {
        return this.addressNameBox();
    }

    public TextAreas cityNameBox() {
        return this.cityNameBox();
    }

    public TextAreas stateBox() {
        return this.stateBox();
    }

    public TextAreas postCodeBox() {
        return this.postCodeBox();
    }

    public TextAreas countryBox() {
        return this.countryBox();
    }

    public TextAreas phoneBox() {
        return this.phoneBox();
    }

    public void selectRegister2() {
        click(registerLocator2);
    }
}
