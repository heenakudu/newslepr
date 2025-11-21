package CentralizaData;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelLoginTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // Excel File Path
        String path = "C:\\Users\\kuduh\\Downloads\\Book1.xlsx";
        FileInputStream fs = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fs);
        Sheet sheet = workbook.getSheetAt(0);

        // Iterate through rows
        Iterator<Row> rows = sheet.iterator();
        rows.next(); // Skip Header


                while (rows.hasNext()) {
            Row row = rows.next();
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();

            // Locate elements
            WebElement user = driver.findElement(By.id("username"));
            WebElement pass = driver.findElement(By.id("password"));
            WebElement role = driver.findElement(By.xpath("//span[text()='Admin']"));
            WebElement terms = driver.findElement(By.id("terms"));
            WebElement signIn = driver.findElement(By.id("signInBtn"));

            // Clear & Enter Credentials
            user.clear();
            pass.clear();
            user.sendKeys(username);
            pass.sendKeys(password);

            // Select role & Submit form
            role.click();
            terms.click();
            signIn.click();

            // Wait for response
            Thread.sleep(2000);
        }

        // Close workbook and driver
        workbook.close();
        fs.close();
        driver.quit();
    }
}
