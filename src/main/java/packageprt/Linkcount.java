package packageprt;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Linkcount {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println((driver.findElements(By.tagName("a")).size()));
        //only footer
        WebElement footer=driver.findElement(By.id("gf-BIG"));
        int colsize=footer.findElements(By.xpath("//tbody/tr/td/ul[1]")).size();
        for (int i=1;i<colsize;i++){
            //vry imp
            //opens links in new tabs
            String opentabs= Keys.chord(Keys.CONTROL,Keys.ENTER);
           driver.findElements(By.tagName("a")).get(i).sendKeys(opentabs);
           Thread.sleep(5000L);
            Set<String> abc=driver.getWindowHandles();
            Iterator<String> it=abc.iterator();
            while (it.hasNext()){
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());

            }
        }
    }
}
