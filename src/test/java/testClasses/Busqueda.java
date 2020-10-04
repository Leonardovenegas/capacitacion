package testClasses;

import org.openqa.selenium.WebDriver;
import pages.Buscador;
import pages.Resultado;

public class Busqueda {
    Buscador buscador;
    Resultado resultado;
    WebDriver webDriver;

    public Busqueda(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void CPA00001Buscar(String busqueda){
        buscador = new Buscador(webDriver);
        buscador.validarObjetos();
        buscador.ingresarBusqueda(busqueda);
        buscador.buscar();
        resultado = new Resultado(webDriver);
        resultado.validarObjetos();
        resultado.recuperarTexto();
    }
}
