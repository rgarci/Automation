package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    private WebElement boxSearch;

    public void search(String token){
        boxSearch.sendKeys(token);
        boxSearch.sendKeys(Keys.ENTER);
    }


    static WebElement boxSearchs;

    public static void searchStatic(final WebDriver driver, String token){
        boxSearchs = driver.findElement(By.name("q"));
        boxSearchs.sendKeys(token);
        boxSearchs.sendKeys(Keys.ENTER);
    }

    private WebElement pageLink;

    public void selectIndex(int index){
        String selector = "#rso > div:nth-child(1) > div > div:nth-child(" + index + ") > div > div > h3 > a";
        pageLink = new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
        pageLink.click();
    }
}
