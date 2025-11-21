package packageprt;
import org.example.Main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Browserstack {
     public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
         System.setProperty(
                 "webdriver.chrome.driver",
                 "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

         driver.manage().window().maximize();

         driver.get("https://demoqa.com/browser-windows");

         // Open new window by clicking the button
         driver.findElement(By.id("windowButton")).click();

         // Click on the new window element and read the text displayed on the window
         WebElement text = driver.findElement(By.id("sampleHeading"));

         // Fetching the text using method and printing it
         System.out.println("Element found using text: " + text.getText());
         String Windowhandle=driver.getWindowHandle();
         Set<String> AllWindowHandles=driver.getWindowHandles();
         Iterator<String> iterator=AllWindowHandles.iterator();
         while (iterator.hasNext()){
             String ChildWindow = iterator.next();
             if (!Windowhandle.equalsIgnoreCase(ChildWindow)) {
                 driver.switchTo().window(ChildWindow);
                 WebElement textn = driver.findElement(By.id("sampleHeading"));
                 System.out.println("Heading of child window is " + textn.getText());
         }
         driver.quit();
    }
}}

