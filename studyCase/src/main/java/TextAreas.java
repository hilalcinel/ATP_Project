import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TextAreas extends BasePage{

    By searchBoxLocator = By.id("search_query_top");
    By submitButtonLocator = new By.ByCssSelector("span.btn btn-default button-search");
    By emailLocator = By.id("email_create");
    By registerButtonLocator = new By.ByCssSelector("span.icon-user left");
    By loginButtonLocator = new By.ByCssSelector("span.header_user_info login");
    By radioButtonLocator = By.id("id_gender");
    By firstNameLocator = By.id("firstname");
    By lastNameLocator = By.id("lastname");
    By addressNameLocator = By.id("address1");
    By cityNameLocator = By.id("uniform-id_state");
    By stateLocator = By.id("id_state");
    By postCodeLocator = By.id("postcode");
    By phoneBoxLocator = By.id("phone_mobile");
    By userBoxLocator = By.id("email");
    By passwordLocator = By.id("passwd");

    public TextAreas(WebDriver DRIVER) {
        super(DRIVER);
    }

    public void Login(){
        click(loginButtonLocator);
    }
    public void search(String text) {
        type(searchBoxLocator, text);
        click(submitButtonLocator);
    }
    public void setRegister(String text) {
        click(loginButtonLocator);
        type(emailLocator, text);
        click(registerButtonLocator);
    }
    public void gender() {
        click(radioButtonLocator);
    }
    public void firstName(String text) {
        click(firstNameLocator);
        type(firstNameLocator, text);
    }
    public void lastName(String text) {
        click(lastNameLocator);
        type(lastNameLocator, text);
    }
    public void addressName(String text) {
        click(addressNameLocator);
        type(addressNameLocator, text);
    }
    public void cityName(String text) {
        click(cityNameLocator);
        type(cityNameLocator, text);
    }
    public void selectState() {
        try{
            Thread.sleep(5000);
            Select DROPDOWN = new Select(DRIVER.findElement(stateLocator));
            DROPDOWN.deselectByIndex(2);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void postCode(String text) {
        click(postCodeLocator);
        type(postCodeLocator, text);
    }
    public void selectCountry() {
        try{
            Thread.sleep(5000);
            Select DROPDOWN = new Select(DRIVER.findElement(stateLocator));
            DROPDOWN.deselectByIndex(2);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void phone(String text) {
        click(phoneBoxLocator);
        type(phoneBoxLocator, text);
    }
    public void userName(String text) {
        type(userBoxLocator, text);
        click(userBoxLocator);
    }
    public void password(String text) {
        type(passwordLocator, text);
        click(passwordLocator);
    }
}
