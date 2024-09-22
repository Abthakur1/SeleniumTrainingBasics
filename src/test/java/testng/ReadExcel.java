package testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    @Test
    public void readExcelData() throws IOException {
        FileInputStream file = new FileInputStream("C:\\AC-TrainingBatch june\\FirstProject\\src\\test\\java\\testng\\TestData.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet1");
        int totalNumberOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println("total number of rows in the sheet:"+ totalNumberOfRows);

        // static way of extracting the data
        // static data
        //00
        Row row00 = sheet.getRow(0);
        Cell cell00 = row00.getCell(0);
        System.out.println(cell00.getStringCellValue());
        //01
        Row row01 = sheet.getRow(0);
        Cell cell01 = row01.getCell(1);
        System.out.println(cell01.getStringCellValue());

        //02
        Row row02 = sheet.getRow(0);
        Cell cell02 = row02.getCell(2);
        System.out.println(cell02.getStringCellValue());

        //03
        Row row03 = sheet.getRow(0);
        Cell cell03 = row03.getCell(3);
        System.out.println(cell03.getStringCellValue());

        //10
        Row row10 = sheet.getRow(1);
        Cell cell10 = row10.getCell(0);
        System.out.println(cell10.getStringCellValue());

        //11
        Row row11 = sheet.getRow(1);
        Cell cell11 = row11.getCell(1);
        System.out.println(cell11.getStringCellValue());

        //12
        Row row12 = sheet.getRow(1);
        Cell cell12 = row12.getCell(2);
        System.out.println(cell12.getStringCellValue());

        //13
        Row row13 = sheet.getRow(1);
        Cell cell13 = row13.getCell(3);
        System.out.println(cell13.getStringCellValue());
    }
}
