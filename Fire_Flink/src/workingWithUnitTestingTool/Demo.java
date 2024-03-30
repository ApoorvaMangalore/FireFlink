package workingWithUnitTestingTool;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Demo2.class)
public class Demo {
	public static WebDriver driver;

	@Test
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url1 = "https://demowe.tricentis.com/login";

		driver.get("https://demowebshop.tricentis.com/login");
		String currentUrl = driver.getCurrentUrl();
		assertEquals(url1, currentUrl);
		driver.quit();

	}
}
