import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctionalTest {
    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        var lxResourcePath = "src/test/resources/chromedriver";
        var operatingSystem = System.getProperty("os.name").toLowerCase();
        var resourcePath = operatingSystem.contains("windows") ? lxResourcePath + ".exe" : lxResourcePath;
        System.setProperty("webdriver.chrome.driver", resourcePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
