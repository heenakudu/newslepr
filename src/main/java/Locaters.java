
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//import static java.lang.Thread;

public class Locaters {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("password")).sendKeys("learning");

driver.findElement(By.xpath("(//span[@class='radiotextsty'])[2]")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-dialog")));  // Wait until modal is visible
            WebElement okayButton = driver.findElement(By.id("okayBtn"));
            okayButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        WebElement dropdown= driver.findElement(By.xpath("//select[@class='form-control']"));
        dropdown.click();
Select drp=new Select(dropdown);
drp.selectByValue("consult");

driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='btn btn-info']")));
List<WebElement> lst=driver.findElements(By.xpath("//button[@class='btn btn-info']"));
for(WebElement ele:lst){
    ele.click();
    Thread.sleep(1000);
}
System.out.println(lst.size());
}
}
