package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class testeWeb {
    WebDriver driver;
    Driver driverWeb;

    //WebDriver driver;
    @Before
    public void inicializarTeste() throws IOException {
        //WebDriverManager.chromedriver().setup();
        driverWeb = new Driver("iedriver");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");

    }
    @Test
    public void primeiroTeste(){


       // String xpathTitulo = "//html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento",titulo);
    

    }

    @After
    public void finalizarTeste(){
        driver.quit();
    }
}
