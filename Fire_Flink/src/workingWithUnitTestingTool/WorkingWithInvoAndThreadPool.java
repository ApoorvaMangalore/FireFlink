package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithInvoAndThreadPool {

	@Test(invocationCount = 5,threadPoolSize = 5)
	public void bmw() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw.in/en/index.html");
		Thread.sleep(2000);
		driver.quit();
	}
}
