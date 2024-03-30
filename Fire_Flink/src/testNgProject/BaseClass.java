package testNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	String emailId = "pavankumarcm2000@gmail.com";
	String pwd = "123456789";

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am beforeSuite");
		System.out.println("data base connection start");
		System.out.println("report formation start");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am afterSuite");
		System.out.println("data base connection stop");
		System.out.println("report formation stop");
	}

//@BeforeClass
	@BeforeTest
	public void browserSetUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("User is able to open demo webshop");
		Thread.sleep(3000);
	}

//@AfterClass
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		System.out.println("User is able to quit the browser");
	}

	@BeforeMethod
	public void login() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(emailId);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("User is able to login");
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("User is able to logOut");
	}
}
