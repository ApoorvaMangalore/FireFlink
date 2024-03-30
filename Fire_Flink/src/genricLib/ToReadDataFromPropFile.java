package genricLib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromPropFile {

	@Test
	public void openBrowser() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Utilitymethods um=new Utilitymethods();
		String url = um.readingDataFromPropFile("./testData/data.properties", "url");
		driver.get(url);
		driver.quit();
	}
}
