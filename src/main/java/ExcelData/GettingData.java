package ExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GettingData {
    public static void main(String[] args) throws IOException {

        String path="C:\\\\Users\\\\kuduh\\\\OneDrive\\\\Desktop\\\\sdet notes\\\\usepass.xlsx";
       Workbook wrkbook=new XSSFWorkbook();
Sheet sheet=wrkbook.createSheet("ScOne");
String[][] data={
        {"Username","Password","Status"},
        {"user1", "pass1", "Passed"},
        {"user2", "pass2", "Failed"},
        {"user3", "pass3", "Passed"}
};
for(int i=0;i< data.length;i++){
    Row row=sheet.createRow(i);
    for(int j=0;j<data[i].length;j++){
Cell cell= row.createCell(j);
cell.setCellValue(data[i][j]);
    }
}
try{
    FileOutputStream fs=new FileOutputStream(path);

    wrkbook.write(fs);
    System.out.println("Excel file written successfully!");
}
catch (IOException e){
    e.printStackTrace();
}
    }
}
