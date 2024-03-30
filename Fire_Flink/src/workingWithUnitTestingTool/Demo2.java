package workingWithUnitTestingTool;

import java.io.File;
import java.io.IOException;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Demo2 implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " Test case start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() +" Test case pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() +" Test case is fail");
		
		
		LocalDateTime systemTime = LocalDateTime.now();
		String scrnShtTime = systemTime.toString().replace(":","-");
		System.out.println(systemTime);
		
		TakesScreenshot tk = (TakesScreenshot)Demo.driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/"+scrnShtTime+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
