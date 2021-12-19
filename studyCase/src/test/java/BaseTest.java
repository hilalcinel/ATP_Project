import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    public static WebDriver DRIVER;
    private static String BASEURL;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\study\\chromedriver.exe");
        DRIVER = new ChromeDriver();
        BASEURL = "http://automationpractice.com/";
        DRIVER.manage().window().maximize();
    }

    @AfterAll
    public void tearDown(){
        DRIVER.quit();
    }

}
