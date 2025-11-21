package org.example;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitwaitdemo {
    @Test
    public void justtp() throws InterruptedException, IOException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      driver.get("https://www.iana.org/help/example-domains");
      try{
          JavascriptExecutor js=(JavascriptExecutor) driver;
          js.executeScript("window.scrollTo(0, 200);");
          Assert.assertEquals("dd","nn");
      }
      catch (AssertionError e){
          File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          String path=System.getProperty("user.dir")+"//screenshot//screenshot.png";
          File destination=new File(path);
          FileUtils.copyFile(Screenshot,destination);
          System.out.println("Sc saved at"+path);
          //sc method
      }


//driver.quit();


}
}
