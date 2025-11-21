package CentralizaData;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Screenshotmethod {

    public static void main(String[] args) throws IOException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://example.com");
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path=System.getProperty("user.dir")+"/screenshot/screnerror.png";
        File deatination=new File(path);
        FileUtils.copyFile(screenshot,deatination);
        System.out.println("Screenshot svaed at:"+path);

    }
}
