import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ATP_Product extends BaseTest{

    HomePage HOMEPAGE;
    ProductPage PRODUCTPAGE;
    ProductSummaryPage PRODUCTSUMMARYPAGE;
    CartPage CARTPAGE;
    RegisterPage REGISTERPAGE;
    LoginPage LOGINPAGE;

    @Test
    @Order(1)
    public  void register(){
        REGISTERPAGE = new RegisterPage(DRIVER);
        REGISTERPAGE. loginButton().Login();
        REGISTERPAGE.selectRegister();
        REGISTERPAGE.emailBox().setRegister("email");
        REGISTERPAGE.radioButton().gender();
        REGISTERPAGE.firstNameBox().firstName("First name");
        REGISTERPAGE.lastNameBox().lastName("Last name");
        REGISTERPAGE.addressNameBox().addressName("Address name");
        REGISTERPAGE.cityNameBox().cityName("City name");
        REGISTERPAGE.stateBox().selectState();
        REGISTERPAGE.postCodeBox().postCode("Postal Code");
        REGISTERPAGE.countryBox().selectCountry();
        REGISTERPAGE.phoneBox().phone("phone");
        REGISTERPAGE.selectRegister2();
        Assertions.assertTrue(REGISTERPAGE.isOnRegisterPage(), "Not on register page");
    }

    @Test
    @Order(2)
    public  void login(){
        LOGINPAGE = new LoginPage(DRIVER);
        REGISTERPAGE. loginButton().Login();
        LOGINPAGE.selectLogin();
        LOGINPAGE.userBox().userName("User Mail Address");
        LOGINPAGE.passwordBox().password("Password");
        LOGINPAGE.signIn();
        Assertions.assertTrue(LOGINPAGE.isOnLoginPage(), "Not on login page");
    }

    @Test
    @Order(3)
    public  void searchProduct(){
        HOMEPAGE = new HomePage(DRIVER);
        PRODUCTPAGE = new ProductPage(DRIVER);
        HOMEPAGE.seachBox().search("Dress");
        Assertions.assertTrue(PRODUCTPAGE.isOnProductPage(), "Not on product page");
    }

    @Test
    @Order(4)
    public  void selectProduct(){
        PRODUCTSUMMARYPAGE = new ProductSummaryPage(DRIVER);
        PRODUCTPAGE.selectProducts(1);
        Assertions.assertTrue(PRODUCTSUMMARYPAGE.isOnProductSummaryPage(), "Not on product summary page");
    }

    @Test
    @Order(5)
    public  void addProduct(){
        PRODUCTSUMMARYPAGE.addToCart();
        Assertions.assertTrue(HOMEPAGE.isProductCount(), "Product count did not increase");
    }

    @Test
    @Order(6)
    public  void cartPage(){
        CARTPAGE = new CartPage(DRIVER);
        HOMEPAGE.goToCart();
        Assertions.assertTrue(CARTPAGE.checkIfProductAdded(), "Product was not added to cart");
    }
}

