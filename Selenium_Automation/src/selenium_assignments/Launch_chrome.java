package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Launch_chrome {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Css selector using tagname and class name
		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("India");
		//EdgeDriver driver = new EdgeDriver();
		//driver.get("https://www.google.com/");
		//System.out.println(driver.getTitle());;
		//driver.close();		
		//driver.quit();
		System.out.println(driver.getWindowHandle());	
		System.out.println(driver.getWindowHandles());
	
	}

}
