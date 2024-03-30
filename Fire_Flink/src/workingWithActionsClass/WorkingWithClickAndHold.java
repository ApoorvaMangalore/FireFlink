package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/drag-drop-javascript.html");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable1"));
		WebElement drop = driver.findElement(By.id("droppable1"));

		actions.clickAndHold(drag).release(drop).perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
