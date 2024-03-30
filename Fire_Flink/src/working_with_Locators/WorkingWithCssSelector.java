package working_with_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Books");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Search']")).submit();//click()
		Thread.sleep(3000);
		driver.quit();

	}

}
