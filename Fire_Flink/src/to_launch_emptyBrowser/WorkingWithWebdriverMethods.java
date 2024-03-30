package to_launch_emptyBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebdriverMethods {

	public static void main(String[] args) throws InterruptedException {

		// Step1: To open empty browser
		WebDriver driver = new ChromeDriver();
		// Step2: To maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//  To minimize the window
		driver.manage().window().minimize();
		Thread.sleep(3000);
	    //To fullscreen() the window
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		// it will close the window which is opened from selenium which points
		// to the that driver
		// driver.close();

		// it will close in the backend also
		Thread.sleep(3000);
		driver.quit();
	}
}
