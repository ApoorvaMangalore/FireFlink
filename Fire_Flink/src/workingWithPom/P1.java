package workingWithPom;

import org.testng.annotations.Test;

public class P1 extends BaseClass {

	@Test
	public void run() throws InterruptedException {
		BasePage bp=new BasePage(driver);
		bp.getSearchTextBox().sendKeys("Books");
		Thread.sleep(3000);
		bp.getSearchButton().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		bp.getSearchTextBox().sendKeys("simple books");
	}
}
