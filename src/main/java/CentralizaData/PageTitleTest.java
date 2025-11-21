package CentralizaData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleTest {
   public static void main(String[] args){
       WebDriver driver=new ChromeDriver();
       driver.get("abc.com");

       BasePage loginPage=new LoginPage(driver);
       System.out.println(loginPage.getPageTitle());

       BasePage HomePage=new HomePage(driver);
       System.out.println(HomePage.getPageTitle());

       driver.quit();
   }
}
