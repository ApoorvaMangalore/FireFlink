package workingWithUnitTestingTool;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithChronologicalOrder {

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

	@Test
	public void run() {
		System.out.println("I am test");
	}

	@Test
	public void pass() {
		System.out.println("I am test1");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am after test");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("I am before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am after Class");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before method");
	}
	@Test
	public void fail() {
		System.out.println("test case is fail");
	}
}
