package testngpackage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot 
{
	@Test
	public void launch() throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		//Step 1
		TakesScreenshot a1= driver;
		//Step 2
		File source=a1.getScreenshotAs(OutputType.FILE);
		//Step 3
		File destination=new File("C:\\Users\\aravi\\eclipse-workspace\\Selenium_Automation\\Screenshots\\amazonhome.png");
		FileUtils.copyFile(source, destination);
		
		/*
		TakesScreenshot a2=driver;
		File source=a2.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\aravi\\eclipse-workspace\\Selenium_Automation\\Screenshots\\amazonhomer.png");
		FileUtils.copyFile(source, destination);
		*/
		
				
}
}