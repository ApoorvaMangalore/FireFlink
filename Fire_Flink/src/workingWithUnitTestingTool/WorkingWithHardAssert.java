package workingWithUnitTestingTool;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHardAssert {

	@Test
	public void demoWebShop() throws InterruptedException {
		String expectedUrl = "https://demoweb.tricentis.com/";
		boolean expCheckBox = true;

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("User ia ble to maximize the browser", true);

		driver.get("https://demowebshop.tricentis.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		Assert.assertEquals(expectedUrl, currentUrl, "Url is not correct");

		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);

		WebElement checkBox = driver.findElement(By.id("RememberMe"));
	    checkBox.click();
		boolean actualCheckBoxResult = checkBox.isSelected();
		System.out.println(actualCheckBoxResult);
		assertEquals(actualCheckBoxResult, expCheckBox);

		Thread.sleep(3000);
		driver.quit();

	}
}
