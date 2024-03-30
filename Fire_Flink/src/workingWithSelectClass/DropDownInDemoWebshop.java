package workingWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInDemoWebshop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books");
		Thread.sleep(3000);
		// Step 1
		WebElement dropDown = driver.findElement(By.id("products-orderby"));
		// Step2
		Select sel = new Select(dropDown);
		// sel.selectByIndex(1);

		// sel.selectByValue("https://demowebshop.tricentis.com/books?orderby=6");

		List<WebElement> allOptions = sel.getOptions();
		System.out.println(allOptions);

		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		driver.quit();

	}

}
