package workingWithExternalDataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropFileLogin {

	public static void main(String[] args) throws IOException {
		// Step1: Create obj file
		File file = new File("./testData/data.properties");

		// step2 :FIS obj
		FileInputStream fis = new FileInputStream(file);

		// step3: Prop obj
		Properties prop = new Properties();
		prop.load(fis);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("Log in")).click();
		
		String un = prop.getProperty("username");
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();

	}

}
