package workingWithScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WorkingWithWebpageScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		LocalDateTime systemTime = LocalDateTime.now();
		System.out.println(systemTime);
		String scnShtTime = systemTime.toString().replace(":", "-");
		Thread.sleep(5000);
		
		TakesScreenshot tkScrSht = (TakesScreenshot)driver;
		File src = tkScrSht.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./errorShots/"+scnShtTime+".png");
		Files.copy(src, dest);
		driver.quit();
	}
}
