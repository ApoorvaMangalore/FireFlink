package workingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithSimpleAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);

		// step 1:Switch to the alert
		Alert alert = driver.switchTo().alert();

		// Then handel that alert
		alert.accept();

		// To print the text of the alert
		System.out.println(alert.getText());

		driver.quit();

	}
}
