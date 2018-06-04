import Pages.WalookPage;
import org.junit.jupiter.api.Test;

public class WalookTest extends BaseTest{

    @Test
    void walookTest(){
        try{

            baseUrl = "http://www.walook.com.mx/";
            driver.get(baseUrl);

            WalookPage walookPage = new WalookPage(driver);
            walookPage.goToEmpresa();
            Thread.sleep(2000);

            walookPage.goToServicios();
            Thread.sleep(2000);

            walookPage.goToExperiencia();
            Thread.sleep(2000);

            walookPage.goToContacto();
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
            errors.append(e);
        }
    }
}
