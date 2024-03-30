package workingWithScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WorkingWithWebElementScrnshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// LocalDateTime
		Thread.sleep(5000);

		// TakesScreenshot tkScrSht = (TakesScreenshot)driver;

		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		File src = search.getScreenshotAs(OutputType.FILE);
		File file = new File("./errorShots/WebElement.png");
		Files.copy(src, file);
		driver.quit();

	}
}
