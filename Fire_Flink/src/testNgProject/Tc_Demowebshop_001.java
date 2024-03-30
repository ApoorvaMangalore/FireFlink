package testNgProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_Demowebshop_001 extends BaseClass {
	@Test
	public void validate_That_User_Is_able_to_search_product() throws InterruptedException {
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("User isa able to search the product");
	}

}
