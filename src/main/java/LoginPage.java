import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    public static void main(String[] args) {
        SingletonClass.getdet();
        SingletonClass cs=new SingletonClass();
        cs.getdetm();
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // URL of the login website that is tested
        driver.get("https://www.flipkart.com/");

        // Maximize window size of browser
        driver.manage().window().maximize();

        // Enter your login email id


        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
        searchBox.sendKeys("iphone");

        // Enter your login password
        //driver.findElement(By.id("password"))
               // .sendKeys("xyz12345");

        //driver.findElement(By.className("signin-button"))
                //.click();

        searchBox.sendKeys(Keys.RETURN);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement getMemory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'1GB and Below')]")));

        // Click on the desired element
        getMemory.click();

        WebElement Dropdwonelement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='suthUA']//select[@class='Gn+jFg']")));
Select deropdown=new Select(Dropdwonelement) ;
        deropdown.selectByValue("15000");
        ////div[@class='tKgS7w']//select[@class='Gn+jFg']
        //WebElement Dropdwonelement2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("div[@class='tKgS7w']//select[@class='Gn+jFg']")));
        //Select deropdown2=new Select(Dropdwonelement2) ;
        //deropdown.selectByValue("Max");
        //List<WebElement> lst=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
             //   "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/a[1]/div[3]/div[1]/div[3]/ul[1]/li[1]")));
         }



}
