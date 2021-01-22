package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//comment tralala

public class TestValue2 {

    WebDriver driver;
    String name = "Admin";
    String password = "admin123";

    @BeforeClass
    public void pageAuth() {
        String s = System.setProperty("webdriver.gecko.driver", "C:\\ProjetLR\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        //driver.quit(); pour supprimer toutes les sessions existantes de Firefox
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }

        driver.findElement(By.id("txtUsername")).sendKeys(name);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();

    }

    @Test
    public void testAVerifier(){
        //Vérifier que le titre de la page est: « OrangeHRM »
        String titrePage = driver.getTitle();
        String wishedTitrePage = "OrangeHRM";

        assertEquals(wishedTitrePage, titrePage);

        WebElement boutonLogin;

        boolean isPresent;
        boolean isVisible;


        //assertThat.boutonLogin.isPresent();
        //assertThat.driver.findElement(By.id("btnLogin")).isVisible();
        //driver.findElement(By.id("btnLogin"))

    }

    @AfterClass
    public void tearDown() {
        //Fermeture du navigateur
        driver.quit();
    }

}
