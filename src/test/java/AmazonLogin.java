import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

import java.time.Duration;

public class AmazonLogin {
    @Test
            public void Login(){
        WebDriver driver=new ChromeDriver();
        //dhcheb
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        WebElement Username=driver.findElement(By.id("ap_email"));
        System.out.println("GIT TEST NOW");

        Username.sendKeys("kuduheena@gmail.com");
WebElement Continue=driver.findElement(By.id("continue"));
Continue.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
        WebElement Password=driver.findElement(By.id("ap_password"));
        Password.sendKeys("abcsfgd");
        WebElement SIgnIn=driver.findElement(By.id("signInSubmit"));
        SIgnIn.click();
        System.out.println("testgit");
       // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));

    }

}
