package packageprt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        // Set up the WebDriver
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the webpage
            driver.get("https://example.com");

            // Take a screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Save the screenshot to a desired location
            File destination = new File("path/to/screenshot.png");
            FileUtils.copyFile(screenshot, destination);

            System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
