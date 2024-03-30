package workingWithDynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAddToCartProduct {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books");
		Thread.sleep(3000);
		//WebElement book = driver.findElement(By.xpath("//input[@value='Add to cart']/../../../..//a[text()='Computing and Internet']"));
		//book.click();
		
		
		String value="10.00";
		
		//WebElement amount = driver.findElement(By.xpath("//a[text()='Computing and Internet']/../../../..//span[text()='10.00']"));
		WebElement amount = driver.findElement(By.xpath("//a[text()='Computing and Internet']/../../../..//span[text()='"+value+"']"));
		String text = amount.getText();
		System.out.println(text);
	}

}
