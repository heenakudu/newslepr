package timepass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Revision {
    public static void main(String[] args){



                // Set ChromeDriver Path
        WebDriver driver=new ChromeDriver();
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

                // Set implicit wait
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                // Navigate to the page
                driver.get("https://www.javatpoint.com/java-programs#java-string-programs");

                // Store parent window handle
                String parentWindow = driver.getWindowHandle();
                System.out.println("Parent Window Handle: " + parentWindow);

                // Perform some action that opens a new window (Example: Click a link that opens a new tab/window)
                WebElement element = driver.findElement(By.xpath("//h1[@class='h1']"));
                element.click(); // Assuming this opens a new window or tab

                // Get all window handles
                Set<String> allWindows = driver.getWindowHandles();
                System.out.println("All Window Handles: " + allWindows);

                // Use Iterator to handle multiple windows
                Iterator<String> iterator = allWindows.iterator();

                while (iterator.hasNext()) {
                    String windowHandle = iterator.next();
                    if (!windowHandle.equals(parentWindow)) {
                        // Switch to the new window
                        driver.switchTo().window(windowHandle);
                        System.out.println("Switched to Child Window: " + driver.getTitle());
                        // Perform operations on the new window
                        System.out.println("Child Window URL: " + driver.getCurrentUrl());
                        driver.close(); // Close the child window
                    }
                }

                // Switch back to the parent window
                driver.switchTo().window(parentWindow);
                System.out.println("Switched back to Parent Window: " + driver.getTitle());

                // Close the driver
                driver.quit();
            }
        }

