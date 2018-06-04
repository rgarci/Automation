package CambioMoneda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CambioMonedaPage {

    private WebDriver driver;
    public CambioMonedaPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "amount")
    private WebElement amount;

    @FindBy(name = "from")
    private WebElement from;

    @FindBy(name = "to")
    private WebElement to;

    @FindBy(css = "input[value = 'Convertir']")
    private WebElement btnconvertir;

    public void convertirPesoEuro(double cantidad){
        amount.sendKeys(String.valueOf(cantidad));
        Select ddownFrom = new Select(from);
        ddownFrom.selectByVisibleText("Peso Mexicano (MXN)");

        Select ddTo = new Select(to);
        ddTo.selectByVisibleText("Euro (EUR)");

        btnconvertir.click();
    }
}
