package testSuites;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClasses.Busqueda;

public class Prueba {
    ChromeDriver webDriver;
    String url = "https://www.google.cl/";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }

    @AfterTest
    public void end() {
        webDriver.close();
    }

    @Test
    public void CPA00001(){
        Busqueda busqueda = new Busqueda(webDriver);
        busqueda.CPA00001Buscar("Pinguino");
    }
}
