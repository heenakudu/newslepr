package CentralizaData;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class nodeggg {
    public static void main(String[] args) throws IOException {
     System.setProperty(
             "webdriver.chrome.driver",
             "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
        driver.manage().window().maximize();
        List<WebElement> columcnt = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
        int cnt = columcnt.size();
        System.out.println("total coluns are:" + cnt);
        List<WebElement> lstrowcnt = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        int rcnt = lstrowcnt.size();
        System.out.println("total coluns are:" + rcnt);
        WebElement secrow = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]"));
        System.out.println(secrow.getText());

        for(int i = 1; i < lstrowcnt.size(); ++i) {
            WebElement crow = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]"));
            System.out.println(crow.getText());
        }



}}
