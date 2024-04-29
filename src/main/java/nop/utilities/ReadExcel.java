package nop.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readExcelData() throws InvalidFormatException, IOException {

	}

	public static void main(String args[]) throws InvalidFormatException, IOException {
		File file = new File("C:\\My_Workspace\\inputs.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sheet = wb.getSheet("Sheet1");

		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				XSSFCell cell=row.getCell(j);
				System.out.println(cell);
			}
			
		}
		
		

	}
}
