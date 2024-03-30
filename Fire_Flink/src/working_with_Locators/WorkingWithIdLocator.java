package working_with_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		WebElement radioButton = driver.findElement(By.id("gender-female"));
		radioButton.click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Apoorva");
		String attribute = firstName.getAttribute("Value");
		System.out.println(attribute);
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("Mangalore");
		Thread.sleep(3000);
		driver.quit();

	}
}
