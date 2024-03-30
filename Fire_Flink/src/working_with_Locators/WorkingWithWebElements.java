package working_with_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Apoorva");// sendKeys
		Thread.sleep(3000);
		userName.clear();// clear
		userName.sendKeys("APOORVA");
		String value = userName.getAttribute("value");// getAttribute
		System.out.println(value);
		System.out.println(userName.getTagName());// getTagName()

		String cssvalue = userName.getCssValue("color");// getCssValue()
		System.out.println(cssvalue);

		Point loc = userName.getLocation();// getLocation()
		System.out.println(loc.getX());
		System.out.println(loc.getY());

		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();

		WebElement errrorMsg = driver.findElement(By.id("spanMessage"));

		String text = errrorMsg.getText();// getText();
		System.out.println(text);

		System.out.println(loginButton.isEnabled());// isEnabled()
		System.out.println(loginButton.isDisplayed());// isDisplayed()
		System.out.println(loginButton.isSelected());// isDisplayed()
		driver.quit();

	}

}
