package workingWithJs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsJs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.alert('hello')");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		jse.executeScript("window.prompt('hello')");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		jse.executeScript("window.confirm('hello')");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
