package workingWithPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P2 extends BaseClass {

	@Test
	public void run() throws InterruptedException {
		WebElement s = driver.findElement(By.id("small-searchterms"));
		s.sendKeys("Books");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//s.sendKeys("Books");
		driver.findElement(By.id("small-searchterms"));
		
	}

}
