package packageprt;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DynamicTable {
    public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
        Logger.getLogger("").setLevel(Level.SEVERE);
       System.setProperty(
               "webdriver.chrome.driver",
               "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
        driver.manage().window().maximize();
       List<WebElement> columcnt=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
       int cnt=columcnt.size();

       System.out.println("total coluns are:"+cnt);
       List<WebElement> lstrowcnt=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
       int rcnt= lstrowcnt.size();
        System.out.println("total coluns are:"+rcnt);

        WebElement secrow=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]"));
        System.out.println(secrow.getText());

        for(int i=1;i<lstrowcnt.size();i++){
            WebElement crow=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]"));
            System.out.println(crow.getText());

        }


}
}
