package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);

		WebElement doubleClickele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		actions.doubleClick(doubleClickele).perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
