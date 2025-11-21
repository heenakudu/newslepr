package CentralizaData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpg {
    private WebDriver driver;

    private By userfield=By.id("username");
    private By passwfield=By.id("passw");
    private By Loginbutton=By.id("Loginbtn");

    Loginpg(WebDriver driver){
        this.driver=driver;
    }

    public void Enterusername(String username){
        driver.findElement(userfield).sendKeys(username);
    }

    public  void  Enterpassfield(String password){
        driver.findElement(passwfield).sendKeys(password);
    }
    public void Loginbtn(){
        driver.findElement(Loginbutton).click();
    }
}
