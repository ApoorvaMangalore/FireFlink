package workingWithWebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoExplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()='Flipkart']"));
		// wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Flipkart")));
		//wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));

		element.click();
		driver.quit();

	}

}
