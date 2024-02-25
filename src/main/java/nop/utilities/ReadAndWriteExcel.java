package nop.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadAndWriteExcel {

	@Test
	public void readExcel() throws InvalidFormatException, IOException {
		String path = "C:\\My_Workspace\\inputs.xlsx";

		File file = new File(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				XSSFCell cell = row.getCell(j);
				System.out.print(cell);
				System.out.print(" | ");
			}
			System.out.println();
		}
	}
}
