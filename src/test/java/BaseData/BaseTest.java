package BaseData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
    protected static WebDriver driver;
    private static Logger log = LoggerFactory.getLogger("BaseData.BaseTest.class");

    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        log.info("***** Driver is initiated properly *****");
        log.info("***** Still before test *****");
    }

    @BeforeEach
    void setup() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        driver = new ChromeDriver(option);
//        driver.manage().window().maximize();
        log.info("***** Window is correctly maximized *****");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        log.info("***** Window is correctly closed *****");
    }
}
