package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buscador {
    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
    WebElement inpBusqueda;
    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")
    WebElement btnBuscar;
    WebDriver webDriver;

    public Buscador(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public void validarObjetos(){
        if (inpBusqueda.isDisplayed()){
            System.out.println("INPUT DE BUSQUEDA DESPLEGADO");
        } else {
            System.out.println("INPUT DE BUSQUEDA NO DESPLEGADO");
        }
        if (btnBuscar.isDisplayed()){
            System.out.println("BOTON DE BUSQUEDA DESPLEGADO");
        } else {
            System.out.println("BOTON DE BUSQUEDA NO DESPLEGADO");
        }
    }

    public void ingresarBusqueda(String busqueda){
        inpBusqueda.click();
        inpBusqueda.sendKeys(busqueda);
    }

    public void buscar(){
        btnBuscar.click();
    }
}
