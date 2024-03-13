package Facebook;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit extends Test_data 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch() throws InterruptedException, IOException
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void Quit() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

