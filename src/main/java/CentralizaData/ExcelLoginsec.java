package CentralizaData;

import io.cucumber.java.sl.Ce;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;


public class ExcelLoginsec {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        String path="C:\\Users\\kuduh\\OneDrive\\Desktop\\sdet notes\\usepass.xlsx";
        FileInputStream fs=new FileInputStream(path);
        Workbook workbook=new XSSFWorkbook(fs);
    Sheet sheet= workbook.getSheetAt(0);
        Iterator<Row> rows=sheet.iterator();
        while (rows.hasNext()){
            Row row= rows.next();
            Cell usernamec=row.getCell(0);
            Cell Passwordc=row.getCell(1);
            String username=usernamec.getStringCellValue();
            String password= Passwordc.getStringCellValue();
        }
        workbook.close();
    }
}
