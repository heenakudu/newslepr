package CentralizaData;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Winfrtest {
    @Test
    public  void Tesmethod() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

       String Path="C:\\Users\\kuduh\\OneDrive\\Desktop\\sdet notes\\usepass.xlsx";
        FileInputStream fs=new FileInputStream(Path);
        Workbook workbook=new XSSFWorkbook(fs);
        Sheet sheet=workbook.getSheetAt(0);
        Iterator<Row> rows=sheet.iterator();
       while (rows.hasNext()){
           Row row= rows.next();
           String User=row.getCell(0).getStringCellValue();
           String Pass=row.getCell(1).getStringCellValue();
           System.out.println(User);
           System.out.println(Pass);
       }
workbook.close();
    }

    @Test
    public void WriteExceldate() throws IOException {
        String Path="C:\\Users\\kuduh\\OneDrive\\Desktop\\sdet notes\\usepass.xlsx";
        String[][] data={
                {"Username","Password","Status"},
                {"user1","Pass1","Failed"},
                {"user2","Pass2","Passed"}
        };
        Workbook workbook=new XSSFWorkbook();
        Sheet sheet=workbook.createSheet("NewData");
        for(int i=0;i< data.length;i++) {
            Row row= sheet.createRow(i);
            for(int j=0;j<data[i].length;j++){
                Cell cell=row.createCell(j);
                cell.setCellValue(data[i][j]);
            }
        }
        FileOutputStream fs=new FileOutputStream(Path);
        workbook.write(fs);
    }
}


