package testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    @Test
    public void writeExcelData() throws IOException {
        String path = "C:\\AC-TrainingBatch june\\FirstProject\\src\\test\\java\\testng\\OutputData.xlsx";
        FileInputStream fs = new FileInputStream(path);
        Workbook wb = new XSSFWorkbook(fs);
        Sheet sheet1 = wb.getSheetAt(0);
        Row row = sheet1.getRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("sumit kumar");

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);
        fos.close();
    }
}
