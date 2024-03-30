package workingWithWebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();

		driver.findElement(By.linkText("Flipkart")).click();
		driver.quit();

	}

}
