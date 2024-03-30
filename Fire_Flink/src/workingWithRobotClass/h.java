package workingWithRobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class h {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		WebElement element = driver.findElement(By.id("loginBtn"));

		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("loginBtn"))));
		element.click();
	}
}
