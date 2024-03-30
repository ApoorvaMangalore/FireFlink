package workingWithMultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChildWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(3000);

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);

		for (String eachWindow : allWindow) {
			driver.switchTo().window(eachWindow);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.name("q")).sendKeys("Books");

	}

}
