package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class testeWeb {
    WebDriver driver;
    Driver driverWeb;
   PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializarTeste() throws IOException {
       // WebDriverManager.chromedriver().setup();
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);

       // cursoPage = new CursoPage(driver);
    }

    @Test
    public void primeiroTeste() {
        assertEquals("Porque Tempo É Conhecimento",principalPage.getTitulo());
    }

    @Test
    public void segundoTeste(){
        cursoPage= new CursoPage(driver);
        principalPage.clickBotao();
        assertEquals("Conheça todos os nossos cursos", cursoPage.getTitulo2());
    }

    @After
    public void finalizarTeste() {
        driver.quit();
    }
}
