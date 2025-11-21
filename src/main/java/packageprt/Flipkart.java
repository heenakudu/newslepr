package packageprt;

import CentralizaData.AllLinks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Flipkart implements AllLinks {

    public static void main(String[] args) {
        WebDriver driver;
        Logger.getLogger("").setLevel(Level.SEVERE);

        // Use WebDriverManager to set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        try {
            driver.get(BaseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            // Locate the search bar and search for "Iphones"
            WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
            searchBar.sendKeys("Iphones");
            searchBar.sendKeys(Keys.ENTER);

            // Adjusted element selection with proper class name

            List<WebElement> lstOfIphones = driver.findElements(By.xpath("//div[contains(@Class,'_6NESgJ')]//child::li[contains(text(),'128 GB ROM')]"));
            // Iterate through iPhone list and select one with "128GB" in the name
            for (WebElement elem : lstOfIphones) {
                String itemText = elem.getText();
                System.out.println(itemText);

                if (itemText.contains("128GB")) {
                    elem.click();
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();  // Close the browser after the test
        }
    }
}
