package CentralizaData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logintes {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.get("https://fhfhf");
    }
    @Test
    public void Login(){
        Loginpg pg=new Loginpg(driver);
        pg.Enterusername("user1234");
        pg.Enterpassfield("pass123");
        pg.Loginbtn();
    }
@AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
