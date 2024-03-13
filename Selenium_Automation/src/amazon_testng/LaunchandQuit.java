package amazon_testng;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit 
{
	
	ChromeDriver driver;
@BeforeMethod
public void launch() throws InterruptedException
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
}
@AfterMethod
public void quit() throws InterruptedException
{
	Thread.sleep(5000);
	driver.quit();
}
}
