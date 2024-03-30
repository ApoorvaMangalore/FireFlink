package working_with_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithContainsText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Feel free to shop')]"));

		System.out.println(text.getText());
		Thread.sleep(2000);
		driver.quit();
	}
}
