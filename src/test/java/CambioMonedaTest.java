
import cambioMoneda.CambioMonedaPage;
import cambioMoneda.ResultadoPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CambioMonedaTest extends BaseTest{

    @Test
    void googleTest(){
        try {
            baseUrl = "https://es.coinmill.com/";
            driver.get(baseUrl);

            CambioMonedaPage cambioMonedaPage = new CambioMonedaPage(driver);
            cambioMonedaPage.convertirPesoEuro(3500);

            Thread.sleep(2000);

            ResultadoPage resultadoPage = new ResultadoPage(driver);

            assertEquals("158.63", resultadoPage.getResult(), "El resultado no es correcto");

        }catch (Exception e){
            e.printStackTrace();
            errors.append(e);
        }
    }
}
