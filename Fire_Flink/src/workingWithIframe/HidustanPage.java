package workingWithIframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidustanPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hindustantimes.com/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id,'google_ads_iframe_/1055314/Hindustantimes_Desktop_Across')]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.linkText("Home")).click();
		//driver.findElement(By.xpath("//div[@class='signin']")).click();
		

	}
}
