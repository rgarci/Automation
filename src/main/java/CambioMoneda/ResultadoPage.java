package CambioMoneda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultadoPage {

    private WebDriver driver;
    private static ResultadoPage resultadoPage;

    public ResultadoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#currencyBox1 > input")
    private WebElement resul;

    public String getResult(){
        return resul.getAttribute("value");
    }


}
