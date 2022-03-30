package apachePOI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("TestData");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Anu");
		sheet.getRow(0).createCell(1).setCellValue("Anusha");
		File file = new File("C:\\Users\\SURESH\\eclipse-workspace\\TestNG\\ExcelFiles\\Test.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	}

}
