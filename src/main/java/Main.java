import CentralizaData.AutoInsurancePolicy;
import CentralizaData.InsuranceTestLayer;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
WebDriver driver=new ChromeDriver(options);
driver.get("https://the-internet.herokuapp.com/windows");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
String Mainwin=driver.getWindowHandle();
Set<String> allwindows=driver.getWindowHandles();

Iterator<String> it=allwindows.iterator();
for(String s:allwindows){
    if(!s.equals(Mainwin)){
        driver.switchTo().window(s);
        if(driver.getTitle().equals("New Window")){
            System.out.println("title matches!");
            break;
        }

    }
}
System.out.println(driver.getTitle());
//New Window



    }}

