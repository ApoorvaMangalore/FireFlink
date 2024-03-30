package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIframeInOmayo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);

		// driver.switchTo().frame(0);//By index

		// driver.switchTo().frame("navbar-iframe");//By frame id or Name

		WebElement frame = driver.findElement(By.id("navbar-iframe"));// By frame Webelement
		driver.switchTo().frame(frame);

		driver.findElement(By.id("b-query")).sendKeys("Apoorva");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.name("textboxn")).sendKeys("Mangalore");
		Thread.sleep(3000);
		driver.quit();

	}

}
