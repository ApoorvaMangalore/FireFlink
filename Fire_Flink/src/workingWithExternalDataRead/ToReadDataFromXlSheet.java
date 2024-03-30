package workingWithExternalDataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataFromXlSheet {
	public static void main(String[] args) throws IOException {

		// Step1
		File file = new File("./testData/testdata.xlsx");

		// Step2:
		FileInputStream fis = new FileInputStream(file);

		// Step3
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		String sheet = workbook.getSheetName(0);
		System.out.println(sheet);

		XSSFSheet sheetName = workbook.getSheet(sheet);

		String entry1 = sheetName.getRow(0).getCell(0).getStringCellValue();
		System.out.println(entry1);

		XSSFCell entry2 = sheetName.getRow(0).getCell(1);
		System.out.println(entry2);

		XSSFCell entry3 = sheetName.getRow(1).getCell(0);
		System.out.println(entry3);

	}
}
