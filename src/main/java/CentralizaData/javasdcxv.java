package CentralizaData;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class javasdcxv {
    public static  void main(String[] args) throws IOException {
        String Path="C:\\Users\\kuduh\\OneDrive\\Desktop\\sdet notes\\usepass.xlsx";
        FileInputStream fs=new FileInputStream(Path);
        Workbook workbook=new XSSFWorkbook(fs);
        Sheet sheet=workbook.getSheetAt(0);
        Iterator<Row> rows=sheet.iterator();
        while (rows.hasNext()){
          Row row=  rows.next();
            String user=row.getCell(0).getStringCellValue();
            String pass=row.getCell(1).getStringCellValue();
            System.out.println(user);
            System.out.println(pass);
    }
        workbook.close();
}
}
