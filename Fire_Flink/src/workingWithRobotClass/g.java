package workingWithRobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class g {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()='Flipkart']"));
		//wait.until(ExpectedConditions.textToBePresentInElement(element, "Flipkart")));
		

	}
}
