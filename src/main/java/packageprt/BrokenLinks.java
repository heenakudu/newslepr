package packageprt;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        HttpURLConnection conn=null;
        List<WebElement> lst=driver.findElements(By.tagName("a"));
        for(WebElement item:lst){
        String url= item.getAttribute("href");
        try{
            assert url != null;
            URL actualurl=new URL(url);
            conn=(HttpURLConnection) actualurl.openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int response=conn.getResponseCode();
            if(response>=400){
                System.out.println(url+" is a broken link");
            }
            else {
                System.out.println(url+" is a valid link");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        }


    }
}
