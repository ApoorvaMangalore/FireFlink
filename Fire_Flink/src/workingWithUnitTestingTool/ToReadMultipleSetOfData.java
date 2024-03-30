package workingWithUnitTestingTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleSetOfData {
	@DataProvider(name = "regdata")
	public String[][] registerData() throws EncryptedDocumentException, IOException {
		File file = new File("./testData/testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workBook = WorkbookFactory.create(fis);
		int numRows = workBook.getSheet("regdata").getPhysicalNumberOfRows();
		int numClm = workBook.getSheet("regdata").getRow(0).getPhysicalNumberOfCells();
		System.out.println(numRows);
		System.out.println(numClm);

		String[][] data = new String[numRows][numClm];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numClm; j++) {
				data[i][j] = workBook.getSheet("regdata").getRow(i).getCell(j).toString();
			}
		}
		return data;
	}

	@Test(dataProvider = "regdata")
	public void registerUser(String[] dataReg) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		if (dataReg[0].equalsIgnoreCase("male")) {
			driver.findElement(By.id("gender-male")).click();
		}
		if (dataReg[0].equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		}

		driver.findElement(By.id("FirstName")).sendKeys(dataReg[1]);
		driver.findElement(By.id("LastName")).sendKeys(dataReg[2]);
		driver.findElement(By.id("Email")).sendKeys(dataReg[3]);
		driver.findElement(By.id("Password")).sendKeys(dataReg[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(dataReg[5]);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
