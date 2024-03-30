package workingWithJs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindowJs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		/*
		 * jse.executeScript("window.scrollBy(0,250)"); Thread.sleep(3000);
		 * jse.executeScript("window.scrollBy(0,500)"); Thread.sleep(3000);
		 * jse.executeScript("window.scrollBy(0,-250)"); Thread.sleep(3000);
		 */
		
		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.quit();
	}
}
