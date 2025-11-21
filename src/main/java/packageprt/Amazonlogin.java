package packageprt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Amazonlogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement Hellosignin=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        Hellosignin.click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='a-form-label']")));
        WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
        Email.sendKeys("kuduheena@gmail.com");
        WebElement Signin= driver.findElement(By.xpath("//input[@type='submit']"));
        Signin.click();

    }
}
