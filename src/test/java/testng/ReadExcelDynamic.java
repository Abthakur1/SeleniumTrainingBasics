package testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelDynamic {

    @Test
    public void readExcelData() throws IOException {
        FileInputStream file = new FileInputStream("C:\\AC-TrainingBatch june\\FirstProject\\src\\test\\java\\testng\\TestData.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet1");
        int totalNumberOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println("total number of rows in the sheet:"+ totalNumberOfRows);
        Iterator<Row> rowIterator = sheet.iterator();

        // dynamic code
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                // Process the cell value
                System.out.println(cell.getStringCellValue());
            }
        }
    }
}
