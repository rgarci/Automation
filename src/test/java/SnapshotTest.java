import utilities.Snapshots;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class SnapshotTest extends BaseTest{

    private String testName = "snapshotTest";

    @DisplayName("Test de captura de pantalla")
    @Test
    public void pruebaSnapshot() throws IOException {

        try{
            Snapshots.deletePreviousSS(testName);
            baseUrl = "https://www.seleniumhq.org/";
            driver.get(baseUrl);

             throw new Exception();

        }catch(Exception e) {
            Snapshots.takeSS(driver, testName);
            e.printStackTrace();
            errors.append(e);
        }
    }
}
