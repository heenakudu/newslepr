package packageprt;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Scrollass {
    //document.querySelector(".tableFixHead").scrollTop=500
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
       JavascriptExecutor js=(JavascriptExecutor)driver;
       Thread.sleep(3000);
       js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
    }

}
