package workingWithExternalDataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoWebshopLoginUsingXl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./testData/testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		// XSSFWorkbook workBook=new XSSFWorkbook();

		Workbook workbook =WorkbookFactory .create(fis);
		
		String url = workbook.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		String userName = workbook.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}

}
