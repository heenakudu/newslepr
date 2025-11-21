package packageprt;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] arg){
    System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
 driver.findElement(By.className("blinkingText")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentid= it.next();
        String Childid=it.next();
        driver.switchTo().window(Childid);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
        driver.switchTo().window(parentid);
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
}
}
