
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GooglePage;
import pages.WalookPage;

public class MultipleTest extends BaseTest{

    //@Disabled
    @Test
    @DisplayName("Google click in test")
    void googleInTest(){
        try{

            baseUrl = "https://www.google.com.mx/";
            driver.get(baseUrl);
            GooglePage googlePage = new GooglePage(driver);
            googlePage.search("Automation");

            Thread.sleep(1000);

            googlePage.selectIndex(1);

        }catch (Exception e){
            errors.append(e);
            e.printStackTrace();
        }
    }

    //@Disabled
    @Test
    @DisplayName("Google click in text")
    void googleInOtherTest(){
        try{

            baseUrl = "https://www.google.com.mx/";
            driver.get(baseUrl);
            GooglePage googlePage = new GooglePage(driver);
            googlePage.search("Automation");

            Thread.sleep(1000);

            googlePage.selectByText("What is Automation");

        }catch (Exception e){
            errors.append(e);
            e.printStackTrace();
        }
    }

    //@Disabled
    @Test
    @DisplayName("Google click static in test")
    void googleStaticInTest(){
        try{

            baseUrl = "https://www.google.com.mx/";
            driver.get(baseUrl);
            GooglePage.searchStatic(driver, "static Automation");

        }catch (Exception e){
            errors.append(e);
            e.printStackTrace();
        }
    }

    @Disabled
    @Test
    @DisplayName("go to Walook test")
    void walookInTest(){
        try{

            baseUrl = "http://www.walook.com.mx/";
            driver.get(baseUrl);
            WalookPage walookPage = new WalookPage(driver);
            walookPage.goToContacto();

        }catch (Exception e){
            errors.append(e);
            e.printStackTrace();
        }
    }
}
