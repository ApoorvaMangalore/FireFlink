package testNgProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_DemoWebshop_002 extends BaseClass {
	@Test
	public void run() throws InterruptedException {
		driver.findElement(By.id("newsletter-email")).sendKeys(emailId);
		System.out.println("User isa able to click on newsletter");
		Thread.sleep(3000);
	}
}
