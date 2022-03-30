//reading the data from Excel File
package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static void main(String[] args) throws IOException {// FileNotFoundException
		File file = new File("C:\\Users\\SURESH\\eclipse-workspace\\TestNG\\ExcelFiles\\Test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
//	    String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
//	    System.out.println(cellValue);
//	    workbook.close();
//	    fis.close();
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		for(int i=0;i<rowCount;i++) {
			sheet.getRow(i);
		}
	}

}
