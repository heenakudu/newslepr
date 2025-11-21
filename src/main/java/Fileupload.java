import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Fileupload {
    @Test
    public void Fileup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        // List of file paths to upload
        List<String> fileList = new ArrayList<>();
        fileList.add("C:\\Users\\kuduh\\OneDrive\\Desktop\\sdet notes\\Selenium Automation.pdf");
        fileList.add("C:\\Users\\kuduh\\OneDrive\\Desktop\\sdet notes\\Selenium Testing Full Guideline.pdf");
        fileList.add("C:\\Users\\kuduh\\OneDrive\\Desktop\\sdet notes\\Java_Selenium_Cheatsheet.pdf");

        // Locate the file upload input element
        WebElement uploadButton = driver.findElement(By.id("myFile"));

        // Approach 1: Single file input (Upload one file at a time)
        for (String filePath : fileList) {
            File file = new File(filePath);
            if (file.exists()) {
                uploadButton.sendKeys(file.getAbsolutePath());
                System.out.println("Uploaded: " + file.getName());
            } else {
                System.out.println("File not found: " + filePath);
            }
        }

    }
}
