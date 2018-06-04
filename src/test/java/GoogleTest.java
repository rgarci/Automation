import CambioMoneda.CambioMonedaPage;
import CambioMoneda.ResultadoPage;
import Pages.GooglePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTest extends BaseTest{

    @Test
    void googleTest(){
        try {
            baseUrl = "https://www.google.com.mx/";
            driver.get(baseUrl);
            GooglePage googlePage = new GooglePage(driver);
            googlePage.search("cambio moneda");

            googlePage.selectIndex(3);

            Thread.sleep(5000);

            CambioMonedaPage cambioMonedaPage = new CambioMonedaPage(driver);
            cambioMonedaPage.convertirPesoEuro(3500);

            Thread.sleep(2000);

            ResultadoPage resultadoPage = new ResultadoPage(driver);

            assertEquals("149.15", resultadoPage.getResult(), "El resultado no es correcto");

        }catch (Exception e){
            e.printStackTrace();
            errors.append(e);
        }
    }
}
