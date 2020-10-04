package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resultado {
    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3/span")
    WebElement lblResultado;
    WebDriver webDriver;

    public Resultado(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void validarObjetos(){
        if(lblResultado.isDisplayed()){
            System.out.println("LABEL RESULTADO DESPLEGADO");
        } else {
            System.out.println("LABEL RESULTADO NO DESPLEGADO");
        }
    }

    public void recuperarTexto(){
        String resultado = lblResultado.getText();
        System.out.println("RESULTADO: "+resultado);
    }
}
