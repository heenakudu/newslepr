import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Normal_Login {
    private WebDriver driver;

    Normal_Login(WebDriver driver){
        this.driver=driver;
    }

    public void Register(String Firstname,String Lastname,String Username,String Password){
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Firstname);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Lastname);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Register']"))).click();
        //a[text()='Back to Login']
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Back to Login']"))).click();
    }
    public void Windowhandling(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/new-tab-sample.php");
        //System.out.println(driver.getTitle());
        String mainwindow=driver.getWindowHandle();
        WebElement button=driver.findElement(By.xpath("//button[text()='New Tab']"));
        button.click();
        Set<String> Allwindows=driver.getWindowHandles();
     for(String s:Allwindows){
         if(!s.equalsIgnoreCase(mainwindow)){
             driver.switchTo().window(s);
         }
     }
     driver.getTitle();
     driver.switchTo().window(mainwindow);
     driver.getTitle();
        driver.quit();
    }
public void Dynamicelement(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");
        driver.findElement(By.xpath("//button[text()='Color Change']")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[starts-with(text(),'Visible After')]"))).click();
        ////button[starts-with(text(),'Visible After')']
    ////button[starts-with(text(),'Visible After')]
}
   public void Fileupload(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
      // driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\kuduh\\OneDrive\\Desktop\\links");
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement uploadInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='uploadFile']")));
       uploadInput.sendKeys("C:\\Users\\kuduh\\OneDrive\\Desktop\\links.txt");
   }
//
}




































































//    }


