package packageprt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windowhandlingassisgnment {
    public static void main(String[] arg){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/windows']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
        driver.findElement(By.xpath("//div[@class='example']/a[@href='/windows/new']")).click();

        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String Parentid= it.next();
        String childid= it.next();
        //String Thirdid=it.next();
        driver.switchTo().window(childid);
        System.out.println( driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
        //System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());


    }
}
