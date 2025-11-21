package packageprt;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RahulshettyDatatable {
    public  static  void main(String[] args){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //(//table[@id='product'])[2]/tbody/tr
        List<WebElement> Allrows=driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr"));
        System.out.println(Allrows.size());
        int sum=0;
      for(int i=1;i<=Allrows.size();i++){
          String getvalue=driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr["+i+"]/td[4]")).getText();
          int val=Integer.parseInt(getvalue);
          sum=sum+val;
      }
      System.out.println(sum);
        Assert.assertEquals(296,sum);

    }
}
