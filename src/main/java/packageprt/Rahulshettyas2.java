package packageprt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulshettyas2 {
    public  static  void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        int cnt=driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr[3]/td")).size();
        System.out.println(driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr")).size());
        //(//table[@id='product'])[1]/tbody/tr[3]/td[1]
        for (int i=1;i<=cnt;i++)
        {
            System.out.println(driver.findElement(By.xpath("(//table[@id='product'])[1]/tbody/tr[3]/td["+i+"]")).getText());
        }
    }
}
