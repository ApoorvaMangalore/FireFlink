package workingWithMultipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Via {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		Thread.sleep(3000);

		String year = " 2024";
		String month = "Mar";
		String date = "28";

		driver.findElement(By.id("departure")).click();
		Thread.sleep(3000);
		// WebElement date =
		// driver.findElement(By.xpath("//div[@id='depart-cal']//span[text()='
		// 2024']//span[text()='Mar']/../../..//div[text()='22']//div[contains(@class,'vc-cell-sub-text')]"));

		// WebElement date1 = driver.findElement(By
		// .xpath("//div[@id='depart-cal']//span[text()='
		// "+year+"']//span[text()='"+month+"']/../../..//div[text()='"+date+"']"));

		// date1.click();

		WebElement date1 = driver.findElement(By.xpath(
				"//div[@id='depart-cal']//span[text()=' 2024']//span[text()='Mar']/../../..//div[text()='25' and not (contains(@class,'vc-disabled-cell'))]"));
		date1.click();
	}
}
