package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAllTheRadioButtons {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radioButtons.size());

		for (int i = 0; i < radioButtons.size(); i++) {// for loop
			radioButtons.get(i).click();
			Thread.sleep(3000);
		}

		for (WebElement button : radioButtons) {// for each loop
			button.click();
			Thread.sleep(3000);
		}
		driver.quit();
	}
}
