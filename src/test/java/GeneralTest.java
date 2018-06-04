import Pages.GooglePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeneralTest extends BaseTest{

    //@Disabled
    @Test
    @DisplayName("Google click inner test")
    void googleInnerTest(){
        try{

            baseUrl = "https://www.google.com.mx/";
            driver.get(baseUrl);
            GooglePage googlePage = new GooglePage(driver);
            googlePage.search("Automation");

        }catch (Exception e){
            errors.append(e);
            e.printStackTrace();
        }
    }

    //@Disabled
    @Test
    @DisplayName("Google click static inner test")
    void googleStaticInnerTest(){
        try{

            baseUrl = "https://www.google.com.mx/";
            driver.get(baseUrl);
            GooglePage.searchStatic(driver, "static Automation");

        }catch (Exception e){
            errors.append(e);
            e.printStackTrace();
        }
    }

    //@Disabled
    @Test
    @DisplayName("Walook inner test")
    void walookInnerTest(){
        try{

            baseUrl = "http://www.walook.com.mx/";
            driver.get(baseUrl);

        }catch (Exception e){
            errors.append(e);
            e.printStackTrace();
        }
    }
}
