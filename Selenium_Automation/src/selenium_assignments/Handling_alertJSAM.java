package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_alertJSAM {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/aravi/Downloads/learningHTML1.html");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("1")).sendKeys("Hello");
	}

}
