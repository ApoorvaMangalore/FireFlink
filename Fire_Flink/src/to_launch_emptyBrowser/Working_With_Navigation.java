package to_launch_emptyBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Navigation {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(3000);
		driver.navigate().to("https://www.motorola.in/");
		//Thread.sleep(3000);
		driver.navigate().to(new URL ("https://in.via.com/"));
		
		driver.quit();
	}
}
