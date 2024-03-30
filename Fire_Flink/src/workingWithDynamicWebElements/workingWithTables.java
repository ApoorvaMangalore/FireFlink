package workingWithDynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithTables {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		WebElement data = driver.findElement(By.xpath("//table[@id='table1']//td[text()='Dheepthi']/.."));
		String text = data.getText();
		System.out.println(text);
		
		WebElement allData = driver.findElement(By.id("table1"));
		System.out.println(allData.getText());
		
	}
}
