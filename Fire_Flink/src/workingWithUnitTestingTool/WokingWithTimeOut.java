package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WokingWithTimeOut {

	
	@Test(timeOut = 3000)
	public void dream11() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		//Thread.sleep(2000);
		driver.quit();
	}
}
