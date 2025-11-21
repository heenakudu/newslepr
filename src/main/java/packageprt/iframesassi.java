package packageprt;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class iframesassi {
    public static void main(String[] arg) {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Hello");
        driver.switchTo().frame(driver.findElement(By.id("frm1")));
        WebElement drpdown=driver.findElement(By.id("course"));
        Select a=new Select(drpdown);
        a.selectByVisibleText("Java");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@class='frmTextBox']")).clear();

        driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Hello again");

    }
}
