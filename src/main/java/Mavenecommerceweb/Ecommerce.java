package Mavenecommerceweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Ecommerce {
    public static void main(String[] args) {
        // Set up WebDriverManager for ChromeDriver

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Set implicit wait for the driver
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the login page
        driver.get("https://rahulshettyacademy.com/client/");
driver.manage().window().maximize();
        // Log in using provided credentials
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userEmail")));
        driver.findElement(By.id("userEmail")).sendKeys("kuduheena@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Heena@1995");
        driver.findElement(By.id("login")).click();

        WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitt.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".col-lg-4")));



        // Find all elements with the CSS selector
        List<WebElement> lst = driver.findElements(By.cssSelector(".col-lg-4"));
   WebElement prod=lst.stream().filter(s->s.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);

  prod.findElement(By.cssSelector(".btn.w-10.rounded")).click();
        waitt.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@routerlink='/dashboard/cart']")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ngx-spinner-overlay")));
        WebElement button = driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']"));
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
        List<WebElement> finlst=driver.findElements(By.cssSelector(".cartSection h3"));
      Boolean bool= finlst.stream().anyMatch(s->s.getText().equalsIgnoreCase("ZARA COAT 3"));
        Assert.assertTrue(bool);
        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
        driver.findElement(By.cssSelector("[placeholder='Select Country']")).sendKeys("ind");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
        List<WebElement> Autosearch=driver.findElements(By.cssSelector(".ta-results .ta-item"));
for(WebElement s:Autosearch){
    if(s.getText().equalsIgnoreCase("india")){
        s.click();
    }
   /* System.out.println(s.getText());*/
}


   //btn w-10 rounded
        //prod.findElement(By.cssSelector("button[class='btn w-10 rounded']")).click();
        // Loop through the elements and click the button inside each one
      /*  for (int i = 0; i < lst.size(); i++) {
            try {
              if(lst.get(i).getText().contains("ZARA COAT 3")){
                // Wait for the button to be clickable before clicking it
                WebElement button = lst.get(i).findElement(By.cssSelector("button[class='btn w-10 rounded']"));
                wait.until(ExpectedConditions.elementToBeClickable(button));
                button.click();}  // Click the button
            } catch (Exception e) {
                System.out.println("Error occurred while clicking the button: " + e.getMessage());
            }
        }*/
       // driver.quit();
        // Close the driver after the interaction

    }
}
