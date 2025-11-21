package CentralizaData;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Set;

public class prdrdrdr {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
 /*       driver.switchTo().frame(driver.findElement(By.id("frm1")));
        WebElement dropdown= driver.findElement(By.id("course"));
        Select s=new Select(dropdown);
        s.selectByVisibleText("Java");*/
        driver.switchTo().frame(driver.findElement(By.id("frm3")));
        driver.switchTo().frame(driver.findElement(By.id("frm1")));
        WebElement dropdown2= driver.findElement(By.id("selectnav1"));
        Select s2=new Select(dropdown2);
        s2.selectByVisibleText("-SQL");
           }
        }



