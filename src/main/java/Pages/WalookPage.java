package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalookPage {

    private WebDriver driver;
    public WalookPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Elemento encontrado mediante xpath
    @FindBy(xpath = "//*[@id='bs-example-navbar-collapse-1']/ul[2]/li[2]/a")
    private WebElement tagEmpresa;

    //Elemento encontrado mediante class name
    @FindBy(className = "dropdown-toggle")
    private WebElement tagServicios;

    //Elemento encontrado mediante css selector (copiado)
    @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(2) > li:nth-child(4) > a")
    private WebElement tagExperiencia;

    //Elemento encontrado mediante css selector
    @FindBy(css = "a[href = '#contact']")
    private WebElement tagContacto;

    public void goToEmpresa(){
        tagEmpresa.click();
    }

    public void goToServicios(){
        tagServicios.click();
    }

    public void goToExperiencia(){
        tagExperiencia.click();
    }

    public void goToContacto(){
        tagContacto.click();
    }

}
