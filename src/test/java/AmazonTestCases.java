import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AmazonTestCases {
    @Test
    public void Filter() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();
        WebElement Serchbox = driver.findElement(By.id("twotabsearchtextbox"));
        Serchbox.sendKeys("iphone");
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[text()='64 GB']")).click();
        //
        //driver.findElement(By.xpath("//span[text()='Redmi']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> lstbrands = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@id,'p_123')]")));
        for (WebElement el : lstbrands) {
            String apple = el.getText();
            if (apple.equalsIgnoreCase("apple")) {
                el.click();
            }

        }

        //Add to Cart
        List<WebElement> lst = driver.findElements(By.xpath("//a/h2/span"));
        for (int i = 0; i < lst.size(); i++) {

            String text = lst.get(i).getText();

            if (text.contains("Apple")) {

                lst.get(i).click();
            }
        }

    }

    @Test
    public void Rashet(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/client");
        List<WebElement> lst=driver.findElements(By.xpath("//h5/b"));
        for(int i=0;i< lst.size();i++){
            String text=lst.get(i).getText();
            List<WebElement> viewb=driver.findElements(By.xpath("//button[contains(text(),'View')]"));
            if(text.contains("ZARA COAT 3")){
                viewb.get(i).click();

            }
        }
    }

    @Test
    public void  thirdMethod(){
        //https://selectorshub.com/xpath-practice-page/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      driver.findElement(By.id("alertbtn")).click();
      try{
          WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
          if(wait.until(ExpectedConditions.alertIsPresent())==null){
              System.out.println("Alert is not Present");
          }
          else {
              System.out.println("Alert is  Present");
              Alert alert=driver.switchTo().alert();
              alert.accept();
           //driver.switchTo().alert().accept();
          }
      }
      catch(NoAlertPresentException a){
          System.out.println("Alert Present");
a.printStackTrace();
      }
    }

    @Test
    public void Disbalepopup(){
      ChromeOptions options=new ChromeOptions();
      options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.in/");
    }

    @Test
    public void windowhandle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement newWindowBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("newWindowBtn")));
        newWindowBtn.click();

        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String Parent= it.next();
        String child= it.next();
        driver.switchTo().window(child);
        driver.findElement(By.id("firstName")).sendKeys("Heena");
        driver.findElement(By.id("lastName")).sendKeys("Kudu");
        driver.findElement(By.id("femalerb")).click();
        driver.findElement(By.id("hindichbx")).click();
        driver.findElement(By.id("email")).sendKeys("kuduheena@gmail.com");
        driver.findElement(By.id("password")).sendKeys("abcd");
        driver.findElement(By.id("registerbtn")).click();

    }
    @Test
    public void methodtt(){
        //
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBox")));*/
        driver.findElement(By.id("promptBox")).click();
        //button.click();
     Alert alert=driver.switchTo().alert();
     alert.sendKeys("Heena kudu");
     alert.accept();

    }

    @Test
    public void Method1(){
       // https://en.wikipedia.org/wiki/Programming_languages_used_in_most_popular_websites
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://en.wikipedia.org/wiki/Programming_languages_used_in_most_popular_websites");

    }
}
