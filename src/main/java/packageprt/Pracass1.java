package packageprt;

import io.cucumber.java.sl.In;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class Pracass1 {
    public  static  void main(String[] args) throws InterruptedException {
       /* System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");*/
        //driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
 /*       Thread.sleep(3000);
        List<WebElement> lst=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        System.out.println(lst.size());
        for(int i=0;i<lst.size();i++){
          String Getval=lst.get(i).getText();
          if(Getval.equals("India")||Getval.equals("india")){
              System.out.println(Getval);
          }
        }*/
      /*  driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='p_n_feature_twenty-nine_browse-bin/44349045031']/ul/span/span")));
        List<WebElement> lst=  driver.findElements(By.xpath("//div[@id='p_n_feature_twenty-nine_browse-bin/44349045031']/ul/span/span"));
for(WebElement el:lst){
    System.out.println(el.getText());
}
driver.findElement(By.xpath("//span[text()='128 GB']")).click();
driver.findElement(By.xpath("(//h2/span[starts-with(text(),'iPhone 16 128 GB')])[1]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@id='submit.add-to-cart-announce' and text()='Add to cart'])[2]")));
driver.findElement(By.xpath("(//span[@id='submit.add-to-cart-announce' and text()='Add to cart'])[2]")).click();*/
/*WebElement Dropdown=driver.findElement(By.id("dropdown-class-example"));
        Select s=new Select(Dropdown);
        s.selectByIndex(2);
        driver.findElement(By.id("confirmbtn")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();*/

    }
}
