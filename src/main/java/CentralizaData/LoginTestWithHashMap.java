package CentralizaData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;

public class LoginTestWithHashMap {
    WebDriver driver;
    HashMap<String,String> UserCredentials=new HashMap<>();
@BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("abc.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
UserCredentials.put("Admin","admin123");
UserCredentials.put("User","user123");
UserCredentials.put("Approvaring_Manager","Mang123");
    }
    @Test
    public void testLoginWithAdmin(){
        performLogin("Admin");
    }
public void performLogin(String Role){
    WebElement userfield=driver.findElement(By.id("wdb"));
    WebElement PasswordField= driver.findElement(By.id("hyh"));
    WebElement Loginbtn=driver.findElement(By.id("login"));
    userfield.clear();
    userfield.sendKeys(Role);
    PasswordField.clear();
    PasswordField.sendKeys(UserCredentials.get(Role));
Loginbtn.click();
}

@AfterClass
    public void tearDown(){
    driver.quit();
}


}
