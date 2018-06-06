import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.fail;

public class BaseTest {
    WebDriver driver;
    StringBuffer errors;
    String baseUrl;

    @BeforeEach
    public  void beforeTest(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("test-type");
        chromeOptions.addArguments("no-sandbox");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("deny-permission-prompts");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        errors = new StringBuffer();
    }

    @AfterEach
    public  void afterTest(){
        driver.close();
        String verificationErrorString = errors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
