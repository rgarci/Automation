package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Snapshots {

    public static void takeSS(WebDriver driver, String fileName) throws IOException {

        TakesScreenshot ts = (TakesScreenshot)driver;

        File file = ts.getScreenshotAs(OutputType.FILE);
        DateFormat dateFormat = new SimpleDateFormat("-dd-MM-yyyy-hh-mm-ss");
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String dateHour =dateFormat.format(date);

        String path;
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            File directory = new File("snapshots");
            if(directory.exists() && directory.isDirectory()){
                FileUtils.copyFile(file, new File(directory, fileName + dateHour + ".png"));
            }else{
                System.out.println("No se encontró el directorio");
            }
        }else{
            path = "." + File.separator + "snapshots" + File.separator + fileName + dateHour + ".png";
            FileUtils.copyFile(file, new File(path));
        }

        System.out.println("Se ha guardado la captura de pantalla del error en el directorio \"snapshots\" con el nombre " + fileName+dateHour);
    }

    public static void deletePreviousSS(String fileName){

        try (DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(Paths.get(System.getProperty("os.name").toLowerCase().contains("windows")? "snapshots" + File.separator : "." + File.separator +"snapshots" + File.separator), fileName + "*")) {

            for (final Path newDirectoryStreamItem : newDirectoryStream) {
                Files.delete(newDirectoryStreamItem);
            }
        } catch (final Exception e) {
            System.out.println("Hubo un error al borrar el archivo");
        }

    }
}
