package workingWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WorkingWithMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.id("multiselect1"));
		Select sel = new Select(dropDown);
		System.out.println(sel.isMultiple());
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.deselectByIndex(1);
		Thread.sleep(2000);

		// sel.deselectAll();

		List<WebElement> getAllsel = sel.getAllSelectedOptions();
		for (WebElement selected : getAllsel) {
			System.out.println(selected.getText());
		}

		WebElement getFirstSel = sel.getFirstSelectedOption();
		System.out.println(getFirstSel.getText());

		List<WebElement> allOptions = sel.getOptions();
		for (WebElement op : allOptions) {
			System.out.println(op.getText());
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
